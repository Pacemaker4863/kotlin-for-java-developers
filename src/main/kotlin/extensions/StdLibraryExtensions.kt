package extensions

val set = hashSetOf<Int>(1, 3, 5)
val list = arrayListOf(8, 6, 47)
val map = hashMapOf(
    1 to "one",
    2 to "two",
    3 to "three"
)

fun main() {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    // examples
    println(list.joinToString())

    val list = listOf("abc")
    println(list.getOrNull(0))
    println(list.getOrNull(1))

    for ((index, element) in list.withIndex()) println("$index $element")

    // until is an extension
    val rangeWithUntil = 1.until(10)
    println(rangeWithUntil)
    // to is an extension that returns a Pair e.g.
    val pair = "Answer".to(24)
    println(pair)

    println('a'.isLetter())
    println('2'.isDigit())

    val q = """To code,
        |or not to code?...
    """

    val a = """
        Keep calm
        and learn Kotlin
    """

    println(q.trimMargin())
    println(a.trimIndent())

    // regular expressions
    val regex = "\\d{2}\\.\\d{2}\\.\\d{4}".toRegex()
    val simplerRegex = """\d{2}\.\d{2}\.\d{2}""".toRegex()
    println(regex.matches("24.12.2022"))
    println(simplerRegex.matches("24.12.22"))

    // conversions
    println("123".toInt())
    println("1e-3".toDouble())

    assert("xx".toIntOrNull() == null)

}