fun main() {

    // Iterate over list or set
    var listOrSet = listOf("One", "Two", "Three", "Four")
    for (item in listOrSet) {
        println(item)
    }
    // Iterate over map
    var myMap = mapOf(1 to "One", 2 to "Two", 3 to "Three", 4 to "Four")
    for ((key, value) in myMap) {
        println("$key -> $value")
    }
    // Iterating over ranges
    for (i in 0..10) {} // 0 to 10
    for (i in 0 until 10) {} //0 to 9
    for (i in 1..10 step 2) {} // 1, 3, 5, 7, 9
    for (i in 10 downTo 1) {} // 10 to 1
    // while and do while
    var x = 0
    while (x < 10) {
        x++
        println(x)
    }
    do {
        x--
        println(x)
    } while (x > 0)
}