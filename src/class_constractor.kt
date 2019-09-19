
fun main(args: Array<String>) {
    var studentArka = StudentArka("Steve", 10)
    println(studentArka.id)
}

class StudentArka(var name: String) {
    var id: Int = -1
    init {

        println("Student has got a name as $name and id is $id")

    }
    constructor(n: String, id: Int): this(n) {

        // The body of the secondary constructor is called after init block

        this.id = id

    }

}