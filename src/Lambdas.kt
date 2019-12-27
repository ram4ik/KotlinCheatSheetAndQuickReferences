fun main() {

    // Lambda
    val adder: (Int, Int) -> Int = { x, y -> x + y }
    // Lambda with single parameter: it keyword
    val square: (Int) -> Int = { it * it }
    // Passing a lambda to a function
    // val addWithLambda = doMath(adder, 2, 3)
}