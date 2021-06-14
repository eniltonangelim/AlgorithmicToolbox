import java.util.*

fun optimalSummands(n: Int): List<Int> {
    var response = mutableListOf<Int>()
    var k = n

    for (i in 1..n) {
        if ( 2 * i + 1 > k ) {
            response.add(k)
            break
        }
        response.add(i)
        k -= i
    }

    return response
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val summands = optimalSummands(n)
    println(summands.size)
    for (summand in summands) {
        print(summand.toString() + " ")
    }
}