package ch06.SafeCallOperator

fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}

fun main() {
    printAllCaps("abc")
    printAllCaps(null)
}