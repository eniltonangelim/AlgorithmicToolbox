package algorithmic_toolbox.week5.edit_distance

import java.util.*
import kotlin.math.min

fun getEditDistance(s: String, t: String): Int {
    val n = s.length
    val m = t.length
    var T = Array(n+1) { IntArray(m+1) }

    for ( i in 1..n)
        T[i][0] = i

    for ( j in 1..m)
        T[0][j] = j

    for (i in 1..n) {
        for (j in 1..m) {
            val insertion = T[i][j - 1] + 1
            val deletion  = T[i - 1][j] + 1
            val subsitution = T[i - 1][j - 1] + if (s.get(i - 1) == t.get(j - 1)) 0 else 1
            T[i][j] = min(insertion, min(deletion, subsitution))
        }
    }

    return T[n][m]
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.next()
    val t = scan.next()

    println(getEditDistance(s, t))
}