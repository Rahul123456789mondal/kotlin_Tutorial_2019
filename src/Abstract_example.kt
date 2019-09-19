fun main(){
    var indian = Indian()
    println(indian.dellName)
    println(indian.soumaya())
}

abstract class Dell{
    abstract val dellName: String

    abstract fun soumaya()  // this abstract class this is by default open in nature
    open fun getHeight(){}  // A "open" function ready to overridden
    fun goToSchool() {}  // A Normal Function : public and final bu default
}

class  Indian : Dell(){
    override var dellName: String = "dummy_indian_name"
    override fun soumaya() {
        println("it is under the soumaya")
    }
}