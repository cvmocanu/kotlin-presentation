package net.mocanu.presentations.kotlin.examples.x01_beans

// [ ] explain beans (getters + setters)
// [ ] explain "val" vs "var"
// [ ] explain: prefer immutable classes
class Person(val name    : String,
             val male    : Boolean,
             var age     : Int,
             val children: List<Person> = listOf())

fun main(args: Array<String>) {
    // [ ] named parameters
    // [ ] default values (children)
    val personInstantiatedLikeInJava   = Person("George Washington", true, 53)
    val personInstantiatedLikeInKotlin = Person(name = "George Washington", male = true, age = 53)

    // [ ] explain: type inference
    // [ ] caution: put the type manually if it's not clear (e.g. you assign the result of calling a method)
    // [ ] explain: readability: no need for builders in most cases
    val person = Person(
            name     = "George Washington",
            male     = true,
            age      = 53,
            children = listOf(
                    Person(
                            name = "John Parke Custis",
                            male = true,
                            age  = 13
                    ),
                    Person(
                            name = "Eleanor Parke Custis",
                            male = false,
                            age  = 9
                    )
            )
    )
}