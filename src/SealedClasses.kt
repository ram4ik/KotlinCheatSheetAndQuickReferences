// Like enum classes, but can make multiple instances
sealed class Shape {
    class Circle(val radius: Int): Shape()
    class Square(val sideLength: Int): Shape()
}

fun main() {
    val circle1 = Shape.Circle(3)
    val circle2 = Shape.Circle(42)
    val square = Shape.Square(5)
}