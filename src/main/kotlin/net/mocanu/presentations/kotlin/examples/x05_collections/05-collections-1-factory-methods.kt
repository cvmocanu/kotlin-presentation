package net.mocanu.presentations.kotlin.examples.x05_collections

fun main(args: Array<String>) {
    // [ ] factory methods
    val numbers = listOf(1, 2, 3)

    // [ ] can choose implementation
    val uniqueNumbers = setOf(1, 2, 1, 3)

    // [ ] can choose implementation
    // [ ] "to" is not a keyword, it's a regular method
    val numberNames = mapOf(
            1 to "one",
            2 to "two",
            3 to "three"
    )

}