package com.jnasifcoding.practise

interface Vehicle{
    val MakeName: String
    fun go() {
        println("vroom , Vroom" )
    }

    fun stop(){
        println("Screeching")
    }

    fun getMpg(): Int {
        return 50
    }

    fun getDoors(): Int
}

