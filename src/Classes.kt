// Class basics
class Spaceship(var name: String, val size: Int) {
    var speed: Int = 0
    fun fly() {
        speed = 100
    }
    fun isFlying(): Boolean {
        return speed > 0
    }
    // Companion object replaces static members
    companion object {
        fun newSpaceship(): Spaceship {
            return Spaceship("Falcon", 25)
        }
    }
}

class Sailor(var rank: String, var lastName: String) {
    // Class properties with accessors
    var fullName: String
        get() = "$rank $lastName"
        set(value) {
            val (firstWord, remainder) = value.split(" ", limit = 2)
            rank = firstWord
            lastName = remainder
        }
}

// Subclassing: only open classes can be subclassed
open class Crewmember(val name: String) {
    // Only open methods can be overridden
    open fun sayHello() = "Hello, I'm crewmember $name."
}
// Subclassing
class Captain(name: String): Crewmember(name) {
    override fun sayHello() = "Greetings! I am Captain $name."
}

fun main() {

    val myShip = Spaceship("Enterprice", 150)
    myShip.fly()
    val flying = myShip.isFlying()
}