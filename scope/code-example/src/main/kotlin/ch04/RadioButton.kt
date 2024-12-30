package org.example.ch04

import org.example.ch04.Button

/**
 * 4.2.1. 클래스에 기반 클래스가 있다면(Button), 주 생성자에서 기반 클래스의 생성자를 호출해야만 한다.
 */
class RadioButton: Button() { // 인자가 없으면 빈괄호가 들어간다.
}