package algorithmic_toolbox.week4.quicksort

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*

private val random = Random()

fun swap(a: IntArray, i: Int, j: Int) {
    val tmp = a[i]
    a[i] = a[j]
    a[j] = tmp
}

fun partition3(a: IntArray, l: Int, r: Int): IntArray {
    var m1 = l
    var m2 = l
    val pivot = a[l]

    for (i in l+1..r) {
        if (a[i] > pivot) continue
        if (a[i] < pivot) {
            swap(a, m1, i)
            m1++
        }
        swap(a, m2 + 1, i)
        m2++
    }

    return intArrayOf(m1, m2)
}

fun partition2(a: IntArray, l: Int, r: Int): Int {
    val x = a[l]
    var j = l
    for (i in l + 1..r) {
        if (a[i] <= x) {
            j++
            val t = a[i]
            a[i] = a[j]
            a[j] = t
        }
    }
    val t = a[l]
    a[l] = a[j]
    a[j] = t
    return j
}

fun randomizedQuickSort(a: IntArray, l: Int, r: Int) {
    if (l >= r) {
        return
    }
    val k = random.nextInt(r - l + 1) + l
    val t = a[l]
    a[l] = a[k]
    a[k] = t
    val m = partition3(a, l, r)
    randomizedQuickSort(a, l, m[0] - 1)
    randomizedQuickSort(a, m[1] + 1, r)
}

fun main(args: Array<String>) {
    val scanner = FastScanner(System.`in`)
    val n = scanner.nextInt()
    val a = IntArray(n)
    for (i in 0 until n) {
        a[i] = scanner.nextInt()
    }
    randomizedQuickSort(a, 0, n - 1)
    for (i in 0 until n) {
        print(a[i].toString() + " ")
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