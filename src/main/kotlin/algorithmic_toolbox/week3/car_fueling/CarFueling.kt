import java.util.*
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.roundToInt

fun computeMinRefills(dist: Int, tank: Int, stops: IntArray): Int {
    val n = stops.size - 1

    if (tank > dist) return 0

    if (stops[0] < 0) return -1

    if (stops[n] > dist) return -1

    if (stops[n] - stops[n-1] > tank) return -1

    if ((dist - stops[n]) > tank ) return -1

    return dist / tank
}



fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val dist = scanner.nextInt()
    val tank = scanner.nextInt()
    val n = scanner.nextInt()
    var stops = IntArray(n)
    for (i in 0 until n) {
        stops[i] = scanner.nextInt()
    }
    println(computeMinRefills(dist, tank, stops))
}