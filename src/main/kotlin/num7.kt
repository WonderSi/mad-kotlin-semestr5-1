package org.example

class ArrayProcessor (private val numbers: IntArray) {
    fun getSize():Int {
        return numbers.size
    }

    fun sumOfPositiveElements(): Int {
        var sum = 0

        for (number in numbers) {
            if (number > 0) sum += number
        }

        return sum
    }

    fun productOfElements(): Int {
        if (numbers.isEmpty()) return 0
        var product = 1

        for (number in numbers) {
            product *= number
        }

        return product
    }

    fun averageValue(): Double {
        if (numbers.isEmpty()) return 0.0
        var sum = 0.0

        for (number in numbers) {
            sum += number
        }

        return sum / getSize()
    }

    fun showArray() {
        println("Массив: [${numbers.joinToString(", ")}]")
    }
}

fun main() {
    print("Введите размер массива: ")
    val size = readln().toInt()
    val userArray = IntArray(size)

    for (i in 0 until size) {
        print("Элемент ${i + 1}: ")
        userArray[i] = readln().toInt()
    }

    val userProcessor = ArrayProcessor(userArray)

    userProcessor.showArray()
    println("Сумма положительных элементов: ${userProcessor.sumOfPositiveElements()}")
    println("Произведение всех элементов: ${userProcessor.productOfElements()}")
    println("Среднее арифметическое: ${userProcessor.averageValue()}")
}