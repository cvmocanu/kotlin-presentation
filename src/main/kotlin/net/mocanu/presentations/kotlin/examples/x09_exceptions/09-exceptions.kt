package net.mocanu.presentations.kotlin.examples.x09_exceptions

import org.apache.commons.io.IOUtils
import org.apache.commons.io.input.AutoCloseInputStream
import java.nio.charset.StandardCharsets

fun main(args: Array<String>) {
    // [ ] basic syntax, like Java
    try {
        // some code
    } catch (e: Exception) {
        // handler
    } finally {
        // optional finally block
    }

    // [ ] throw as an expression + elvis operator

    // [ ] no checked exceptions (but you can still document and catch them)
}

/**
 * @throws IllegalArgumentException if classpath resource at ``path`` cannot be found
 */
fun loadClasspathResource(path: String): String {
    val classLoader = Thread.currentThread().contextClassLoader

    val inputStream = classLoader.getResourceAsStream(path)
            ?: throw IllegalArgumentException("classpath resource [$path] cannot be found")

    return IOUtils.toString(
            AutoCloseInputStream(inputStream),
            StandardCharsets.UTF_8
    )
}