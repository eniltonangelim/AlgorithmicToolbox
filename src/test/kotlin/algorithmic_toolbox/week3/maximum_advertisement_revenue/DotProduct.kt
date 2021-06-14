import org.junit.Test
import kotlin.test.assertEquals

class DotProduct {

    @Test
    fun test0() {
        val response = maxDotProduct(intArrayOf(23), intArrayOf(39))
        assertEquals(897, response)
    }

    @Test
    fun test1() {
        val response = maxDotProduct(intArrayOf(1, 3, -5), intArrayOf(-2, 4, 1))
        assertEquals(23, response)
    }

}