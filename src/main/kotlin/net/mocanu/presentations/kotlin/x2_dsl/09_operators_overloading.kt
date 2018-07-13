package net.mocanu.presentations.kotlin.x2_dsl

import java.math.BigDecimal

fun main(args: Array<String>) {
    val first: BigDecimal = BigDecimal.TEN
    val second = BigDecimal("25")

    // [ ] replace with "first + second", and show that it's a simple method call (convention)
    println(
            first.add(second)
    )
}