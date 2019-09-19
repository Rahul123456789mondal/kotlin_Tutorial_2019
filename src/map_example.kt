fun main(array: Array<String>){
    // Map Tutorial :  key-Value Pair

    var myMap = mapOf<Int, String>(3 to "one", 47 to "Arka")

    for (key in myMap.keys){   // Using Individual Element (Objects)
        println("Element at key: $key = ${myMap[key]}")        // In this line i also used myMap.get(key)
    }

}