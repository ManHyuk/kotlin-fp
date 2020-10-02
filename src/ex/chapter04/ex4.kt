package ex.chapter04


fun main(args: Array<String>) {
    val sum: (Int, Int) -> Int = { a, b -> a + b }
    val minus: (Int, Int) -> Int = { a, b -> a - b }

    println("sum = ${hoc(sum, 1, 2)}")
    println("minus = ${hoc(minus, 2, 3)}")
    println("twice sum = ${hoc({ a, b -> (a + b) * 2 }, 1, 2)}")



}

fun hoc(func: (Int, Int) -> Int, x: Int, y: Int): Int = func(x, y)