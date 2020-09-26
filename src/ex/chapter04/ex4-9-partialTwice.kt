package ex.chapter04

import java.lang.IllegalArgumentException

fun main() {
    fun twice(x: Int) = x * 2

    fun partialTwice(x: Int) = if (x < 100) twice(x) else throw IllegalArgumentException()



    partialTwice(99)
}

