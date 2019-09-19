fun main(args : Array<String>){
    val list = mutableListOf(5,15,19)
    println("Before swapping = $list")

    val result = list.swap(0,2)
    println("after swapping = $result")
}

fun MutableList<Int>.swap(index1: Int, index2: Int):MutableList<Int>{
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
    return this
}