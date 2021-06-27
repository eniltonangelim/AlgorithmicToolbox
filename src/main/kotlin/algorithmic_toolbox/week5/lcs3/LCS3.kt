package algorithmic_toolbox.week5.lcs3

import java.util.*
import kotlin.math.max
import kotlin.math.min

fun lcs3(a: IntArray, b: IntArray, c: IntArray): Int {
    val n = a.size
    val m = b.size
    val l = c.size
    var T = Array(n+1) { Array(m+1) { IntArray(l+1) } }

    for (i in 1..n) {
        for (j in 1..m) {
            for (k in 1..l) {
                when {
                    ((a[i - 1] == b[j - 1]) && (b[j - 1] == c[k - 1]))
                        -> T[i][j][k] = T[i - 1][j - 1][k - 1] + 1
                    else -> T[i][j][k] = max(T[i][j][k - 1], max(T[i - 1][j][k], T[i][j - 1][k]))
                }
            }
        }
    }

    return T[n][m][l]
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val an = scanner.nextInt()
    val a = IntArray(an)
    for (i in 0 until an) {
        a[i] = scanner.nextInt()
    }
    val bn = scanner.nextInt()
    val b = IntArray(bn)
    for (i in 0 until bn) {
        b[i] = scanner.nextInt()
    }
    val cn = scanner.nextInt()
    val c = IntArray(cn)
    for (i in 0 until cn) {
        c[i] = scanner.nextInt()
    }
    println(lcs3(a, b, c))
}