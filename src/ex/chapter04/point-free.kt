package ex.chapter04

import fp.kotlin.example.chapter04.compose
import kotlin.math.pow


fun main(args: Array<String>) {

    val input = arrayListOf(1,2,3,4)

    val max: (list: List<Int>) -> Int = {list: List<Int> ->  list.max()!!}
    val power = { a: Int -> a * a }

    val result1 = power(max(input))
    println("result1 = ${result1}")

    val result2 = (power compose max)(input)
    println("result2 = ${result2}")
}

fun <F, G, R> ((F) -> R).compose(g: (G) -> F): (G) -> R {
    return { gInput: G -> this(g(gInput)) }
}
