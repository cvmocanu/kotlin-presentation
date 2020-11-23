package net.mocanu.presentations.kotlin.x2_dsl

import java.math.BigDecimal

fun main() {
    val first: BigDecimal = BigDecimal.TEN
    val second = BigDecimal("25")

    // [ ] replace with "first + second", and show that it's a simple method call (convention)
    println(
            first.add(second)
    )

    // make the following compile
    //println(
    //    1.toMyInt() + 2.toMyInt()
    //)
}

data class MyInt(val value: Int)
