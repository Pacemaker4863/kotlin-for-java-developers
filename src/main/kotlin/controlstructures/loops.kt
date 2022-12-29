package controlstructures

fun main() {
    var i = 0
    while (i < 5) {
        print("while ")
        i++
    }

    println("\nafter the while i = $i")

    do {
        i--
        print("do ")
    } while (i >= 1)

    println()

    val list = listOf<String>("a", "b", "c")
    for (s in list) {
        print(s)
    }

    println()
    val map = mapOf<Int, String>(
        1 to "One",
        2 to "Two",
        3 to "three"
    )

    for ((k, v) in map) {
        println("$k mapped to $v")
    }

    for ((index, element) in list.withIndex()) {
        println("$index = $element")
    }
    println()

    val range = 1..9
    for (j in range) print(j)

    println()
    val untilWeReach = 0 until 10
    for (k in untilWeReach) print(k)

    println()
    for (l in 9 downTo 0 step 2) print(l)

    println()
    for (ch in 'a'..'z') print(ch)

    println()
    for (ch in 'a'..'d') print(ch + 1)
}