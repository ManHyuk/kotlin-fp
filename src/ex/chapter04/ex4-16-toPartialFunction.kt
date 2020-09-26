package ex.chapter04

fun main() {
    val condition: (Int) -> Boolean = { it.rem(2) == 0 }
    val body: (Int) -> String = { "$it is even" }

    val isEven = body.toPartialFunction(condition)

    if (isEven.isDefinedAt(100)) {
        println(isEven(100))
    } else {
        println("isDefinedAt return false")
    }
}

