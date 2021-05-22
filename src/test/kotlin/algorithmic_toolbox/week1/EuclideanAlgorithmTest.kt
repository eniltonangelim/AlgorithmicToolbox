package algorithmic_toolbox.week1

import kotlin.test.Test
import kotlin.test.assertEquals

class EuclideanAlgorithmTest {

    @Test
    fun `Greatest Common Divisor IS 3`() {
        var a: Int = 357
        var b: Int = 234
        var expected: Int = 3
        assertEquals(expected, euclideanAlgorithm(a, b))
    }

    @Test
    fun `Greatest Common Divisor IS 1`() {
        var a: Int = 5
        var b: Int = 12
        var expected: Int = 1
        assertEquals(expected, euclideanAlgorithm(a, b))
    }

    @Test
    fun `Greatest Common Divisor IS 6`() {
        var a: Int = 30
        var b: Int = 24
        var expected: Int = 6
        assertEquals(expected, euclideanAlgorithm(a, b))
    }

    @Test
    fun `Greatest Common Divisor IS 16`() {
        var a: Int = 32
        var b: Int = 80
        var expected: Int = 16
        assertEquals(expected, euclideanAlgorithm(a, b))
    }

    @Test
    fun `Greatest Common Divisor IS 61232`() {
        var a: Int = 3918848
        var b: Int = 1653264
        var expected: Int = 61232
        assertEquals(expected, euclideanAlgorithm(a, b))
    }

}