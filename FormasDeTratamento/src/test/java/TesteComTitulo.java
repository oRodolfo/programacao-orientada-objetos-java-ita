import org.example.Autoridade;
import org.example.ComTitulo;
import org.example.FormatadorNome;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteComTitulo {

    @Test
    public void PessoaComTitulo1(){
        FormatadorNome comTitulo1 = new ComTitulo("Mestre");
        Autoridade autoridade1 = new Autoridade("Rodolfo", "Ribeiro", comTitulo1);

        assertEquals("Mestre Rodolfo Ribeiro", autoridade1.getTratamento());
    }

    @Test
    public void PessoaComTitulo2(){
        FormatadorNome comTitulo2 = new ComTitulo("Doutor");
        Autoridade autoridade2 = new Autoridade("Sergio", "Antonello", comTitulo2);

        assertEquals("Doutor Sergio Antonello", autoridade2.getTratamento());
    }

    @Test
    public void PessoaComTitulo3(){
        FormatadorNome comTitulo3 = new ComTitulo("Professor Doutorando");
        Autoridade autoridade3 = new Autoridade("Clovis", "Fernandes", comTitulo3);

        assertEquals("Professor Doutorando Clovis Fernandes", autoridade3.getTratamento());
    }
}
