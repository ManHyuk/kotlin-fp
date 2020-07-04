package ex.chapter03

fun main(args: Array<String>) {

    println(replicate(3, 5))
}

fun replicate(n: Int, element: Int): List<Int> = when {
    n <= 0 -> listOf()
    else -> listOf(element) + replicate(n - 1, element)
}