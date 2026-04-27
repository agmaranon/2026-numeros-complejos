package org.example
import kotlin.random.Random

class Complejo {
    private var real: Int = 0
    private var imaginario: Int = 0

    fun ponerValor(real: Int, imaginario: Int): String {
        return  "($real, $imaginario)"
    }
}

fun main() {
    println(Complejo().ponerValor(Random.nextInt(1, 10), Random.nextInt(1, 10)))
    println ("hola mundo")
}