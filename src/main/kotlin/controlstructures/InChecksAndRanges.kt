package controlstructures

fun main() {
    fun isLetter(c: Char): Boolean = c in 'a'..'z' || c in 'A'..'Z'
    println(isLetter('1'))
    println(isLetter('g'))
    fun isNotDigit(c: Char): Boolean = c !in '0'..'9'
    println(isNotDigit('8'))
    println(isNotDigit('r'))
    fun recognize(ch: Char) = when (ch) {
        in '0'..'9' -> "It is a number"
        in 'a'..'z', in 'A'..'Z' -> "It is a letter"
        else -> "I dunno!"
    }
    println(recognize('d'))
    println(recognize('3'))
    println(recognize('^'))
    val aRange: IntRange = 1..9
    val anotherRange = 1 until 10
    val charRange: CharRange = 'a'..'z'
    val stringRange: ClosedRange<String> = "ab".."az"
    println("ae" in stringRange)
    println("Kotlin" in "Java".."Scala") // true
    println("Kotlin" in setOf("Java", "Scala")) // false
    println("ball" in "a".."k")

    class MyDate : Comparable<MyDate> {
        override fun compareTo(other: MyDate): Int {
            TODO("Not yet implemented")
        }
    }
//    val dateRange: ClosedRange<MyDate> = startDate..endDate
//    if (myDate in dateRange) print(true)
    if ('a' in listOf<Char>('a', 'b')) print("contained in the list")
}