package org.example

fun funcOne(number: Int) {
    println("Первый способ")
    val lastDigit = number % 10

    var firstDigit = number
    while (firstDigit >= 10) {
        firstDigit /= 10
    }

    val sum = firstDigit + lastDigit
    println("Первая цифра: $firstDigit")
    println("Последняя цифра: $lastDigit")
    println("Сумма первой и последней цифры: $sum")
    println()
}

fun funcTwo(input: String) {
    println("Второй способ")

    var lastChar = input.last()
    var firstChar = input.first()

    var lastDigit = lastChar.digitToInt()
    var firstDigit = firstChar.digitToInt()

    val sum = firstDigit + lastDigit
    println("Первая цифра: $firstDigit")
    println("Последняя цифра: $lastDigit")
    println("Сумма первой и последней цифры: $sum")
    println()
}

fun main() {
    println("Введите целое положительное число")
    val input = readln()
    val number = input.toInt()

    funcOne(number)
    funcTwo(input)
}