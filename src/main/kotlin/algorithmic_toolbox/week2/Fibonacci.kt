package algorithmic_toolbox.week2

import java.util.*

fun findBy(n: Long): Long {
    if (n <= 1) return n

    var previous = 0L
    var current = 1L

    for (i in 1 until n) {
        val tmpPrevious = previous
        previous = current
        current += tmpPrevious
    }

    return current

}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()

    println(findBy(n))
}