fun  main(args: Array<String>){
    var person2 = Person2()


    with(person2){
        person2.name = "Arka Mondal"
        person2.age = 24
    }
    println(person2.name)
    println(person2.age)

    person2.apply {
        person2.name = "Soumaya Mondal"
        person2.age = 25
    }.startRun()

    println(person2.name)
    println(person2.age)
}

class Person2{
    var name: String = " "
    var age: Int = -1

    fun startRun(){
        println("Now I am ready to run")
    }
}