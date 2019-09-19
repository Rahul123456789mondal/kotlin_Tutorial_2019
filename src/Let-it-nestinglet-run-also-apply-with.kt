fun main(args: Array<String>){
    var str = " Arka Mondal"
    str.let { println(" $it !!")}  // this is the let function in kotlin it takes object it is invoked upon as the parameter and returns the result of the lamda expression. and also kotlin let is a scoping function wherein the variable decleard inside the expression cannot be used outside.....
    println(str)
    var strLength = str.let { "$it function".length }
    println("strLength is $strLength")

    // nesting Let finction
    var x3 = "Anupam"
    x3.let { outer -> outer.let { inner -> print("Inner is $inner and outer is $outer") } }

    var x1 = "Anupam"
    x1 = x1.let { outer ->
        outer.let { inner ->
            println("Inner is $inner and outer is $outer")
            "Kotlin Tutorials Inner let"
        }
        "Kotlin Tutorials Outer let"
    }
    println(x1)

    // Kotlin run function
    var tutorial = "Rhis is a kotlin tutorial"
        println(tutorial)
    tutorial = kotlin.run { val tutorial = "This is run function"
    tutorial
    }
    println(tutorial)

}