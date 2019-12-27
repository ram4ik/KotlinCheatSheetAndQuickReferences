fun main() {

    var name: String? = null // Can hold a String or null

    // Safe cast operator ?.
    // length1 contains name's length if name isn't null; null otherwise
    val length1: Int? = name?.length

    // Elvis operator ?:
    //length1 contains name's length if name isn't null; 0 otherwise
    val length2: Int = name?.length ?: 0
    // The Elvis operator can also execute statements in the case of null values.
    val length3 = name?.length ?: return

    // Non-null assertion operator !!
    name = "Francis"
    val length4: Int = name!!.length // Works if name isn't null; crashes otherwise

    // Smart casts and checking for null
    var nonNullableAuthor: String
    var nullableAuthor: String?
    if (name != null) { // Checking for null
        nonNullableAuthor = name // Smart cast to String
    } else {
        nullableAuthor = name // Smart cast to String?
    }
}