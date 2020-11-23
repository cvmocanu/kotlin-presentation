package net.mocanu.presentations.kotlin.x1_basics.x04_nullability

fun main() {
    // [ ] explain: avoid nulls as much as possible
    val house = House(
            kitchen = Room(
                    sink     = Furniture(color = "metallic gray"),
                    cupboard = Furniture(color = "white")
            ),
            livingRoom = Room(
                    sofa = Furniture(color = "gray")
            )
    )

    // [ ] get/set completion (kitchen vs livingRoom)
    // [ ] null-safe de-referencing operator (kitchen sink color)
    // val sinkColor: String? =

    // [ ] show Java alternative
                                                                                                                                                                                                                                                val sinkColorLikeInJava: String?
                                                                                                                                                                                                                                                if (house.kitchen != null && house.kitchen.sink != null) {
                                                                                                                                                                                                                                                    sinkColorLikeInJava = house.kitchen.sink.color
                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                    sinkColorLikeInJava = null
                                                                                                                                                                                                                                                }
}

data class House(val kitchen: Room? = null,
                 var livingRoom: Room? = null)

data class Room(val sink: Furniture? = null,
                val cupboard: Furniture? = null,
                val sofa: Furniture? = null)

data class Furniture(val color: String?)
