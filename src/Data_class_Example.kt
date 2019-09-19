fun main(args: Array<String>){
    var user1 = User("Arka", 20)
    var user2 = User("Arka", 20)
    println(user1.toString())
    if (user1 == user2){
        println("Equal")
    } else {
        println("Not Equal")
    }
    var newUser1 = user1.copy()
    println(newUser1)

    var newUser2 = user2.copy(name = "Peter")
    println(newUser2)
}

data class User( var name:String, var id:Int){

}