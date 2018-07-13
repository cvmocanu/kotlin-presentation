package net.mocanu.presentations.kotlin.x1_basics.x03_string_templates

fun main(args: Array<String>) {
    val name = args[0]
    val age  = args[1].toInt()

    // [ ] explain $age
    // [ ] explain $ expressions
    // [ ] caution: introduce local variables if the expression is too complicated
    println("${name.toUpperCase()} is $age years old!")
}