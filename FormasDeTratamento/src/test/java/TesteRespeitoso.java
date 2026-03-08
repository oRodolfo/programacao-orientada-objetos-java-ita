import org.example.Autoridade;
import org.example.FormatadorNome;
import org.example.Respeitoso;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteRespeitoso {

    @Test
    public void RespeitoMasculino1(){
        FormatadorNome masculino1 = new Respeitoso(true, false);
        Autoridade autoridadeM1 = new Autoridade("Rodolfo", "Ribeiro", masculino1);

        assertEquals("Sr. Ribeiro", autoridadeM1.getTratamento());
    }

    @Test
    public void RespeitoMasculino2(){
        FormatadorNome masculino2 = new Respeitoso(true, false);
        Autoridade autoridadeM2 = new Autoridade("Carlos", "Pereira", masculino2);

        assertEquals("Sr. Pereira", autoridadeM2.getTratamento());
    }

    @Test
    public void RespeitoFeminino1(){
        FormatadorNome feminino1 = new Respeitoso(false, true);
        Autoridade autoridadeF1 = new Autoridade("Maria Clara", "Ferreira", feminino1);

        assertEquals("Sra. Ferreira", autoridadeF1.getTratamento());
    }

    @Test
    public void RespeitoFeminino2(){
        FormatadorNome feminino2 = new Respeitoso(false, true);
        Autoridade autoridadeF2 = new Autoridade("Ana Luiza", "Souza", feminino2);

        assertEquals("Sra. Souza", autoridadeF2.getTratamento());
    }
}
