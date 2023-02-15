package com.jnasifcoding.practise

class Person internal constructor(firstName: String, lastName: String){ //primary Constructor does not need any keyword "constructor" until it is have any visibility modifier or annotation
    init {
        println("Creating a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String):
            this(firstName,lastName){

    }
}