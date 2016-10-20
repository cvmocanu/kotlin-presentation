package net.mocanu.presentations.kotlin.examples.x04_nullability

fun main(args: Array<String>) {
    val nullableName: String? = getName()
    var name        : String = ""

    // [ ] compiler error to assign nullable type to not-null variable
    // [ ] add if + explain auto-cast + show manual cast + explain limits (make nullableName var and put it outside; show IntelliJ error message)
    // [ ] remove if + show elvis operator
    //name = nullableName

}

private fun getName(): String? {
    return "Hi"
}
