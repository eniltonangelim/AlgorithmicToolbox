package algorithmic_toolbox.week2

import kotlin.random.Random

fun power(n: Double, x: Int = 2): Double {
    if (x == 0)
        return n

    return power(n * n, x - 1)
}

fun naiveEstimatePI(n: Int): Double {
    var numberPointCircle: Int = 0
    var numberTotalPoint: Int = 0
    for (i in 1..n) {
        var x  = Random.nextDouble(0.0, 1.0)
        var y  = Random.nextDouble(0.0, 1.0)
        var distance = power(x) + power(y)
        if (distance <= 1)
            numberPointCircle += 1
        numberTotalPoint += 1
    }

    return 4 * numberPointCircle.toDouble() / numberTotalPoint.toDouble()
}