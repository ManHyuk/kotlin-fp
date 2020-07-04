package ex

fun main(args: Array<String>) {

    print(toBinary(10))
}


fun toBinary(n: Int): String = when {
    n < 2 -> n.toString()
    else -> toBinary(n / 2) + (n % 2).toString()
}