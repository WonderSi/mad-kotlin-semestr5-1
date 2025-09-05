package org.example

open class Vehicle() {
    open val name: String = "ABOBA"
    open val speed: Int = 0
    open fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    open fun stop() {
        println("$name остановился")
    }
}

class Boat: Vehicle() {
    override val name: String = "Лодка"
    override val speed: Int = 30
    override fun start() {
        println("$name начинает движение по воде со скорость $speed км/ч")
    }
    override fun stop() {
        println("$name остановилась")
    }
}

class Airplane: Vehicle() {
    override val name: String = "Самолет"
    override val speed: Int = 900
    override fun start() {
        println("$name взлетает и набирает высоту со скоростью $speed км/ч")
    }
    override fun stop() {
        println("$name заходит на посадку и приземляется")
    }
}

class Tank: Vehicle() {
    override val name: String = "Танк"
    override val speed: Int = 60
}

fun main() {
    val boat = Boat()
    val airplane = Airplane()
    val tank = Tank()

    println("Лодка")
    boat.start()
    boat.stop()
    println()

    println("Самолет")
    airplane.start()
    airplane.stop()
    println()

    println("Танк")
    tank.start()
    tank.stop()
    println()

    println("Сравнение скоростей")
    println("${boat.name}: ${boat.speed} км/ч")
    println("${airplane.name}: ${airplane.speed} км/ч")
    println("${tank.name}: ${tank.speed} км/ч")
    println()
}