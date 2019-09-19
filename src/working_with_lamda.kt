fun main(args: Array<String>){

    val program = Program() // creating the object of the program class

    program.add(2,8) // here is the call the function of add
    program.add(3,7, object : myInterface{
        override fun execute(sum: Int) {
            println(sum) //body here is the call the interface and execute the function
        }
    })

    val myLamda: (Int) -> Unit = { s: Int -> println(s)}  // Lamda Expression in the lamda function (s) in the parameter
    program.add(2,9, myLamda)
}

class Program {

    fun  add(a: Int, b: Int, myLamda: (Int) -> Unit){
        val sum = a+b
        myLamda (sum)
    }


    fun add(a: Int, b: Int, action: myInterface){   // using interface (object orient way)
        val sum = a+b
        action.execute(sum)
    }

    fun add(a: Int, b: Int): Int {
        val sum = a+b
        println(sum)
        return(sum)   // this is the body of the function
    }
}

interface myInterface{
    fun execute(sum: Int)
}
