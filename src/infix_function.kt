import javax.print.attribute.standard.MediaSize

fun main(args: Array<String>) {
    val b = Numbers()
    b addNumber 5

    print(b.x) //prints 15

    println()
    val x:Int = 7
    val y:Int = 10

    val greaterVal = x greaterValue y
    println(greaterVal)
}


class Numbers {

    var x = 10
    infix fun addNumber(num: Int) {   // this the infix function 
        this.x = this.x + num
    }
}

infix fun Int.greaterValue(other:Int): Int{
    if (this > other)
        return  this
    else
        return other
}

