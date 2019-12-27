fun main() {

    fun sayHi() { // A Unit function
        println("Hello")
    }
    // Function with parameters
    fun sayHello(name: String) {
        println("Hello, $name!")
    }
    // Function with default arguments
    fun createCat(name: String = "Kitty", age: Int, isSpayed: Boolean = false) {
        print("$name / $age / $isSpayed")
    }
    createCat(age = 1) // Using just the non-default argument
    createCat("Fluffy", 2, true) // One way to call a function
    // Calling a function with named arguments
    createCat(age = 2, isSpayed = true, name = "Fluffy")
    // Function with parameters and return value
    fun total(x: Int, y: Int): Int {
        return x + y
    }
    // A function as a single expression
    fun product(x: Int, y: Int) = x * y
    // A function that accepts another function
    fun doMath(mathOperation: (Int, Int) -> Int, a: Int, b: Int): Int {
        return mathOperation(a, b)
    }
    // Calling a function that accepts another function
    val add = doMath(::total, 2, 3)
    val multiply = doMath(::product, 2, 3)
}