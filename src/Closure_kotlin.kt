fun  main(){
    val programar = Programar()
    var results = 0      // in kotlin to modify the outside variable so this is call the closor

    programar.addThreenumber(2,8,7) {x,y,z -> results = x + y + z}    // Lamda expression
    println(results)
}

class Programar{
    fun addThreenumber(a: Int, b: Int, c: Int, action: (Int, Int, Int)-> Unit){  //High Leavel function with Lamda
        action(a,b,c) // result = x+y+z = a+b+c = 2+8+7 = 17
    }
}