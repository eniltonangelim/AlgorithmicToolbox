package algorithmic_toolbox.week2

class AuthServiceImpl : AuthService {

    override fun login(person: Person): Boolean {
        return person.login()
    }
}