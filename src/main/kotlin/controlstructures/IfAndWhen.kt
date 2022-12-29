package controlstructures

import controlstructures.Color.*

open class Pet {

}

class Cat : Pet() {
    fun meow() {
        println("Meow")
    }
}

class Dog : Pet() {
    fun woof() {
        println("Woof")
    }
}

enum class Color {
    BLUE, RED, ORANGE, YELLOW, GREEN, VIOLET, INDIGO
}

fun getDescription(color: Color): String {
    return when (color) {
        BLUE -> "cold"
        ORANGE -> "mild"
        RED -> "hot"
        else -> "We dunno!"
    }
}

fun respondToInput(input: String) = when (input) {
    "y", "yes" -> "I am glad you agree"
    "n", "no" -> "Sorry to hear that"
    else -> "I don't understand"
}

fun mix(c1: Color, c2: Color) = when (setOf(c1, c2)) {
    setOf(RED, YELLOW) -> ORANGE
    setOf(YELLOW, BLUE) -> GREEN
    setOf(BLUE, VIOLET) -> INDIGO
    else -> throw Exception("Dirty color!")
}

fun getFavoritePet(which: String): Pet {
    val pet: Pet = when (which) {
        "cat" -> Cat()
        "dog" -> Dog()
        else -> throw Exception("Not a pet!")
    }
    return pet
}

fun emitPetSound() = when (val pet = getFavoritePet("dog")) {
    is Dog -> pet.woof()
    is Cat -> pet.meow()
    else -> throw Exception("Not an animal")
}

fun updateWeather(degrees: Int) {
    val (description, colour) = when {
        degrees < 5 -> "cold" to BLUE
        degrees < 23 -> "mild" to ORANGE
        else -> "hot" to RED
    }
    println("$description and $colour")
}

fun main() {
    val answer = respondToInput("yes")
    println(answer)
    emitPetSound()
    updateWeather(22)
}