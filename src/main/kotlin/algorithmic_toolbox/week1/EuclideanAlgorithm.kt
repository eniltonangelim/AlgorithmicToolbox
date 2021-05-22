package algorithmic_toolbox.week1


fun euclideanAlgorithm(a: Int, b: Int): Int {
    if (b == 0)
        return a

    return euclideanAlgorithm(b, a % b)
}