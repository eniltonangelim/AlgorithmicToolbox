import java.util.*

fun getChange(m: Int, max: Int = 10, mid: Int = 5, min: Int = 1): Int {
    return m / max + (m % 10) / mid + (m % mid)
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val m = scanner.nextInt()
    println(getChange(m))
}