package net.mocanu.presentations.kotlin.x1_basics.x05_collections

fun main() {
    val numbers = listOf(1, 2, 3)

    // [ ] "listOf" returns an immutable view (show type)
    // [ ] explain: it's just a view
//    numbers.add(4)

    // [ ] mutableListOf() returns a mutable view (show type)
    // [ ] Java alternative / API: Guava immutable collections
    // [ ] explain: prefer immutable objects when you can
    val mutableNumbers = mutableListOf(1, 2, 3)
    mutableNumbers.add(4)

}
