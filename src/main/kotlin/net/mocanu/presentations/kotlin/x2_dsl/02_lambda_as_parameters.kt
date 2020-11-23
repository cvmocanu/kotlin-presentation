package net.mocanu.presentations.kotlin.x2_dsl

fun main() {
    val numbers = listOf(1, 4, 3, 7, 9, 5, 8)

    // [ ] write findFirst(list, lambda) that returns the first item from the list, or null if not found
    // [ ] show that we can put the last lambda outside the parenthesis
    // [ ] show that Kotlin already has "firstOrNull"
    println(
            findFirstOrNull(numbers, { it > 5 })
    )
}

//region firstFirst function definition
fun <T: Comparable<T>> findFirstOrNull(list: List<T>,
                                       predicate: (item: T) -> Boolean): T? {
    for (item in list) {
        if (predicate(item)) {
            return item
        }
    }

    return null
}
//endregion
