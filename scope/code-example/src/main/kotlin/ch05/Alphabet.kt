package org.example.ch05

/**
 * 5.5. 수신 객체 지정 람다: with, apply
 * A~Z 까지의 알파벳을 만드는 함수
 */
fun alphabet(): String {
    // with 함수 적용 이전

    val result = StringBuilder()
    for(letter in 'A' .. 'Z') {
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

fun alphabetToWith() {
    val stringBuilder = StringBuilder();
    return with(stringBuilder) { // 메서드를 호출하려는 수신 객체를 지정(stringBuilder)
        for(letter in 'A' .. 'Z') {
            this.append(letter) // this 를 명시하여 앞에서 지정한 수신 객체의 메서드를 호출
        }
        append("\nNow I know the alphabet!") // this 를 생략하고 메서드를 호출
        this.toString() // 람다에서 값을 반환
    }
}
fun alphabetToApply() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()

// buildString 함수를 사용하여 수신 객체 지정 람다와 비슷한 패턴으로 활용(DSL)
fun alphabetToBuildString () = buildString {
    for(letter in 'A' .. 'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}