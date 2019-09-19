fun main(args: Array<String>){
    CoustomerData.count = 99
    CoustomerData.typeOfCoustomer()
    println(CoustomerData.count)
    CoustomerData.count = 109
    println(CoustomerData.count)

    CoustomerData.myMethod("Hello")

}

open class MySuperClass{
    open fun myMethod(str: String){
        println("My Super Class")
    }
}


object CoustomerData: MySuperClass(){

    var count:Int = -1  // Behave like the static variable

    fun typeOfCoustomer(): String{  // Behave like static method
        return "Indian"
    }

    override fun myMethod(str: String){    // Currently, Behaving like Static method
        super.myMethod(str)
        println("object Coustomer Data: "+ str)
    }
}
