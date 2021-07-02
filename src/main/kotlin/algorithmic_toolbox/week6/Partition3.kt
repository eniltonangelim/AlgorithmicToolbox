package algorithmic_toolbox.week6

import java.util.*

fun partition3(a: IntArray): Int {

    val summ = a.sum()
    val w = summ/3

    if (summ == 0 || summ%3 != 0)
        return 0

    val n = a.size
    var T = Array(w +1) { IntArray(n+1)}


    for (i in 1..w) {
        for (j in 1..n) {
            val d = i - a[j-1]
            if (a[j-1] == i || (d > 0 && T[d][j-1] > 0)) {
                T[i][j] = if (T[i][j-1] == 0) 1 else 2
            } else {
                T[i][j] = T[i][j-1]
            }
        }
    }

    if (T[w][n] == 2)
        return 1

    return 0
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val array = IntArray(n)
    for (i in 0 until n) {
        array[i] = scanner.nextInt()
    }
    println(partition3(array))
}