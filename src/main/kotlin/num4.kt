package org.example

fun main() {
    print("Количество простых чисел: ")
    val input = readln().toInt()
    
    for (n in 1..input) {
        println("$n-ое число: ${n+1}")
    }
}