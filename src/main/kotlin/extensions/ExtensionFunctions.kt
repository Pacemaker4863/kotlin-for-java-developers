package extensions

fun String.lastChar() = this[this.length - 1]

fun String.midChar() = get(length / 2) // this can be omitted

fun main() {
    println("abc".lastChar())
    println("def".midChar())
}