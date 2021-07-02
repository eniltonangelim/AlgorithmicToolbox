package algorithmic_toolbox.week6

import java.util.*
import kotlin.math.max

fun optimalWeight(w: Int, a: IntArray): Int {
    val n = a.size
    var knapsack = Array(n+1) { IntArray(w+1)}

    for (i in 1..n) {
        for (j in 1..w) {
            knapsack[i][j] = knapsack[i-1][j]
            if (a[i - 1] <= j) {
                knapsack[i][j] = max(knapsack[i - 1][j - a[i - 1]] + a[i -1], knapsack[i][j])
            }
        }
    }
    return knapsack[n][w]
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val w: Int
    val n: Int
    w = scanner.nextInt()
    n = scanner.nextInt()
    val array = IntArray(n)
    for (i in 0 until n) {
        array[i] = scanner.nextInt()
    }
    println(optimalWeight(w, array))
}