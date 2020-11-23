package net.mocanu.presentations.kotlin.x2_dsl

fun main() {
    val name = "Kotlin"

    // [ ] show and explain the following
    // [ ] explain disadvantages & re-write buildString() to accept a lambda with receiver
    // [ ] explain: the ability to control the scope (the "this") inside a particular block is used very much in DSLs
    // [ ] show "dependencies" in Gradle
    // [ ] tell: buildString is already part of Kotlin stdlib
    val text: String = buildString {
        it.append("Hello, ")
        it.append(name)
        it.append("!")
    }

    println(text)
}

fun buildString(block: (result: StringBuilder) -> Unit): String {
    val result = StringBuilder()

    block(result)

    return result.toString()
}

