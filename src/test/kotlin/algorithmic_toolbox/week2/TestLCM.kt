package algorithmic_toolbox.week2

import org.junit.Test
import kotlin.test.assertEquals

class TestLCM {


    @Test
    fun test0() {
        val result = lcmFast(6, 8)
        assertEquals(24, result)
    }

    @Test
    fun test1() {
        val result = lcmFast(761457, 614573)
        assertEquals(467970912861, result)
    }

}