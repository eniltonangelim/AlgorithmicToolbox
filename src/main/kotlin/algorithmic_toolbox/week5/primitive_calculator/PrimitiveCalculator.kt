package algorithmic_toolbox.week5.primitive_calculator

import java.util.*
import kotlin.math.min

fun optimalSequence(n: Int): List<Int> {
    var m = n
    var r = IntArray(n+1)
    for (i in 1..n) {
        r[i] = r[i-1] + 1
        when {
            i % 2 == 0 -> r[i] = min(1+r[i / 2], r[i])
            i % 3 == 0 -> r[i] = min(1+r[i / 3], r[i])
        }
    }

    val sequence = ArrayList<Int>()
    while (m >= 1) {
        sequence.add(m)
        when {
            (r[m - 1] == r[m] - 1) -> m -= 1
            ((m % 3 == 0) && (r[m/3] == r[m] - 1)) -> m /= 3
            ((m % 2 == 0) && (r[m/2] == r[m] - 1)) -> m /= 2
        }
    }

    return sequence.reversed()
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val sequence = optimalSequence(n)
    println(sequence.size - 1)
    for (x in sequence) {
        print(x.toString() + " ")
    }
}