package ex.chapter04

fun multiThree(a: Int) = { b: Int -> { c: Int -> a * b * c } }
fun multiThree(a: Int, b: Int, c: Int): Int = a * b * c

fun main(args: Array<String>) {
    println("multiThree(1,2,3) = ${multiThree(1, 2, 3)}")

    val partial1 = multiThree(1)
    println("partial1 = ${partial1}")
    val partial2 = partial1(2)
    println("partial2 = ${partial2}")
    val partial3 = partial2(3)
    println("partial3 = ${partial3}")

    println("multiThree(1)(2)(3) = ${multiThree(1)(2)(3)}")
}