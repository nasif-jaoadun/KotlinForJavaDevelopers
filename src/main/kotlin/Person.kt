package com.jnasifcoding.practise

class Person internal constructor(firstName: String, lastName: String){ //with a visibility modifier (internal)
    init {
        println("Creating a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String):
            this(firstName,lastName){

    }
}