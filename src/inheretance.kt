fun main(args : Array<String>){

    var dog = Dog()
    dog.breed = "Labra"
    dog.color = "Black"
    dog.bark()
    dog.eat()

    var cat = cat()
    cat.age = 9
    cat.color = "White"
    cat.neow()
    cat.eat()

    var animal = Animal()
    animal.color = "RED"
    animal.eat()
}

open class Animal {

    var color : String = " "

    fun eat(){
        println("Dog and cat Eat")
    }
}

class Dog: Animal(){
    var breed : String = " "

    fun bark(){
        println("Dog Bark")
    }

}
class  cat: Animal() {
    var age: Int = -1

    fun neow(){
        println("Nwow")
    }

}