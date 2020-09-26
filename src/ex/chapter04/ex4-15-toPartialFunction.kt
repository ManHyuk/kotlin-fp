package ex.chapter04

fun <P, R> ((P) -> R).toPartialFunction(
        definedAt: (P) -> Boolean):
        PartialFunction<P, R> = PartialFunction(definedAt, this)