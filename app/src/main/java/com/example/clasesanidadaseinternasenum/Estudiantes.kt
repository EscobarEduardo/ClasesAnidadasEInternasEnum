//@Autor:Emerson Valenzuela
package com.example.clasesanidadaseinternasenum


class Estudiantes( val Nombre:String,var Edad:Int, val Lenguajes:Array<Lenguaje>, val amigo:Array<Estudiantes>?=null) {
    enum class Lenguaje{
        Kotlin,
        PHP,
        Java,

    }

    fun Codigo(){
            for (Lenguajes:Lenguaje in Lenguajes){
                println("Se programar en ${Lenguajes}")
            }
        }
}