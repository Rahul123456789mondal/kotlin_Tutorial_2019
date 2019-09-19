class MultiInit(name: String){
    val fristProperty = "Reist propoerty: $name".also(::println)

    init {
        println("Frist initilizer block that prints ${name}")
    }

    val secondProperty = "Second property : ${name.length}".also(::println)

    init {
        println("second initilizer block that prints ${name.length}")
    }
}

fun  main(arga : Array<String>){
    var multiInit = MultiInit("Kotlin")
}