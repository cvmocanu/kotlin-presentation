package net.mocanu.presentations.kotlin.x1_basics.x10_lambdas

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

var name = ""
val nameLock = ReentrantLock()
fun main(args: Array<String>) {

    // [ ] explain: last lambda & parenthesis
    withLock(nameLock) {
        name = "A new name"
    }

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
