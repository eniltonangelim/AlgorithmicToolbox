import java.util.*
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.roundToInt

fun Double.round(decimals: Int = 2): Double = "%.${decimals}f".format(this).toDouble()

fun Double.roundTo(numFractionDigits: Int): Double {
    val factor = 10.0.pow(numFractionDigits.toDouble())
    return (this * factor).roundToInt() / factor
}

data class Item(val value: Int, val weight: Int) : Comparable<Item> {
    fun valuePerWeight(): Double = value.toDouble() / weight.toDouble()

    override fun compareTo(other: Item): Int {
        return other.valuePerWeight().compareTo(this.valuePerWeight())
    }
}

fun getOptimalValue(capacity: Int, items: List<Item>): Double {
    var response = 0.0

    Collections.sort(items)
    var W  = capacity

    for (item in items) {
        if (W > 0) {
            val fraction = min(item.weight, W)
            response += item.valuePerWeight() * fraction
            W -= fraction;
        }
    }

    return response.roundTo(4)
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val capacity = scanner.nextInt()
    var items = mutableListOf<Item>()
    for (i in 0 until n) {
        items.add(Item(scanner.nextInt(), scanner.nextInt()))
    }
    println(getOptimalValue(capacity, items))
}