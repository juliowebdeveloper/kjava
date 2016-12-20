package com.shido.kotlin

/**
 * Created by Teste2 on 19/12/2016.
 */
class Meeting(val title: String) {

//Em Kotlin nao temos getters and setters
    var location = ""

    @JvmField //diz que description é um campo publico
    var description = ""


    //Como não existe a clausula throws, o java não saberia dizer que esse metodo lança uma exception
    //por isso é necessario fzer essa anotação para que possamos utilizar no java
    @Throws(MeetingException::class)
    fun addAttendee(a: String){
        if(a.isNullOrEmpty()) throw MeetingException("Attendee must not be null")
    }

    companion object{
        @JvmField
        val APP_VERSION = 1

        @JvmStatic
        fun getAppVersion(): Int{
            return APP_VERSION
        }
    }



    class MeetingException(message:String) : Exception(message){

    }

}