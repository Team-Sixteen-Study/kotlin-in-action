package org.example.ch07

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

// 7.19 PropertyChangeSupport 를 사용하기 위한 코드
open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}
/*
// 프로퍼티 변경 통지를 직접 구현
class Person(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    var age: Int = age
        set(newValue){
            val oldValue = field
            field = newValue
            changeSupport.firePropertyChange(
                "age", oldValue, newValue)
        }

    var salary: Int = salary
        set(newValue){ // 중복되는 setter 가 많다.
            val oldValue = field
            field = newValue
            changeSupport.firePropertyChange(
                "salary", oldValue, newValue)
        }
}
*/

// 7.21 도우미 클래스를 통해 프로퍼티 변경 통지 구현하기
/*class ObservableProperty (val propName: String, var propValue: Int,
                          val changeSupport: PropertyChangeSupport
) {
    fun getValue(): Int = propValue
    fun setValue(newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(propName, oldValue, newValue)
    }
}
// 도우미 클래스를 통해 자동으로 변경 통지 전달
class Person(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    val _age = ObservableProperty("age",age, changeSupport)
    var age: Int
        get() = _age.getValue()
        set(value) { _age.setValue(value) }

    var _salary = ObservableProperty("salary",salary, changeSupport)
    var salary: Int
        get() = _salary.getValue()
        set(value) { _salary.setValue(value) }
}
*/

// 7.22 ObservableProperty 를 프로퍼티 위임에 사용할 수 있게 바꾼 모습
class ObservableProperty (var propValue: Int, val changeSupport: PropertyChangeSupport
) {
    operator fun getValue(p:Person, prop: KProperty<*>): Int = propValue
    operator fun setValue(p:Person, prop: KProperty<*>, newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
}
class Person(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    // 7.23 위임 프로퍼티를 통해 프로퍼티 변경 통지 받기
    //var age: Int by ObservableProperty(age, changeSupport)
    //var salary: Int by ObservableProperty(salary, changeSupport)

    // 7.24 Delegates.observable 을 사용해 프로퍼티 변경 통지 구현하기
    private val observer = {
        prop: KProperty<*>, oldValue: Int, newValue: Int ->
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
    var age: Int by Delegates.observable(age, observer)
    var salary: Int by Delegates.observable(salary, observer)
}

fun main() {
    val p = Person("jkcho", 29, 3000)
    p.addPropertyChangeListener(
        PropertyChangeListener { event ->
            println("Property ${event.propertyName} changed" +
                    "from ${event.oldValue} to ${event.newValue})")
        }
    )

    p.age = 35
    p.salary = 2100
}