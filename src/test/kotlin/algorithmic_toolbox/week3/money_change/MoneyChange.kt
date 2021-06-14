package algorithmic_toolbox.week3.money_change

import getChange
import org.junit.Test
import kotlin.test.assertEquals

class MoneyChange {

    @Test
    fun test0() {
        val response = getChange(2)
        assertEquals(2, response)
    }

    @Test
    fun test1() {
        val response = getChange(4)
        assertEquals(4, response)
    }

    @Test
    fun test2() {
        val response = getChange(28)
        assertEquals(6, response)
    }

    @Test
    fun test3() {
        val response = getChange(28, 6, 4, 1)
        assertEquals(6, response)
    }

}