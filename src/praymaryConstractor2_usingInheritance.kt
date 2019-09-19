
fun main(args: Array<String>){
    var dog2 = Dog2("black", "pug")

}
// Inheritance using primary constractor
open class Animal2( var color: String){   // Super class
    init {
        println("From Animal Init: $color")
    }
}

class Dog2(color: String, var bread: String): Animal2(color){  // Drived class

    init {
        println("From Dog Init: $color and $bread")
    }
}
