/* Filter
    Returns a list containing only element matching the given [predicate]
*/

/** MAP
 * Returns a list contaning the results of applying the given [transform] function
 * to each element in the original collection
 */

fun main(args: Array<String>){
    val myNumbers: List<Int> = listOf(2,3,6,90,23)

    val mySmallNums = myNumbers.filter { it < 10 } // or { num -> num < 10 } here num is varriable name
    for (num in mySmallNums){
        println(num)
    }
}