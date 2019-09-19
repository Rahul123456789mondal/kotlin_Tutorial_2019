fun main(array: Array<String>){
    // HashMap Tutorial :  key-Value Pair

    var myMap = HashMap<Int, String>() // Mutable, No fixed sixe
    myMap.put(4, "Arka")
    myMap.put(3, "Mondal")
    myMap.put(6,"Soumaya")

    myMap.replace(6, "Soumaya","Soymaya _ Arka")  // this function used to change the value in HashMap

    for (key in myMap.keys){   // Using Individual Element (Objects)
        println("Element at key: $key = ${myMap[key]}")        // In this line i also used myMap.get(key)
    }

}





