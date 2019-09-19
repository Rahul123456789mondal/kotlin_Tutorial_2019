
fun main(args: Array<String>) {

    var a = A.name
    A.name = "Kotlin Tutorials"
    A.printName() //prints Kotlin Tutorials
}

class A {

    companion object Singleton    //
    {

        init {
            println("Singleton class invoked.")
        }
        var name = "Kotlin Objects"
        fun printName()
        {
            println(name)
        }

    }

    init {
        println("Class init method.")
    }
}
