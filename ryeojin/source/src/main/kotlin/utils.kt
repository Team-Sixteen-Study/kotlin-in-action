import ryeojin.Student
import ryeojin.firstNameChar as firstChar

fun print() {
    val student = Student("Ryeojin", 24)
    println(student.firstChar())
    println(student.firstChar)
}

fun main() {
    print()
}