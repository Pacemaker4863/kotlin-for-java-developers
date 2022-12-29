package controlstructures

import java.io.IOException
import java.lang.NumberFormatException
import kotlin.jvm.Throws

// refer to Main class in java module
@Throws(IOException::class)
fun foo() {
    throw IOException()
}

fun bar() {
    throw IOException()
}

fun main() {
    // In Kotlin, no difference between checked and unchecked exceptions

    val string: String = "18"

    val number: Int = try {
        Integer.parseInt(string)
    } catch (e: NumberFormatException) {
        return // or null could be admitted
    }

    val percentage =
        if (number in (0..100)) {
            number
        } else
            throw IllegalArgumentException(
                "A percentage argument " +
                        "must be between 0 and 100 : $number"
            )

    println(percentage)
}
