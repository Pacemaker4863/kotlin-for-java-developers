package intro

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun min(a: Int, b: Int): Int = if (a < b) a else b // Returned Int is optional

fun displayMax(a: Int, b: Int): Unit { // Unit is optional
    println(max(a, b))
}

fun displayMin(a: Int, b: Int): Unit = println(min(a, b)) // Unit is optional

fun main() {
    displayMax(5, 9)
    displayMin(100, 2)
}