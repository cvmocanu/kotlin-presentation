package net.mocanu.presentations.kotlin.x2_dsl

data class Node(val title: String,
                val children: List<Node> = emptyList())

fun main(args: Array<String>) {
    // [ ] make the following code compilable
    // [ ] make it so that we can specify leafs with like this: -"item 1"
    // [ ] make it so that we can use - also in front of non-leafs
    // val root: Node = "root" {
    //     "item 1" {}
    //     "item 2" {}
    //     "item 3" {
    //         "item 3.1" {}
    //         "item 3.2" {
    //             "item 3.2.1" {}
    //         }
    //         "item 3.3" {}
    //     }
    //     "item 4" {}
    // }
    //
    // println(
    //         NodeRendered.render(root)
    // )
}

//region DSL implementation (in case I forget)
//operator fun String.invoke(init: NodeBuilder.() -> Unit): Node {
//    val builder = NodeBuilder(title = this)
//
//    builder.init()
//
//    return builder.build()
//}
//
//class NodeBuilder(private val title: String) {
//
//    private val children = mutableListOf<Node>()
//
//    operator fun String.invoke(init: NodeBuilder.() -> Unit) {
//        val builder = NodeBuilder(title = this)
//
//        builder.init()
//
//        children.add(
//                builder.build()
//        )
//    }
//
//    fun build(): Node = Node(title, children)
//
//}
//endregion

object NodeRendered {

    fun render(root: Node): String {
        val destination = StringBuilder()

        render(destination, root, 0)

        return destination.toString()
    }

    private fun render(destination: StringBuilder,
                       node: Node,
                       indentLevel: Int) {
        destination.indent(indentLevel)
        destination.append(node.title).append("\n")

        for (child in node.children) {
            render(destination, child, indentLevel + 1)
        }
    }

    private fun StringBuilder.indent(indentLevel: Int) {
        val spacesPerIndentLevel = 3

        if (indentLevel < 0) {
            return
        }

        for (i in 1..(indentLevel * spacesPerIndentLevel)) {
            append(" ")
        }
    }

}
