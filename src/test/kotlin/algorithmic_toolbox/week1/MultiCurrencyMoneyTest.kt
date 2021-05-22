package algorithmic_toolbox.week1

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MultiCurrencyMoneyTest {

    @Test
    fun testMultiplication() {
        var five = Dollar(5)
        var product = five.times(2)
        assertEquals(10, product.amount)
        product = five.times(3)
        assertEquals(15, product.amount)
    }

    fun testEquality() {
        assertTrue(Dollar(5).equals(Dollar(5)))
    }

}