package ch02.IfToWhen

import ch02.*

fun eval(e: Expr): Int =
    when (e) {
        is Num ->
            e.value
        is Sum ->
            eval(e.right) + eval(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

fun main() {
    println(ch02.EvalIf.eval(Sum(Num(1), Num(2))))
}