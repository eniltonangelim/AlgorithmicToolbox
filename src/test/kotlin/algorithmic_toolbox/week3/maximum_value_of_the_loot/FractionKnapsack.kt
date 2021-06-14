package algorithmic_toolbox.week3.maximum_value_of_the_loot

import Item
import getOptimalValue
import org.junit.Test
import kotlin.test.assertEquals

class FractionKnapsack {

    @Test
    fun test0() {
        val response = getOptimalValue(50, getTestAItems())
        assertEquals(180.000, response)
    }

    @Test
    fun test1() {
        val response = getOptimalValue(10,getTestBItems())
        assertEquals(166.6667, response)
    }

    @Test
    fun test2() {
        val response = getOptimalValue(5, getTestCItems())
        assertEquals(38.3333, response)
    }

    private fun getTestAItems(): List<Item> {
        return listOf(Item(60, 20), Item(100, 50), Item(120, 30))
    }

    private fun getTestBItems(): List<Item> {
        return listOf(Item(500, 30))
    }

    private fun getTestCItems(): List<Item> {
        return listOf(
            Item(12, 2),
            Item(10, 1),
            Item(20, 3),
            Item(15, 2)
        )
    }

}