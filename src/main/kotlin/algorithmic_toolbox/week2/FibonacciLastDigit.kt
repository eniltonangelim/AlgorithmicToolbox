import java.util.*

fun findLastDigitOfNumber(n: Long): Long {
    var fibAList = LongArray((n+1).toInt())

    fibAList[0] = 0
    fibAList[1] = 1

    if ( n < 2) return n

    for (i in 2..n) {
        fibAList[i.toInt()] = (fibAList[(i-1).toInt()] + fibAList[(i-2).toInt()]) % 10
    }

    return fibAList[n.toInt()]
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
    val c = findLastDigitOfNumber(n)
    println(c)
}