import java.util.*

data class Salary(val value: String): Comparable<Salary> {
    override fun compareTo(other: Salary): Int {
        return (other.value + this.value).compareTo(this.value + other.value)
    }

    override fun toString(): String {
        return this.value
    }
}

fun largestNumber(a: MutableList<Salary>): String {
    a.sort()
    return a.joinToString("")
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val a = ArrayList<Salary>(n)
    repeat(n) {
        a += Salary(scanner.next())
    }
    println(largestNumber(a))
}