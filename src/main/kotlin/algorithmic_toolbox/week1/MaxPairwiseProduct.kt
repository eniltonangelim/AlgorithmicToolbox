import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*

fun getMaxPairwiseProduct(numbers: IntArray): Int {
    var result = 0
    val n = numbers.size
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if (numbers[i] * numbers[j] > result) {
                result = numbers[i] * numbers[j]
            }
        }
    }
    return result
}

fun getMaxPairwiseProductFaster(numbers: IntArray): Long {
    val initialIndex = -1
    var n = numbers.size
    var firstHigherIndex = initialIndex
    var secondHigherIndex = initialIndex

    for (i in 0 until n)
        if (isFirstHigherIndex(numbers, i, firstHigherIndex, initialIndex)) firstHigherIndex = i

    for (j in 0 until n)
        if (isSecondHigherIndex(numbers, j, secondHigherIndex, firstHigherIndex, initialIndex)) secondHigherIndex = j

    return numbers[firstHigherIndex].toLong() * numbers[secondHigherIndex].toLong()
}

fun isFirstHigherIndex(numbers: IntArray, index: Int, firstHigherIndex: Int, initialIndex: Int) =
    (firstHigherIndex == initialIndex) || (numbers[index] > numbers[firstHigherIndex])

fun isSecondHigherIndex(
    numbers: IntArray,
    index: Int,
    secondHigherIndex: Int,
    firstHigherIndex: Int,
    initialIndex: Int
) =
    (index != firstHigherIndex) && ((secondHigherIndex == initialIndex) || (numbers[index] > numbers[secondHigherIndex]))


fun main(args: Array<String>) {
    val scanner = FastScanner(System.`in`)
    val n = scanner.nextInt()
    val numbers = IntArray(n)
    for (i in 0 until n) {
        numbers[i] = scanner.nextInt()
    }
    println(getMaxPairwiseProductFaster(numbers))
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