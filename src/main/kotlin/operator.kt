package main.kotlin

//Challenge operator overloading

data class Cubic(var x: Int, var y: Int, var z: Int){
    operator fun plus(other: Cubic): Cubic{
        return Cubic(x+other.x, y+other.y, z+other.z)
    }

    operator fun minus(other: Cubic): Cubic{
        return Cubic(x-other.x, y-other.y, z-other.z)
    }
}

fun main() {
    println("operator::")
    val p1 = Cubic(100,200,300)
    val p2 = Cubic(10,20,30)

    println("p1 = $p1")
    println("p2 = $p2")

    println("p1 + p2 = ${p1 + p2}")
    println("p1 - p2 = ${p1 - p2}")
}