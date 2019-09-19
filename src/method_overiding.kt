fun main(args : Array<String>){

    var dog = Dog1()
    dog.eat()

    var animal1 = Animal1()
    animal1.eat()

    var cat1 = cat1()
    cat1.eat()

}
open class Animal1 {

    var color : String = " " // when you use the variable overridr in kotlin then we use the open keyword in kotlin

    open fun eat(){  // in kotlin primary constructor and variable are by default are final so when it is used then the use the open keyword
        println("Animal1 is Eat")
    }
}
class Dog1: Animal1(){
    var breed : String = " "

    fun bark(){
        println("Dog Bark")
    }
    override fun eat(){
        println("Dog is Eating")
    }
}
class  cat1: Animal1() {
    var age: Int = -1

    fun neow(){
        println("Nwow")
    }
    override  fun eat(){
        println("Cat is Eating")
    }

}