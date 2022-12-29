package extensions

import controlstructures.foo

open class Parent
class Child : Parent()

fun Parent.foo() = "Parent"
fun Child.foo() = "Parent"

// extensions cannot be overriden
fun String.get(index: Int) = '*'
// but overloaded
fun String.get() = '*'

fun main() {
    val parent: Parent = Child()
    println(parent.foo())
    println("abc".get())
}