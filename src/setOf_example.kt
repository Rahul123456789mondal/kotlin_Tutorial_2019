fun main(array: Array<String>){
    // Set Tutorial
    //"Set" contain is a unique element
    //"HashSet" also contain unique element but Sequence is not guaranteed in output

    var mySet = setOf<Int>(2,3,54,1,0,9,9,9,8)
    var mySet2 = mutableSetOf<Int>(2,8,9,10,9,2,3)  // Immutable Set
    mySet2.remove(10)

    for (element in mySet){   // Using Individual Element (Objects)
        println(element)        // In this line i also used myMap.get(key)
    }
    println()
    for (element2 in mySet2){   // Using Individual Element (Objects)
        println(element2)        // In this line i also used myMap.get(key)
    }

}