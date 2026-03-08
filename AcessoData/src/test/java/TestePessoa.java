import org.example.Pessoa;
import org.example.Relogio;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class TestePessoa {

    @Before
    public void setUp() {
        Calendar c = Calendar.getInstance();
        c.set(2024, Calendar.JANUARY, 1);
        Relogio.setTempoFixo(c.getTimeInMillis());
    }

    @After
    public void tearDown() {
        Relogio.limparTempoFixo();
    }

    @Test
    public void deveCalcularIdadeESigno_Aries() {
        Calendar nasc = Calendar.getInstance();
        nasc.set(1990, Calendar.MARCH, 25);

        Pessoa p = new Pessoa(nasc.getTime());

        assertEquals(33, p.getIdade());
        assertEquals("Áries", p.getSigno());
    }

    @Test
    public void deveCalcularIdadeESigno_Cancer() {
        Calendar nasc = Calendar.getInstance();
        nasc.set(2000, Calendar.JUNE, 30);

        Pessoa p = new Pessoa(nasc.getTime());

        assertEquals(23, p.getIdade());
        assertEquals("Câncer", p.getSigno());
    }

    @Test
    public void deveCalcularIdadeESigno_Capricornio() {
        Calendar nasc = Calendar.getInstance();
        nasc.set(1985, Calendar.DECEMBER, 28);

        Pessoa p = new Pessoa(nasc.getTime());

        assertEquals(38, p.getIdade());
        assertEquals("Capricórnio", p.getSigno());
    }
}
