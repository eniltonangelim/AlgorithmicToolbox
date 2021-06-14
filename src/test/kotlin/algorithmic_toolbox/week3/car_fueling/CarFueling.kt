package algorithmic_toolbox.week3.car_fueling

import computeMinRefills
import kotlin.test.Test
import kotlin.test.assertEquals

class CarFueling {

    @Test
    fun test0() {
        val stops = intArrayOf(200, 375, 550, 750)
        val response = computeMinRefills(950, 400, stops)
        assertEquals(2, response)
    }

    @Test
    fun test1() {
        val stops = intArrayOf(1, 2, 5, 9)
        val response = computeMinRefills(10, 3, stops)
        assertEquals(-1, response)
    }

    @Test
    fun test3() {
        val stops = intArrayOf(100, 150)
        val response = computeMinRefills(200, 250, stops)
        assertEquals(0, response)
    }
}