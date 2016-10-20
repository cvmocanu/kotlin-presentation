package net.mocanu.presentations.kotlin.examples.x06_loops

fun main(args: Array<String>) {
    // [ ] for with "in" operator (must implement iterator())
    val numbers = listOf(1, 2, 3, 5, 8, 13)
    for (number in numbers) {
        println(number)
    }

    // [ ] loop with index
    for ((index, number) in numbers.withIndex()) {
        println("$index ==> $number")
    }

    // [ ] destructuring Map.Entry
    val numberNames = mapOf(
            1 to "one",
            2 to "two",
            3 to "three"
    )
    for ((number, name) in numberNames) {
        println("The name of $number is '$name'")
    }

}