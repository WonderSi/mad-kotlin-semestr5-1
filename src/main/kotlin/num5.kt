package org.example

fun findLocalMaximumFor(array: IntArray) {
    for (i in 1 until array.size-1) {
        if (array[i] > array[i-1] && array[i] > array[i+1]) {
            println("Элемент на позиции $i: ${array[i]} ")
        }
    }
}
fun findLocalMaximumWhile(array: IntArray) {
    var i = 1

    while (i < array.size-1) {
        if (array[i] > array[i-1] && array[i] > array[i+1]) {
            println("Элемент на позиции $i: ${array[i]} ")
        }
        i++
    }
}
fun findLocalMaximumForEach(array: IntArray) {
    array.forEachIndexed { i, value ->
        if (i > 0 && i < array.size-1) {
            if (value > array[i-1] && value > array[i+1]) {
                println("Элемент на позиции $i: ${array[i]} ")
            }
        }
    }
}

fun calculateStatsFor(array: IntArray) {
    var product = 1
    var min = array[0]
    var max = array[0]

    for (i in array.indices) {
        product *= array[i]
        if (array[i] < min) {min = array[i]}
        if (array[i] > max) {max = array[i]}
    }

    println("Произведение: $product")
    println("Минимум: $min")
    println("Максимум: $max")
}

fun calculateStatsWhile(array: IntArray) {
    var product = 1
    var min = array[0]
    var max = array[0]
    var i = 0

    while (i < array.size) {
        product *= array[i]
        if (array[i] < min) {min = array[i]}
        if (array[i] > max) {max = array[i]}
        i++
    }

    println("Произведение: $product")
    println("Минимум: $min")
    println("Максимум: $max")
}

fun calculateStatsForEach(array: IntArray) {
    var product = 1
    var min = array[0]
    var max = array[0]

    array.forEach { element ->
        product *= element
        if (element < min) {min = element}
        if (element > max) {max = element}
    }

    println("Произведение: $product")
    println("Минимум: $min")
    println("Максимум: $max")
}

fun calculateStatsReduce(array: IntArray) {
    var product = array.reduce { acc, element -> acc * element }
    var min = array.reduce { acc, element -> if (element < acc ) element else acc }
    var max = array.reduce { acc, element -> if (element > acc ) element else acc }

    println("Произведение: $product")
    println("Минимум: $min")
    println("Максимум: $max")
}

fun calculateStatsMinMax(array: IntArray) {
    val product = array.reduce { acc, element -> acc * element }
    val min = array.min()
    val max = array.max()

    println("  Произведение: $product")
    println("  Минимум: $min")
    println("  Максимум: $max")
}

fun main() {
    println("Введите кол-во целых чисел в массиве: ")
    val countArray = readln().toInt()
    val array = IntArray(countArray)

    println("Введите $countArray целых чисел: ")
    for (i in 0 until countArray) {
        print("Элемент ${i+1}: ")
        array[i] = readln().toInt()
    }

    println("Полученный массив: ${array.contentToString()}")

    println("findLocalMaximumFor()")
    findLocalMaximumFor(array)
    println("findLocalMaximumWhile()")
    findLocalMaximumWhile(array)
    println("findLocalMaximumForEach()")
    findLocalMaximumForEach(array)

    println("calculateStatsFor()")
    calculateStatsFor(array)
    println("calculateStatsWhile()")
    calculateStatsWhile(array)
    println("calculateStatsForEach()")
    calculateStatsForEach(array)
    println("calculateStatsReduce()")
    calculateStatsReduce(array)
    println("calculateStatsMinMax()")
    calculateStatsMinMax(array)
}

