package intro

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) { print(character) }
    println()
}

@JvmOverloads
fun sum(a: Int = 5, b: Int = 11, c: Int = 8): Int {
    return a + b + c
}

fun main() {
    println(listOf('a', 'b', 'c').joinToString(separator = "", prefix = "(", postfix = ")"))
    displaySeparator()
    println(listOf(1, 2, 3).joinToString(postfix = "."))
    displaySeparator('#') // named params are optional
    displaySeparator('#', 12)
    displaySeparator(size = 20) // here the name is mandatory
}