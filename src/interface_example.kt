fun main(args: Array<String>){
    var myBtn = MyButton()
    myBtn.onTouch()
    myBtn.onClick()
}

interface MyInterfaceListener{
    var name: String // Properties in the interface are all time are abstruct
    fun onTouch()    // Methods in interface are abstruct by default

    fun onClick(){  // Normal Methods are public and open bu default not Final
        println("onclick Interface code : Button Clicked")
    }
}

interface MysecondInterfaceListener{
    var name: String // Properties in the interface are all time are abstruct
    fun onTouch() {
        println("My Second Interface are Touch")
    }

    fun onClick(){  // Normal Methods are public and open bu default not Final
        println("onclick SecondInterface code : Button Clicked")
    }
}

class MyButton : MyInterfaceListener, MysecondInterfaceListener {
    override fun onTouch() {
        super.onTouch()
    }

    override fun onClick() {
        super<MysecondInterfaceListener>.onClick()
        super<MyInterfaceListener>.onClick()
    }
    override var name: String = "dummy_name"
}