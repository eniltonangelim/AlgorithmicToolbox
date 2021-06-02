import java.util.*

fun findPisanoPeriodOf(m: Long): Long {
    var period = 0L
    var previous = 0L
    var current = 1L

    for (i in 2 until m*m) {
        val tmpPrevious = previous
        previous = current
        current = (tmpPrevious+current) % m

        if (previous == 0L && current == 1L){
            period = i - 1
            break
        }
    }
    return period
}

fun findFibonacciNumber(n: Long, m: Long): Long {
    if ( n <= 1)
        return n

    val pisanoPeriod = findPisanoPeriodOf(m)
    var remainder = n
    if (pisanoPeriod > 0)
        remainder %= pisanoPeriod

    var previous = 0L
    var current = 1L

    for (i in 0 until remainder-1) {
        val tmpPrevious = previous
        previous = current
        current = (tmpPrevious+current) % m
    }

    return current % m
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
    val m = scanner.nextLong()
    println(findFibonacciNumber(n, m))
}