package org.example

fun main() {
    var count = 0
    var sum = 0.0

    println("Введите поочередно любые числа (для завершения введите 0):")

    while (true) {
        print("Число:")
        val input = readln()
        val number = input.toDouble()

        if (number == 0.0) {
            break
        }

        count++
        sum += number
    }

    println("Количество введенных чисел: $count")
    println("Общая сумма: $sum")

    if (count > 0) {
        val avr = sum / count
        println("Среднее арифметическое: $avr")
    } else {
        println("Среднее арифметическое: не определено")
    }
}