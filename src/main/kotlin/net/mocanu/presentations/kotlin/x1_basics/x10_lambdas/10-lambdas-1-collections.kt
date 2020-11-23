package net.mocanu.presentations.kotlin.x1_basics.x10_lambdas

fun main() {
    val colors = listOf("yellow", "green", "cyan", "red", "crimson")

    // [ ] tell & show: lambda as the last parameter (outside of parenthesis + omit parenthesis)
    // [ ] show "dependencies" in gradle
    // [ ] explain "it"
    // [ ] explain what it does
    // [ ] replace with method references
    println(
            colors.filter   { it.endsWith("n") }
                  .sortedBy { color -> color.length }
                  .map      { it.toUpperCase() }
    )

}
