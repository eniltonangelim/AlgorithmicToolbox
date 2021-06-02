package algorithmic_toolbox.week2

import java.util.*

fun getGCD(a: Long, b: Long): Long {
    if (b == 0L)
        return a

    return getGCD(b, a % b)
}

fun lcmFast(a: Long, b: Long): Long {

    return a * b / getGCD(a, b)

}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLong()
    val b = scanner.nextLong()

    println(lcmFast(a, b))
}