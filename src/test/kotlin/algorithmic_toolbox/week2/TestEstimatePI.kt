package algorithmic_toolbox.week2

import kotlin.test.Test
import kotlin.test.assertEquals

class TestEstimatePI {

    @Test
    fun test0() {
        val estimatePI = naiveEstimatePI(10)
        assertEquals(3.6, estimatePI)
    }

    @Test
    fun test1() {
        val estimatePI = naiveEstimatePI(100)
        assertEquals(2.92, estimatePI)
    }

    @Test
    fun test3() {
        val estimatePI = naiveEstimatePI(1000)
        assertEquals(3.172, estimatePI)
    }

    @Test
    fun test4() {
        val estimatePI = naiveEstimatePI(10000)
        assertEquals(3.1244, estimatePI)
    }

    @Test
    fun test5() {
        val estimatePI = naiveEstimatePI(100000)
        assertEquals(3.13864, estimatePI)
    }

    @Test
    fun test6() {
        val estimatePI = naiveEstimatePI(1000000000)
        assertEquals(3.70815984, estimatePI)
    }
}