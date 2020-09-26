package ex.chapter04


fun main() {
    val isEven = PartialFunction<Int, String>({ it % 2 == 0 }, { "$it is even!" })
    if (isEven.isDefinedAt(100)) {
        println(isEven(100))
    } else {
        println("isDefinedAt return false")
    }
}