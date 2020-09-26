package ex.chapter03


fun main() {

//    val list = listOf(1,2,3,4,5,6,7,8,9)
//    maximum(list)
    println(factorial1(5, 2))
}

fun maximum(items: List<Int>): Int = when {
    items.isEmpty() -> error("empty list")
    items.size == 1 -> {
        println("item[0] = ${items[0]}, maxVal: ${items[0]}")
        items[0]
    }
    else -> {
        val head = items.first()
        val tail = items.last()
        val maxValue = maximum(listOf(tail))
        println("head = ${head}, maxval : $maxValue")
        if (head > maxValue) head else maxValue
    }
}


fun factorial1(n: Int, acc: Int = 1): Int = when (n) {
    0 -> acc
    else -> factorial1(n - 1, n * acc)
}