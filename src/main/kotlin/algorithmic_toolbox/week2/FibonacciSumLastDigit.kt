import java.util.*

fun lastDigitOfTheSumFibonacci(n: Long): Long {
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


fun calcSum(n: Long): Long {
    val pisanoPeriodOf10 = 60

    val lastDigit = lastDigitOfTheSumFibonacci((n + 2) % pisanoPeriodOf10)
    if (lastDigit == 0L)
        return 9L

    return lastDigit - 1
}


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
    val s = calcSum(n)
    println(s)
}