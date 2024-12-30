package org.example.ch04

import org.example.ch04.Clickable

/**
 * 4.1.2. 열린 메서드를 포함하는 열린 클래스 정의
 */
open class RichButton : Clickable { // 해당 클래스는 열려있으며, 다른 클래스가 해당 클래스를 상속할 수 있다.
    fun disable() {} // 코틀린에서 해당 함수는 기본적으로 final 이다.

    open fun animate(){} // 해당 함수는 열려있으며, 하위 클래스에서 해당 메서드 오버라이드가 가능하다.
    override fun click() {} // 오버라이드한 메서드는 기본적으로 열려있다.
    // final override fun click(){} // 오버라이드 금지를 위해서는 final 키워드를 명시적으로 붙여야만 한다.
}