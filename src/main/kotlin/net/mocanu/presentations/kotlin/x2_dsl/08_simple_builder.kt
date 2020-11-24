package net.mocanu.presentations.kotlin.x2_dsl

data class Person(val name: String,
                  val age: Int?,
                  val address: Address?)

data class Address(val addressLine1: String?,
                   val addressLine2: String?)

fun main() {
    // [ ] write missing code so that the following is compilable
    // val person: Person = person(name = "John Doe") {
    //     age = 15
    //
    //     address = address {
    //         addressLine1 = "Barbara Strozilaan 300"
    //         addressLine2 = "1083HM, Amsterdam, Netherlands"
    //     }
    // }
    //
    // println(person)

    // [ ] refactor the code so that the following is compilable (no need to assign to "address")
    // val person: Person = person(name = "John Doe") {
    //     age = 15
    //
    //     address {
    //         addressLine1 = "Barbara Strozilaan 300"
    //         addressLine2 = "1083HM, Amsterdam, Netherlands"
    //     }
    // }
    //
    // println(person)

    // [ ] refactor to hide the "build()" method from the API (in the public API, use an interface that doesn't have this method)
}

class PersonBuilder(private val name: String) {
    var age: Int? = null
    var address: Address? = null

    fun build(): Person = Person(name, age, address)
}

class AddressBuilder {
    var addressLine1: String? = null
    var addressLine2: String? = null

    fun build(): Address = Address(addressLine1, addressLine2)
}
