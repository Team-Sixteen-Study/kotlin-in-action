package org.example

import org.example.ch04.Button2

fun main() {
    val button = Button2();
    button.showOff(); // 구현된 인터페이스의 메서드 차례로 출력됨
    button.setFocus(true);
    button.click();
}