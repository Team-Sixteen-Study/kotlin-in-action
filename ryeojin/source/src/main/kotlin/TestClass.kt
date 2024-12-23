package ryeojin

class Student(var name: String, var age: Int)

// 확장 함수
// Student = 수신 객체 타입(receiver type)
// this = 수신 객체(receiver object)
fun Student.firstNameChar(): Char = this.name[0]

var Student.firstNameChar: Char
    get() = this.name[0]
    set(firstName: Char) {
        this.name = firstName.toString()
    }