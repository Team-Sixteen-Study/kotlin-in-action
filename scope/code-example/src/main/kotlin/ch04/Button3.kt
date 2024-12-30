package org.example.ch04

class Button3 : View {

    override fun getCurrentState(): State = ButtonState();

    override fun restoreState(state: State) { /*...*/ }

    class ButtonState : State { /*...*/ }
}