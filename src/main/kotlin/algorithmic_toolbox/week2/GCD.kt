import java.util.*


fun findGCD(a: Long, b: Long): Long {
    if (b == 0L)
        return a

    return findGCD(b, a % b)
}


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLong()
    val b = scanner.nextLong()

    println(findGCD(a, b))
}