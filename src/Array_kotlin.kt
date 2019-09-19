// Array mutable but has Fixed Size
    // List Tutorial
fun main(){

    var list = listOf<String>("Arka", "Mondal", "soumaya")  // Immutable, Fixed and Read only
    var list1 = mutableListOf<String>() // This is the mutable List

    list1.add("Rahul")  // index 0
    list1.add("Rohit") // index 1
    list1.add("Ram")    // index2

    list1.remove("Ram")
    list1.add(2,"Sam")

    for (element2 in list1){
        println(element2)
    }
    println()
    for (element in list){
        println(element)
    }
    println()
    for (index in 0..list.size -1){ //Using Individual Element (Objects)
        println(list[index])  //list.get(index) this function also used
    }
    println()
    for (index1 in 0..list1.size -1){
        println(list1[index1])
    }
}
