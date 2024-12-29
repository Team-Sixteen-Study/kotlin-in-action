package ch04.interfacesInKotlin

interface Clickable {
    fun click()
}

class Button: Clickable {
    override fun click() = println("I was clicked")
}

fun main() {
    Button().click()
}