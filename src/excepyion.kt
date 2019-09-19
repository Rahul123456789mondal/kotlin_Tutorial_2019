fun main(args: Array<String>) {
    try {

        var a = 0
        var x = 7 / a

        val v = "Journaldev.com"
        v.toInt()

    } catch (e: ArithmeticException) {
        println("Arthimetic Exception")
    } catch (e: Exception) {
        println("Exception occured. To print stacktrace use e")
    } finally {
        println("Finally. It's over")
    }
}