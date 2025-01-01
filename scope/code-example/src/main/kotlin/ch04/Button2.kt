package org.example.ch04

class Button2 : Clickable,Focusable {
    override fun click() {
        println("click");
    }

    override fun showOff() {
        super<Clickable>.showOff();
        super<Focusable>.showOff();
    }

}