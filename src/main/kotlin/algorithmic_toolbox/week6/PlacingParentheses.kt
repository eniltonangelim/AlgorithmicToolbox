package algorithmic_toolbox.week6

import java.util.*
import kotlin.math.max
import kotlin.math.min

fun getMaximValue(exp: String): Long {
    val n = exp.length / 2 + 1
    var min = Array(n){ LongArray(n) }
    var max = Array(n){ LongArray(n) }

    for (i in 0 until n) {
        min[i][i] = (exp[i * 2] - '0').toLong()
        max[i][i] = (exp[i * 2] - '0').toLong()
    }

    for (s in 1 until n ) {
        for (z in 0 .. n -1 -s) {
            val j = s + z
            val minAndMax = getMinAndMax(exp, z, j, min, max)
            min[z][j] = minAndMax[0]
            max[z][j] = minAndMax[1]
        }
    }

    return max[0][n - 1]
}

fun getMinAndMax(exp: String, i: Int, j: Int,
                 w: Array<LongArray>, W: Array<LongArray> ): LongArray {
    var minAndMax = longArrayOf(Long.MAX_VALUE, Long.MIN_VALUE)
    for (k in i until j) {
        val op = exp[k * 2 + 1]
        val a = eval(w[i][k], w[k+1][j], op)
        val b = eval(w[i][k], W[k+1][j], op)
        val c = eval(W[i][k], w[k+1][j], op)
        val d = eval(W[i][k], W[k+1][j], op)

        minAndMax[0] = min(a, min(b, min(c, min(d, minAndMax[0]))))
        minAndMax[1] = max(a, max(b, max(c, max(d, minAndMax[1]))))

    }
    return minAndMax
}

fun eval(a: Long, b: Long, op: Char): Long = when (op) {
    '+' -> a + b
    '-' -> a - b
    '*' -> a * b
    else -> {
        assert(false)
        0
    }
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val exp = scanner.next()
    println(getMaximValue(exp))
}
