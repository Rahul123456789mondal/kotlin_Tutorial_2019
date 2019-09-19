fun main(){
    var student = Student()

    println("Pass stutus :-" + student.hasPassed(68))

    println("Pass stutus :-" + student.isScholar(68))
}

fun Student.isScholar(marks: Int): Boolean {
  return marks > 95
}
class Student {

    fun hasPassed(marks: Int): Boolean {

        return marks > 40
    }
}