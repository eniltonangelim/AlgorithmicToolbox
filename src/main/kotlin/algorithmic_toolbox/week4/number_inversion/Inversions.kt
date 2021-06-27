package algorithmic_toolbox.week4.number_inversion

import java.util.*

fun getNumberOfInversions(a: IntArray, left: Int, right: Int): Long {
    return mergeSort(a, left, right)
}

fun mergeSort(a: IntArray, left: Int, right: Int): Long {

    if (left == right) return 0;

    var count = 0L
    var center = (left + right) / 2

    count += mergeSort(a, left, center)
    count += mergeSort(a, center+1, right)
    count += merge(a, left, center,right)

    return count
}

fun merge(a: IntArray, left: Int, center: Int, right: Int): Long {

    var l = a.copyOfRange(left, center + 1)
    var r = a.copyOfRange(center+1, right+1)

    var i = 0
    var j = 0
    var k = left
    var count = 0L

    while (i < l.size && j < r.size) {
        if (l[i] <= r[j]) {
            a[k++] = l[i++]
        } else {
            a[k++] = r[j++]
            count += (center + 1) - (left + i)
        }
    }

    while (i < l.size) a[k++] = l[i++]
    while (j < r.size) a[k++] = r[j++]

    return count

}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val a = IntArray(n)
    for (i in 0 until n) {
        a[i] = scanner.nextInt()
    }
    println(getNumberOfInversions(a, 0, a.size - 1))
}