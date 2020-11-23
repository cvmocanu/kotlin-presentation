package net.mocanu.presentations.kotlin.x2_dsl

fun main() {
    val colors = listOf("yellow", "green", "cyan", "red", "crimson")

    // [ ] explain "it"
    // [ ] explain what it does
    // [ ] replace with method references
    println(
            colors.filter   { it.endsWith("n") }
                  .sortedBy { color -> color.length }
                  .map      { it.toUpperCase() }
    )

}
