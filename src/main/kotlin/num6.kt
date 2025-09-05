package org.example

import kotlin.math.sqrt

fun sqr(n: Double): Double {
    return n * n
}

fun discriminant(a: Double, b: Double, c: Double): Double {
    return sqr(b) - 4 * a * c
}

fun rootsNumber(a: Double, b: Double, c: Double): Int {
    val d = discriminant(a, b, c)
    return when {
        d > 0 -> 2
        d == 0.0 -> 1
        else -> 0
    }
}

fun quadraticRoot(a: Double, b:Double, c:Double) {
    if (a == 0.0) {
        if (b == 0.0) {
            if (c == 0.0) {
                println("Уравнение имеет бесконечно много решений")
            } else {
                println("Уравнение не имеет решений")
            }
        } else {
            val x = -c / b
            println("Линейное уравнение. Корень: х = $x")
        }
        return
    }

    val d = discriminant(a, b, c)
    val numberOfRoots = rootsNumber(a, b, c)

    println("Уравнение: ${a}x^2 + ${b}x + $c = 0")
    println("Дискриминант: $d")

    when (numberOfRoots) {
        2 -> {
            val x1 = (-b + sqrt(d)) / (2*a)
            val x2 = (-b - sqrt(d)) / (2*a)
            println("Уравнение имеет два корня:")
            println("x1: $x1")
            println("x2: $x2")
        }
        1 -> {
            val x = -b / (2 * a)
            println("Уравнение имеет один корень:")
            println("x = $x")
        }
        0 -> {
            println("Уравнение не имеет действительных корней")
        }
    }
}

fun main() {
    println("Введите коэффициент ывашего уравнени:")

    print("a = ")
    var a = readln().toDouble()
    print("b = ")
    var b = readln().toDouble()
    print("c = ")
    var c = readln().toDouble()

    print("")
    quadraticRoot(a, b, c)

}