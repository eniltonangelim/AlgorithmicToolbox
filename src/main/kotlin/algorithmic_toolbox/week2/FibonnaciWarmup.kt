package algorithmic_toolbox.week2

import java.util.*

fun calcFib(n: Long): Long {
    return if (n <= 1) n else calcFib(n - 1) + calcFib(n - 2)
}

fun lastDigitOfNumber(n: Long): Long {
    var fibAList = LongArray((n+1).toInt())

    fibAList[0] = 0
    fibAList[1] = 1

    if ( n < 2) return n.toLong()

    for (i in 2..n) {
        fibAList[i.toInt()] = (fibAList[(i-1).toInt()] + fibAList[(i-2).toInt()]) % 10
    }

    return fibAList[n.toInt()]
}

fun getPisanoPeriod(m: Long): Long {
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

fun calcFibMod(n: Long, m: Long): Long {
    if ( n <= 1)
        return n

    val pisanoPeriod = getPisanoPeriod(m)
    val remainder = n % pisanoPeriod
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

    println(calcFib(n))
}