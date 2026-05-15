package org.example

class Complejo( private var real: Double = 0.0, private var imag: Double = 0.0) {

    fun mostrar(){
        println(this.toString())
    }
    override fun toString():String{
        return "(${real},${imag})"
    }
    fun sumar(otro: Complejo): Complejo {
        return Complejo(
            real + otro.real,
            imag + otro.imag
        )
    }
    fun restar(otro: Complejo): Complejo {
        return Complejo(
            real - otro.real,
            imag - otro.imag
        )
    }
    fun multiplicar(otro: Complejo): Complejo {
        val r = real * otro.real - imag * otro.imag
        val i = real * otro.imag + imag * otro.real
        return Complejo(r, i)
    }
    fun dividir(otro: Complejo): Complejo {
        val denom = otro.real * otro.real + otro.imag * otro.imag
        val r = (real * otro.real + imag * otro.imag) / denom
        val i = (imag * otro.real - real * otro.imag) / denom
        return Complejo(r, i)
    }
}

fun main() {
    var complejo: Complejo
    complejo= Complejo(3.0, 4.0)
    println("${complejo.toString()}")
    var c2:Complejo= Complejo(1.0, 2.0)
    var c3:Complejo
    c3 = complejo.sumar(c2)
    c3.mostrar()
    var c4:Complejo
    c4 = complejo.restar(c2)
    c4.mostrar()
    var c5:Complejo
    c5 = complejo.multiplicar(Complejo(3.0, 4.0))
    c5.mostrar()
    var c6:Complejo
    c6 = complejo.dividir(Complejo(3.0, 4.0))
    c6.mostrar()
}