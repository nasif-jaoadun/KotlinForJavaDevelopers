package com.jnasifcoding.practise
@Deprecated("use the Animal Class instead", ReplaceWith("Animal"))
class Person internal constructor(var firstName: String, var lastName: String){ //with a visibility modifier (internal)
    init {
        println("Creating a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String):
            this(firstName,lastName){
        println("Created a Person with full name $firstName $middleName $lastName")
    }
}