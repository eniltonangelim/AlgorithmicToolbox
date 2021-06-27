package algorithmic_toolbox.week5

import java.util.*

fun getChange(m: Int): Int {
    val denominations = intArrayOf(1, 3, 4)
    var minNumberCoins = IntArray(m+1)

    Arrays.fill(minNumberCoins, 1, m + 1, Int.MAX_VALUE)

    for (i in 1..m) {
        for (j in denominations) {
            if (i >= j)
                minNumberCoins[i] = Math.min(minNumberCoins[i], minNumberCoins[i - j] + 1)
        }
    }

    return minNumberCoins[m]
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val m = scanner.nextInt()
    println(getChange(m))
}