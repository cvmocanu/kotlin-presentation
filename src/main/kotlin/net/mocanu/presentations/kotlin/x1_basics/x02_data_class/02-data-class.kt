package net.mocanu.presentations.kotlin.x1_basics.x02_data_class

// [ ] explain data classes
// [ ] show kotlin decompiler
data class Person(val name: String,
                  val male: Boolean,
                  val age: Int,
                  val children: List<Person> = listOf())

fun main() {
    val man = Person("John Doe", male = true, age = 53)

    // [ ] show copy
    val woman = man.copy(
        name = "Jane Doe",
        male = false
    )
}
