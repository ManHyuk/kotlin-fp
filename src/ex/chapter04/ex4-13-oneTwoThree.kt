package ex.chapter04

import java.lang.IllegalArgumentException


fun main() {
    val condition: (Int) -> Boolean = { it in 1..3 }
    val body: (Int) -> String = {
        when (it) {
            1 -> "one"
            2 -> "two"
            3 -> "three"
            else -> throw IllegalArgumentException("illegal arguments")
        }
    }

    val oneTwoThree = PartialFunction(condition, body)

    if (oneTwoThree.isDefinedAt(3)) {
        println("oneTwoThree(3) = ${oneTwoThree(5)}")
    } else {
        println("isDefined At return false")
    }
}