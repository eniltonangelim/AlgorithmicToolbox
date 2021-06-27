package algorithmic_toolbox.week4.lottery

import java.util.*

fun fastCountSegments(starts: IntArray, ends: IntArray, points: IntArray): IntArray {
    starts.sort()
    ends.sort()

    var count = IntArray(points.size)

    for (i in 0 until points.size) {
        var x = 0
        var y = 0

        while (x < starts.size)
            if ( starts[x++] > points[i] ) break

        while (y < ends.size)
            if ( ends[y++] > points[i] ) break

        count[i] = if (points[i] == 0) 1 else x - y
    }

    return count
}

fun naiveCountSegments(starts: IntArray, ends: IntArray, points: IntArray): IntArray {
    val cnt = IntArray(points.size)
    for (i in points.indices) {
        for (j in starts.indices) {
            if (starts[j] <= points[i] && points[i] <= ends[j]) {
                cnt[i]++
            }
        }
    }
    return cnt
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n: Int
    val m: Int
    n = scanner.nextInt()
    m = scanner.nextInt()
    val starts = IntArray(n)
    val ends = IntArray(n)
    val points = IntArray(m)
    for (i in 0 until n) {
        starts[i] = scanner.nextInt()
        ends[i] = scanner.nextInt()
    }
    for (i in 0 until m) {
        points[i] = scanner.nextInt()
    }

    val cnt = fastCountSegments(starts, ends, points)
    for (x in cnt) {
        print(x.toString() + " ")
    }
}