package net.mocanu.presentations.kotlin.x1_basics.x07_when

fun main(args: Array<String>) {
    val number = 2

    // [ ] no need for "break"
    when (number) {
        0          -> println("zero")
        1, 2, 3    -> {
            print("one, two")
            print(" or three\n")
        }
        else       -> println("something else")
    }

}
