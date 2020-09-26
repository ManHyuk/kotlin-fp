package ex.chapter04

import java.lang.IllegalArgumentException

class PartialFunction<P, R>(
        private val condition: (P) -> Boolean,
        private val f: (P) -> R) : (P) -> R {
    override fun invoke(p: P): R = when {
        condition(p) -> f(p)
        else -> throw IllegalArgumentException("$p isn't supported.")
    }

    fun isDefinedAt(p: P): Boolean = condition(p)

    fun invokeOrElse(p: P, default: R): R = if (isDefinedAt(p)) invoke(p) else default
    fun orElse(that: PartialFunction<P, R>): PartialFunction<P, R> =
            PartialFunction({ it: P -> this.isDefinedAt(it) || that.isDefinedAt(it) },
                    { it: P ->
                        when {
                            this.isDefinedAt(it) -> this(it)
                            that.isDefinedAt(it) -> that(it)
                            else -> throw IllegalArgumentException("$it isn't defined")
                        }
                    }
            )
}

