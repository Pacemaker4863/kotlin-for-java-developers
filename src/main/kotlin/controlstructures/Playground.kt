package controlstructures

fun isValidIdentifier(s: String): Boolean {
    return when {
        s.isNotEmpty() && s[0] in '0'..'9' -> {
            false
        }
        s.isEmpty() -> false
        '$' in s -> false
        else -> true
    }
}

fun main(args: Array<String>) {

    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}