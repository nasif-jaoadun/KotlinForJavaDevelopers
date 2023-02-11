fun main(args: Array<String>){
    println("Hello World")

    //val is immutable, like final variable in java, it is thread safe and good to be used
    //var is mutable, it is the normal use of variable in java

    val aSentence = "I'm a string" // no need to be define type if initialized
    val myPi = 3.14
    val myAnswer = 42

    var aString: String // only needs when not initialized
    val aDouble: Double
    val aInt: Int

    var myDouble= 1.999
    var myFloat = 1.9f
    var myLong = 123123123L
    var myInt = 199
    var myShort: Short = 12
    var myByte: Byte = 127

    val aLongNumber = 123_456_789 //underscore is kind of comma separated, only to use readable
    val theSameNumber = 123456789

    val anInteger: Int = 1
    val aLong: Long = anInteger.toLong() // explicit or implicit both need to be converted


}

// I am a Comment

/*
    I am a comment too
*/

/*
fun meaningLessFun(){
    /*
        I am also a comment
    */

}
*/