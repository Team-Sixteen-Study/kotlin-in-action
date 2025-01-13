package ch06.AddValidNumbers

import java.io.BufferedReader
import java.io.StringReader

fun readNumbers(reader: BufferedReader): List<Int?> {
    val result = ArrayList<Int?>()
    for (line in reader.lineSequence()) {
        try {
            val number = line.toInt()
            result.add(number)
        }
        catch (e:NumberFormatException) {
            result.add(null)
        }
//        result.add(line.toIntOrNull())
    }
    return result
}

fun addValidNumbers(numbers: List<Int?>) {
    var sumOfValidNumbers = 0
    var invalidNumbers = 0
    for (number in numbers) {
        if (number != null) {
            sumOfValidNumbers += number
        } else {
            invalidNumbers++
        }
    }
    println("sumOfValidNumbers = ${sumOfValidNumbers}")
    println("invalidNumbers = ${invalidNumbers}")
}

fun addValidNumbersWithFilter(numbers: List<Int?>) {
    val validNumbers = numbers.filterNotNull()
    println("sumOfValidNumbers = ${validNumbers.sum()}")
    println("invalidNumbers = ${numbers.size - validNumbers.size}")
}

fun main() {
    val reader = BufferedReader(StringReader("1\nabc\n42"))
    val numbers = readNumbers(reader)
    addValidNumbers(numbers)
    addValidNumbersWithFilter(numbers)
}