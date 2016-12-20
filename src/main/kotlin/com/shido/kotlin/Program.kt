package com.shido.kotlin

import com.shido.kjava.Person

/**
 * Created by Teste2 on 19/12/2016.
 */
class Program {

    companion object{
        @JvmStatic //dizer à JVM que é um metodo estatico
        fun main(args: Array<String>) {
            val p = Person()
            //não precisa de setters ou getters
            //p.name = "Kevin"
            p.age = 64
            println("${p.name} --- ${p.age}")

            try{
                p.name=""

            }catch(e: Exception){
                println(e)
            }

            val partner = p.partner
            println(partner?.name)
        }
    }



    class Student : Person(){

    }

}