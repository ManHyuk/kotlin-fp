package ex.chapter03

fun main() {

    println(factorial(5))
}


fun factorial(n: Int, acc: Int = 1): Int = when (n) {
    0 -> acc
    else -> acc * factorial(n - 1, n * acc)

}