package net.mocanu.presentations.kotlin.x1_basics.x08_extension_functions

import net.mocanu.presentations.kotlin.x1_basics.x08_extension_functions.my_package.removeSpaces
import net.mocanu.presentations.kotlin.x1_basics.x08_extension_functions.my_package.toTitleCase
import org.apache.commons.lang3.StringUtils
import org.apache.commons.lang3.text.WordUtils

fun main() {
    val name = "  jOHn dOE     "

    // [ ] run & show what it prints
    // [ ] show that is safe: explicit import (added automatically by code completion)
    // [ ] show extension function declaration
    println(
            name.toTitleCase()
                .removeSpaces()
    )

    // [ ] java-style => EF is just syntactic sugar for improved readability
    println(
            removeSpaces(
                    toTitleCase(name)
            )

    )

}

private fun toTitleCase(text: String) = WordUtils.capitalizeFully(text)

private fun removeSpaces(text: String) = StringUtils.remove(text, " ")
