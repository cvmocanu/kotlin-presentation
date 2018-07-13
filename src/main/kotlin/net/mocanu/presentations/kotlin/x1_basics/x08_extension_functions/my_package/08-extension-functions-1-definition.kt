package net.mocanu.presentations.kotlin.x1_basics.x08_extension_functions.my_package

import org.apache.commons.lang3.StringUtils
import org.apache.commons.lang3.text.WordUtils

fun String.toTitleCase() = WordUtils.capitalizeFully(this)

fun String.removeSpaces() = StringUtils.remove(this, " ")
