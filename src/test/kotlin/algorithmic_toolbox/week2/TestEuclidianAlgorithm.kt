package algorithmic_toolbox.week2

import algorithmic_toolbox.week1.euclideanAlgorithm
import org.junit.Test
import kotlin.test.assertEquals

class TestEuclidianAlgorithm {


    @Test
    fun test0() {
        val result = euclideanAlgorithm(18, 35)
        assertEquals(1, result)
    }

    @Test
    fun test1() {
        val result = euclideanAlgorithm(28851538, 1183019)
        assertEquals(17657, result)
    }

}