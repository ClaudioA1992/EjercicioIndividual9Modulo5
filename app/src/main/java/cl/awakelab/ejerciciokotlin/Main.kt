package cl.awakelab.ejerciciokotlin


fun main() {
//    println("Hola mundo!")
//
//    val input = readLine()
//
//    println("El valor ingresado es $input")
//
//    val numero = "10" // INMUTABLE
//    var otroNumero = 10 // MUTABLE
//    println(numero)
//
//    val myString = "hola, soy un string"
//    println("la variable myString tiene ${myString.length} caracteres")

    println("Ingresa el valor")
    val inputCelcius = readLine()!!.toDouble()

    val farenheit = (inputCelcius*9.0/5.0) + 32

    println(farenheit)

    val kelvin = inputCelcius + 273.15

    println(kelvin)

    val farenheitToKelvin = 5.0/9.0 * (farenheit - 32) + 273.15

    println(farenheitToKelvin)

}
