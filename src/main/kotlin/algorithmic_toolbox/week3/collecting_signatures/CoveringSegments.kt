import java.util.*

fun optimalPoints(segments: MutableList<Segment>): MutableList<Int> {
    segments.sort()

    val points = mutableListOf<Int>()
    var point = -1
    for (segment in segments) {
        if (!segment.isInSegment(point)) {
            point = segment.end
            points.add(point)
        }
    }

    return points
}

data class Segment(var start: Int, var end: Int): Comparable<Segment> {
    fun isInSegment(point: Int): Boolean = point in start..end

    override fun compareTo(other: Segment): Int {
        return this.end.compareTo(other.end)
    }
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val segments = ArrayList<Segment>(n)
    repeat (n) {
        val start: Int = scanner.nextInt()
        val end: Int = scanner.nextInt()
        segments += Segment(start, end)
    }
    val points = optimalPoints(segments)
    println(points.size)
    for (point in points) {
        print(point.toString() + " ")
    }
}