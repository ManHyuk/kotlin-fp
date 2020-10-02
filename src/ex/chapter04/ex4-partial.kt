package ex.chapter04

import java.lang.IllegalArgumentException

fun main() {
    val condition: (Int) -> Boolean = { it in 1..3 }
    val body: (Int) -> String = {
        when (it) {
            1 -> "One!"
            2 -> "Two"
            3 -> "Three"
            else -> throw IllegalArgumentException()
        }
    }

    val oneTowThree = PartialFunction(condition, body)
    if (oneTowThree.isDefinedAt(3)) {
        println("oneTowThree = ${oneTowThree(3)}")
    } else {
        println("isDefinedAt(x) return false")
    }
}