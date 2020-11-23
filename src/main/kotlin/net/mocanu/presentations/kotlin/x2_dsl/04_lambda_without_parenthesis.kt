package net.mocanu.presentations.kotlin.x2_dsl

fun main() {
    // [ ] note: parenthesis are not needed; this is used very much in DSLs
    // [ ] note "measureTimeMillis" and "measureNanoTime" are actually in the Kotlin standard library

    val timeTakenMillis: Long = measureTimeMillis {
        longOperation()
    }

    println("Time taken: $timeTakenMillis ms")
}

private fun longOperation() {
    for (i in 1..10_000_000) {
        Math.sqrt(
                Math.tan(
                        Math.log(
                                Math.random()
                        )
                )
        )
    }
}

private fun measureTimeMillis(block: () -> Any): Long {
    val startTime: Long = System.currentTimeMillis()

    block()

    val endTime: Long = System.currentTimeMillis()

    return endTime - startTime
}

