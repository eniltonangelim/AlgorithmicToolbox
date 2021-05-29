package algorithmic_toolbox.week2

import algorithmic_toolbox.week2.vo.CNPJ

/* ProfissionalCNPJ
  eh um VALUE OBJECT
 */

data class Profissional(val cnpj: CNPJ) : Person(0, "medico") {
    override fun login(): Boolean {
        return this.cnpj.isValid()
    }
}