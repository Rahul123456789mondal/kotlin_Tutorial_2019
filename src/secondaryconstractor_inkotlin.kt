fun main(){
    var arka = Arka("Arka Mondal", 30)
    println(arka.id)
}

class  Arka(var name: String){   // Primary constactor

    var id: Int = -1
    init {
        println("Student has got $name")
    }

    constructor(name: String, Id:Int): this(name){  // Secondary constructor
        //Body
        this.id = Id
    }
}