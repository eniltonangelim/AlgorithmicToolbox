package algorithmic_toolbox.week5.longest_common_subsequence_of_two_sequecens

import java.util.*
import kotlin.math.max
import kotlin.math.min

fun lcs2(a: IntArray, b: IntArray): Int {
    val n = a.size
    val m = b.size
    var T = Array(n+1) { IntArray(m+1) }

    for (i in 1..n) {
        for (j in 1..m) {
            when {
                a[i - 1] == b[j - 1] -> T[i][j] = T[i - 1][j - 1] + 1
                else -> T[i][j] = max(T[i - 1][j], T[i][j - 1])
            }
        }
    }
    return T[n][m]
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val a = IntArray(n)
    for (i in 0 until n) {
        a[i] = scanner.nextInt()
    }

    val m = scanner.nextInt()
    val b = IntArray(m)
    for (i in 0 until m) {
        b[i] = scanner.nextInt()
    }

    println(lcs2(a, b))
}