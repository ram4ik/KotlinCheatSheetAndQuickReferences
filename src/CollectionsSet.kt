fun main() {

    // Sets ignore duplicate items, so immutableSet has 2 items: "chocolate" and "vanilla"
    val immutableSet = setOf<String>("chocolate", "vanilla", "chocolate")
    val mutableSet = mutableSetOf("butterscotch", "strawberry")
    // One way to test membership
    val hasChocolate1 = "chocolate" in immutableSet
    // Another way to test membership
    val hasChocolate2 = immutableSet.contains("chocolate")
    mutableSet.add("green tea") // Add item
    // Delete by value
    val flavorWasRemoved = mutableSet.remove("strawberry")
}