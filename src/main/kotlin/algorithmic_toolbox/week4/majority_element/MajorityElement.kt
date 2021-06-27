package algorithmic_toolbox.week4.majority_element

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*
import kotlin.math.min

fun countInRange(a: IntArray, x: Int, left: Int, right: Int): Int {
    var count = 0
    for (i in left until right) {
        if (a[i] == x) count++
    }
    return count
}

fun getMajorityElement(a: IntArray, left: Int, right: Int): Int {
    if (left == right) return -1
    if (left + 1 == right) return a[left]

    val mid = left + (right  - left) / 2
    val l = getMajorityElement(a, left, mid)
    val r = getMajorityElement(a, mid+1, right)

    val lCount = countInRange(a, l, left, right)
    val rCount = countInRange(a, r, left, right)
    return if (lCount > rCount) l else r
}

fun main(args: Array<String>) {
    val scanner = FastScanner(System.`in`)
    val n = scanner.nextInt()
    val a = IntArray(n)
    for (i in 0 until n) {
        a[i] = scanner.nextInt()
    }

    if (getMajorityElement(a, 0, a.size) != -1) {
        println(1)
    } else {
        println(0)
    }
}

class FastScanner(stream: InputStream) {
    var br: BufferedReader = BufferedReader(InputStreamReader(stream))
    var st: StringTokenizer? = null

    fun next(): String {
        while (st == null || !st!!.hasMoreTokens()) {
            try {
                st = StringTokenizer(br.readLine())
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        return st!!.nextToken()
    }

    fun nextInt() = next().toInt()
}