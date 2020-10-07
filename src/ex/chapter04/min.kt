package ex.chapter04

fun main(args: Array<String>) {
    val calMin = { a: Int, b: Int -> a.coerceAtMost(b) }

    val curried = calMin.curried();
    val result = curried(4)(2)
    println("result = ${result}")
}

fun <P1, P2, R> ((P1, P2) -> R).curried(): (P1) -> (P2) -> R = { p1: P1 -> { p2: P2 -> this(p1, p2) } }