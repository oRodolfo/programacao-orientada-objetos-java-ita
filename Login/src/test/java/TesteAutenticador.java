import org.example.Autenticador;
import org.example.LoginException;
import org.example.Usuario;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TesteAutenticador {

    @Test
    public void loginComSucesso() throws LoginException {
        Autenticador a = new Autenticador();
        Usuario u = a.logar("rodolfo", "senha123");
        assertEquals("rodolfo", u.getLogin());
    }

    @Test(expected = LoginException.class)
    public void loginFalho() throws LoginException {
        Autenticador a = new Autenticador();
        Usuario u = a.logar("rodolfo", "senhaerrada");
    }

    @Test
    public void informacaoErro() {
        Autenticador a = new Autenticador();
        try {
            Usuario u = a.logar("rodolfo", "senhaerrada");
            fail();
        } catch (LoginException e) {
            assertEquals("rodolfo", e.getLogin());
        }
    }
}
