fun main() {
    val a = intArrayOf(1, 2, 3)
    print(sumOfNumbers(*a))

}

fun sumOfNumbers(vararg numbers: Int): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}
