package intro

fun main(args: Array<String>) {
    println("Hello, ${if (args.isNotEmpty()) args[0] else "Kotlin"}!")
}