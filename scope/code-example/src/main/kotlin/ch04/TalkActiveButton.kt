package org.example.ch04

import org.example.ch04.Focusable

/**
 * 4.1.3. 가시성 변경자
 */
/*
internal open class TalkActiveButton : Focusable {
    private fun yell() = println("yell!")
    protected fun whisper () = println("Let's talk!");
}

//  가시성 규칙을 위반한 경우, 접근이 불가
fun TalkActiveButton.giveSpeech () {
    yell()
    whisper()
}
*/