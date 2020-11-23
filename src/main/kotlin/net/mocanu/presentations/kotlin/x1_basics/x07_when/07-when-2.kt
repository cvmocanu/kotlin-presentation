package net.mocanu.presentations.kotlin.x1_basics.x07_when

fun main() {
    val number = 15
    val validNumbers = listOf(15, 25, 35)

    // [ ] evaluated top-to-bottom until the condition is satisfied
    // [ ] declare "number" as "Number" and show instanceof ("number - 1" type inference)
    when (number) {
        in 0..10         -> println("0-10")
        !in validNumbers -> println("invalid")
        else             -> println("$number is a valid number")
    }
}
