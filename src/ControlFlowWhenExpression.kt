fun main() {

    // Using when to choose different paths
    val year = 2010
    when (year) {
        2010 -> print("Froyo")
        2011 -> print("Ice Cream Sandwich")
        2008, 2009 -> print("The early days")
        in 2012..2015 -> {
            println("Jellybean through Marshmallow,")
            println("when things got interesting.")
        }
        else -> println("Some other era")
    }
    // Using when to set a value
    val androidEra = when (year) {
        2010 -> "Froyo"
        2011 -> "Ice Cream Sandwich"
        2008, 2009 -> "The early days"
        in 2012..2015 -> {
            print("Jellybean through Marshmallow")
            // The last expression is the block's value
            "When things got interesting"
        }
        else -> "Same other era"
    }
    // Using when with conditionals to set a value
    val catsOwned = 2
    val dogsOwned = 1
    val judgement = when {
        catsOwned == 0 -> "No cats"
        catsOwned < 0 -> {
            print("Call the cat police!")
            // The last expression is the block's value
            "Owes someone some cats"
        }
        catsOwned == 1 && dogsOwned == 1 ->
            "Seeking balance"
        catsOwned > 0 && catsOwned < 3 -> "Yay cats!"
        else -> "Cat Nirvana"
    }
}