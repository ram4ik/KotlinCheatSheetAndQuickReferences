package kotlin_examples

fun main() {

    val range = 1..5
    for (i in range) {
        println(i)
    }

    val charRange = 'a'..'z'
    val stringRange = "ABC".."XYZ"

    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("CCCCC" in stringRange)

    val backwardRange = 5.downTo(1)
    println(5 in backwardRange)

    val stepRange = 3..15
    for (n in stepRange) {
        println(n)
    }
    val stepThree = stepRange.step(3)
    val reversedRange = range.reversed()

    for (i in reversedRange) {
        println(i)
    }

    for (num in 1..20 step 4) {
        println(num)
    }

    for (i in 20 downTo 15) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

    val seasons = arrayOf("spring", "summer", "winter", "fall")
    for (index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }

    for (season in seasons) {
        println(season)
    }


    val str = "Hello"
    println("e" in str)
    println("D" !in str)
}