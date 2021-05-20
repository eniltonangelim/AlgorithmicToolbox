package algorithmic_toolbox.week1

import getMaxPairwiseProductFaster
import kotlin.test.Test
import kotlin.test.assertEquals

class MaxPairwiseProductTest {

    @Test
    fun productIs9Bi() {
        var numbers: IntArray = intArrayOf(10000, 9000, 9000)
        var expected: Long = 90000000
        assertEquals(expected, getMaxPairwiseProductFaster(numbers))
    }

    @Test
    fun productIs5k() {
        var numbers: IntArray = intArrayOf(10, 3, 23, 56, 45, 96)
        var expected: Long = 5376
        assertEquals(expected, getMaxPairwiseProductFaster(numbers))
    }

}