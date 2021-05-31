package algorithmic_toolbox.week2

/* Esforço:
    c1 * n + c2
   Notação: Theta grande de n => Theta(n)
   [Limite assintoticamente restrio pois limita o fator constante superior e inferior]
 */

fun linearSearch(i: Int): Boolean {
    for (x in 1..300) {
        if (x == i) return true
    }
    return false
}

/* Esforço:
    +- log n
   Notação: O-Grande
   [o tempo de execução cresce no máximo assim, mas poderia crescer mais devagar]
   [limite assintotico superior]
   Esforço:
     log(n) ou n
   Notação: Omega
   [limite assintotico inferior]
 */

fun binarySearch(i: Int) {

}