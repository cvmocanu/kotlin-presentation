package net.mocanu.presentations.kotlin.examples.x06_loops

fun main(args: Array<String>) {
    // [ ] loop over a progression (interval inclusive at both ends)
    // [ ] ".." calls "rangeTo" on Int => show
    // [ ] no more primitives
    for (number in 1..100) {
        println(number)
    }

    // [ ] exclusive end
    // [ ] "until" is a method
    for (number in 1 until 101) {
        println(number)
    }

    // [ ] fancy progression
    // [ ] "downTo" and "step" are methods
    for (number in 100 downTo 0 step 2) {
        println(number)
    }

}