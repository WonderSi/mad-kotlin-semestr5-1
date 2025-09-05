package org.example

import kotlin.math.sqrt

class Vector(val x: Int, val y: Int, val z: Int) {
    fun length(): Double {
        return sqrt((x * x + y * y + z * z).toDouble())
    }

    fun scalarProduct(other:Vector): Int {
        return this.x * other.x + this.y * other.y + this.z * other.z
    }

    infix fun dot(other: Vector): Int {
        return scalarProduct(other)
    }

    operator fun times(other: Vector): Int {
        return scalarProduct(other)
    }

    fun showVector(): String {
        return "Vector($x, $y, $z)"
    }
}

fun scalarProduct(vector1: Vector, vector2: Vector): Int {
    return vector1.x * vector2.x + vector1.y * vector2.y + vector1.z * vector2.z
}

fun main() {
    println("Введите координаты первого вектора")
    print("x1 = ")
    val x1 = readln().toInt()
    print("y1 = ")
    val y1 = readln().toInt()
    print("z1 = ")
    val z1 = readln().toInt()

    println("Введите координаты второго вектора")
    print("x2 = ")
    val x2 = readln().toInt()
    print("y2 = ")
    val y2 = readln().toInt()
    print("z2 = ")
    val z2 = readln().toInt()

    val userVector1 = Vector(x1,y1,z1)
    val userVector2 = Vector(x2,y2,z2)

    println("Длины векторов")
    println("Длина вектора 1: ${userVector1.length()}")
    println("Длина вектора 2: ${userVector2.length()}")

    println("Операции")
    println("1. Метод scalarProduct(): ${userVector1.scalarProduct(userVector2)}")
    println("2. Инфиксная запись dot: ${userVector1.dot(userVector2)}")
    println("3. Оператор *: ${userVector1 * userVector2}")
    println("4. Ф-ция вне класса: ${scalarProduct(userVector1, userVector2)}")

}