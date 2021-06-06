package algorithmic_toolbox.week2

import java.util.*

fun findlastDigitOfNumber(n: Long): Long {
    var fibAList = LongArray((n+1).toInt())

    if ( n < 2) return n

    fibAList[0] = 0
    fibAList[1] = 1



    for (i in 2..n) {
        fibAList[i.toInt()] = (fibAList[(i-1).toInt()] + fibAList[(i-2).toInt()]) % 10
    }

    return fibAList[n.toInt()]
}

fun lastDigitOfTheSumOfSquaresFibonacci(n: Long): Long {
    if ( n <= 0) return n

    val pisanoPeriod = 60
    val horizontal = findlastDigitOfNumber((n +1) % pisanoPeriod)
    val vertical = findlastDigitOfNumber( n % pisanoPeriod)
    return (horizontal * vertical) % 10
}


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
    val c = lastDigitOfTheSumOfSquaresFibonacci(n)
    println(c)
}
