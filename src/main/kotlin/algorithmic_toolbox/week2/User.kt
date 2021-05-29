package algorithmic_toolbox.week2

import algorithmic_toolbox.week2.vo.Email

data class User(val email: Email) : Person(0, "teste") {
    override fun login(): Boolean {
        return this.email.isValid()
    }
}
