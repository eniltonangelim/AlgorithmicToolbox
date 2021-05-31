package algorithmic_toolbox.week2


fun euclideanAlgorithm(a: Long, b: Long): Long {
    if (b == 0L)
        return a

    return euclideanAlgorithm(b, a % b)
}

fun gdc(a: Long, b: Long): Long {
    return euclideanAlgorithm(a, b)
}