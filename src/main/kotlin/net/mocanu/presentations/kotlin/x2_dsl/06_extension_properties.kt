package net.mocanu.presentations.kotlin.x2_dsl

fun main() {
    println(
            "abc 1234 def".digitsCount
    )
}

val String.digitsCount: Int
    get() = this.count { Character.isDigit(it) }
