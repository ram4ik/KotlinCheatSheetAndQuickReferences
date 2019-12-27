fun main() {

    var mutable: Int = 1
    mutable = 2 // OK: You can reassign a var.

    val immutable: Double = 2.0
    // immutable = 3.0 // Error: You can't reassign a val!

    var greeting = "Hello, World!" // Inferred as String
    var catchphrase: String? = null // Nullable type

    catchphrase = "Hey, what's up, everybody?"
}