package ex.chapter04

import java.lang.IllegalArgumentException

class PartialFunction<in P, out R>(
        private val condition: (P) -> Boolean,
        private val f: (P) -> R) : (P) -> R {


    override fun invoke(p: P): R = when {
        condition(p) -> {
            println("invoke")
            f (p)
        }
        else -> throw IllegalArgumentException("$p is not supported")
    }

    fun isDefinedAt(p: P): Boolean = condition(p)
}