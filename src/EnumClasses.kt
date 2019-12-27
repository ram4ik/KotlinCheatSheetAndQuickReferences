enum class Taste {
    SWEET, SOUR, SALTY, BITTER, UMAMI
}

fun main() {
    val vinegarTaste: Taste = Taste.UMAMI
    // Iterating through an enum class
    for (flavor in Taste.values()) {
        println("Taste: ${flavor.ordinal}: ${flavor.name}")
    }
}