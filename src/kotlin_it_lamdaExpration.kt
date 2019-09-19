fun main(args: Array<String>){

    val program = Program1()
    program.reverceAndDisplay1("Hello Arka", { it.reversed()})
}

class Program1{
    fun  reverceAndDisplay1(str: String , myFun: (String) -> String){
     var result = myFun(str)
     println(result)
    }
}