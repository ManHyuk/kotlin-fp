package ex.chapter05.exercise

import ex.chapter05.FunList
import ex.chapter05.FunList.*

fun main() {
    val intList: FunList<Int> = Cons(1, Cons(2, Cons(3, Cons(4, Cons(5, Nil)))))
}