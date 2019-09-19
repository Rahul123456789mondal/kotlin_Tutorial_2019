fun main(args: Array<String>){

    var student1 = Student1("Arka")

}
class Student1 constructor(name: String){  // primary constractor
        //Body
    var name: String = "Arka"
    init {
        println("Student name is $name") // this is the init block
    }
}