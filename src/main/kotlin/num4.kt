package org.example

fun isPrime(num: Int): Boolean {
    var d = 2
    while (d*d <= num && num % d != 0) {
        d += 1
    }
    return d * d > num
}

fun main() {
    print("Количество простых чисел: ")
    val input = readln().toInt()

    var count = 0
    var number = 2
    while (count < input) {
        if (isPrime(number)) {
            count++
            println("$count-ое число: $number")
        }
        number++
    }
}