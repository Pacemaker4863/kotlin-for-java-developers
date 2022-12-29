package extensions

fun List<Int>.sum(): Int {
    var result = 0
    this.forEach { i -> result += i }
    return result
}

fun main(args: Array<String>) {
    val sum = listOf(1, 2, 3).sum()
    println(sum)    // 6
}