package ex.chapter03

fun main() {

    println(factorialFP(5))
}


tailrec fun factorialFP(n: Int, acc: Int =1): Int = when (n) {
    0 -> acc
    else -> acc * factorialFP(n - 1, n * acc)

}