import java.util.*

fun lastDigitOfThePartialSumFibonacci(n: Long): Long {
    if ( n < 1 ) return n

    var previous = 0L
    var current = 1L

    for (i in 1 until n) {
        val tmpPrevious = previous
        previous = current
        current = (tmpPrevious + current) % 10
    }

    return current % 10
}


fun getFibonacciSum(n: Long): Long {
    val pisanoPeriodOf10 = 60
    val lastDigit = lastDigitOfThePartialSumFibonacci((n + 2) % pisanoPeriodOf10)
    if (lastDigit == 0L)
        return 9L

    return lastDigit - 1
}

fun getFibonacciPartialSum(m: Long, n: Long): Long {

    val from = getFibonacciSum(m - 1)
    var to = getFibonacciSum(n)

    if (from > to)
        to += 10

    return to - from
}


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val m = scanner.nextLong()
    val n = scanner.nextLong()
    println(getFibonacciPartialSum(m, n))
}