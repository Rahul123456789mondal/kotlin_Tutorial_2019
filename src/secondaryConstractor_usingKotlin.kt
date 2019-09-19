
fun main(args: Array<String>){
    var dog3 = Dog3("RED", "PUG")
}

open class Animal3{ //super class

    var color: String = " "

    constructor(color: String){
        this.color = color
        println("The Animail Color is : $color")
    }
}

class Dog3: Animal3{  //Drived class
    var breed: String = " "
    constructor(color: String, breed: String): super(color){
        this.breed = breed
        println("Dog $color and namr type is $breed")
    }
}