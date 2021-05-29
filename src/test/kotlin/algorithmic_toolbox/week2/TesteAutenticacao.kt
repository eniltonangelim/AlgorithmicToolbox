package algorithmic_toolbox.week2

import algorithmic_toolbox.week2.vo.CNPJ
import algorithmic_toolbox.week2.vo.Email
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.DisplayName
import org.junit.runner.RunWith
import kotlin.test.assertTrue

@DisplayName("Regras de autenticacao do AuthService")
class TesteServicoAutenticacao {

    private lateinit var authService: AuthService;

    @Before
    fun prepare() {
        this.authService = AuthServiceImpl()
    }

    @Test
    @DisplayName("Valida Autenticacao do usuario")
    fun test0() {
        val isLogged = this.authService.login(User(Email("foo@bar")))
        assertTrue(isLogged);
    }

    @Test
    @DisplayName("Valida Autenticacao do profissional")
    fun test1() {
        val isLogged = this.authService.login(Profissional(CNPJ("12354125312")))
        assertTrue(isLogged);
    }

}