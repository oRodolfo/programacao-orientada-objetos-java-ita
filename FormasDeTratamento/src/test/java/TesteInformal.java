import org.example.Autoridade;
import org.example.FormatadorNome;
import org.example.Informal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteInformal {

    @Test
    public void TestePessoaInformal(){
        FormatadorNome informal  = new Informal();
        Autoridade autoridade = new Autoridade("Pedro", "Cabral", informal);

        assertEquals("Pedro", autoridade.getTratamento());
    }

    @Test
    public void TestePessoaInformal2(){
        FormatadorNome informal2 = new Informal();
        Autoridade autoridade2 = new Autoridade("Rodolfo", "Ribeiro", informal2);

        assertEquals("Rodolfo", autoridade2.getTratamento());
    }

    @Test
    public void TestePessoaInformal3(){
        FormatadorNome informal3 = new Informal();
        Autoridade autoridade3 = new Autoridade("Ana", "Silva", informal3);

        assertEquals("Ana", autoridade3.getTratamento());
    }
}
