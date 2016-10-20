package net.mocanu.presentations.kotlin.examples.x07_when

fun main(args: Array<String>) {
    val number = 15
    val validNumbers = listOf(15, 25, 35)

    // [ ] evaluated top-to-bottom until the condition is satisfied
    when (number) {
        in 0..10         -> println("0-10")
        !in validNumbers -> println("invalid")
        else             -> println("$number is a valid number")
    }
}
