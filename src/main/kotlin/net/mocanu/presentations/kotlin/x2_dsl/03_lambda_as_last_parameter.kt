package net.mocanu.presentations.kotlin.x2_dsl

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

var name = ""
val nameLock = ReentrantLock()

fun main(args: Array<String>) {

    // [ ] explain: last lambda & parenthesis
    // [ ] note: it looks like a language construct, but it's a normal function

    // writing
    withLock(nameLock) {
        name = "A new name"
    }

    // reading
    println(
            withLock(nameLock) { name }
    )
}

private fun <T> withLock(lock: Lock,
                         block: () -> T): T {
    try {
        lock.lock()

        return block()
    } finally {
        lock.unlock()
    }
}
