package algorithmic_toolbox.week2

fun lcmFast(a: Long, b: Long): Long {

    return a * b / gdc(a, b)

}