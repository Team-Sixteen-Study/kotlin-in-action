package ch04.OpenFinalAbstractModifiers

interface Clickable {
    fun click()
    fun clickable()
    fun showOff() = println("I'm clickable!")
}

open class RichButton : Clickable { // 열린 클래스. 상속 가능
    fun disabled() {} // final 함수. 오버라이드 불가능
    open fun animate() {} // 열린 메서드. 오버라이드 가능
    override fun click() {} // 오버라이드 메서드. 기본적으로 열려있다
    final override fun clickable() {} // 오버라이드 메서드. 하위 클래스에서 오버라이드 못함
}