package model

class OperacionesMatematicas() {

    //funcion para sumar dos numeros y retornar el resultado
    fun sumar(numero1: Int, numero2: Int): Int {


        var primerNumero: Int = numero1
        var segundoNumero: Int = numero2
        return primerNumero + segundoNumero

    }

    //funcion para restar dos numeros y retornar el resultado
    fun restar(numero1:Int, numero2:Int):Int{
        var primerNumero:Int=numero1
        var segundoNumero:Int=numero2


        return primerNumero - segundoNumero
    }

    //funcion para multiplicar dos numeros y retornar el resultado
    fun multiplicar(numero1:Int, numero2:Int):Int{
        var primerNumero:Int=numero1
        var segundoNumero:Int=numero2


        return primerNumero * segundoNumero
    }

    //funcion para dividir dos numeros y retornar el resultado
    fun dividir(numero1:Int, numero2:Int):Int{


            var primerNumero:Int=numero1
            var segundoNumero:Int=numero2
            return primerNumero / segundoNumero
    }
}