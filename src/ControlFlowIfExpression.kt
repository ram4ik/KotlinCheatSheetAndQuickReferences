fun main() {

    // Using if to choose different paths
    var condition = true
    if (condition) {
        // If condition is true, this gets executed
    } else {
        // If condition if false, this gets executed
    }
    // Using if to set a value
    val x = 100
    val y = 1
    val more = if (x > y) x else y // more == 100
    val less = if (x < y) {
        print("x is smaller.")
        x // The last expression is the black's value
    } else {
        print("y is smaller.")
        y
    }
}