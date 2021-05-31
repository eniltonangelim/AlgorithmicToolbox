package algorithmic_toolbox.week2


import org.junit.Test
import org.junit.jupiter.api.DisplayName
import kotlin.test.assertEquals

class TestFibonacci {

    @Test
    @DisplayName("Find 10th fibonacci number Fn")
    fun test0() {
        val nth = calcFib(10)
        assertEquals(55, nth)
    }

    @Test
    @DisplayName("Last digit of a large Fibonacci number 3th")
    fun test1() {
        val nth = lastDigitOfNumber(3)
        assertEquals(2, nth)
    }

    @Test
    @DisplayName("Last digit of a large Fibonacci number 331th")
    fun test2() {
        val nth = lastDigitOfNumber(331)
        assertEquals(9, nth)
    }

    @Test
    @DisplayName("Last digit of a large Fibonacci number 331th")
    fun test3() {
        val nth = lastDigitOfNumber(327305)
        assertEquals(5, nth)
    }

    @Test
    @DisplayName("Calcula fibonacci (239) para Fn mod m ")
    fun test4() {
        val nth = calcFibMod(239, 1000)
        assertEquals(161, nth)
    }

    @Test
    @DisplayName("Calcula fibonacci (2816213588) para Fn mod m ")
    fun test5() {
        val nth = calcFibMod(2816213588, 239)
        assertEquals(151, nth)
    }

}