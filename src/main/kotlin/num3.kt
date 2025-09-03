package org.example

fun main() {
    val secretNumber = (0..10).random()
    println("Угадай число от 0 до 10")

    while(true) {
        print("Число:")
        val userNumber = readln().toInt()

        when {
            userNumber > secretNumber -> {println("Много")}
            userNumber < secretNumber -> {println("Мало")}
            else -> {
                println("Угадал")
                break
            }
        }
    }
}