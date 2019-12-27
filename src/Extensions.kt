fun main() {

    // Add the "fizzbuzz()" function to the Int class
    fun Int.fizzBuzz(): String {
        return when {
            this % 3 == 0 -> "fizz"
            this % 5 == 0 -> "buzz"
            this % 15 == 0 -> "fizzbuzz"
            else -> this.toString()
        }
    }

    print(6.fizzBuzz()) // Prints "fizz"
    print(8.fizzBuzz()) // Prints "8"
    // Add the "absValue" property to the Int class
    //val Int.absValue: Int
    //get() = abs(this)
    //print((-3).absValue) // Prints "3"
}