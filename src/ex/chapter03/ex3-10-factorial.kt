package ex.chapter03

fun main() {

    println(factorial(5))
}
var memo = Array(100) { -1 }

fun factorial(n: Int): Int = when {
    n == 0 -> 1
    memo[n] != -1 -> memo[n]
    else -> {
        memo[n] = n * factorial(n - 1)
        memo[n]
    }
}