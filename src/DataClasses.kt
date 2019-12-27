// A data class is a structured data container
// with pre-defined toString() and other overrides
data class Student(val name: String, var year: Int)
// name is read-only property, year is mutable
val newStudent = Student("Siddartha", 1)
// Data class with properties outside the constructor
data class Professor(val name: String) {
    var isTenured: Boolean = false
}

fun main() {
    val newProfessor = Professor("Snape")
    newProfessor.isTenured = true
}