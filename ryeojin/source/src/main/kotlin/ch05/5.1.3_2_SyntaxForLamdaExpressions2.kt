package ch05.SyntaxForLambdaExpressions2

fun main() {
    { println(42) }()
    run { println(42) }
}