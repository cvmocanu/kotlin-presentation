package net.mocanu.presentations.kotlin.examples.x02_data_class

// [ ] explain data classes
data class Person(val name: String,
                  val male: Boolean,
                  val age: Int,
                  val children: List<Person> = listOf())
