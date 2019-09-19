import java.math.BigInteger

fun main(){
    println(getFibonacci(1000, BigInteger("1"), b = BigInteger("0")))
}



tailrec fun getFibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger{

    if (n == 0)
        return b
    else
        return getFibonacci(n-1, a+b, a )

}