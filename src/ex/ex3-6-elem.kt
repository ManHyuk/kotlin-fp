package ex

fun main(args: Array<String>) {

    println(elem(5, listOf(1, 2, 5)))
}

fun elem(num: Int, list: List<Int>): Boolean = when {
    list.isEmpty() -> false
    list.first() == num -> true
    else -> elem(num, list.drop(1))
}