import org.example.Produto;
import org.junit.Test;

import static org.junit.Assert.*;

public class TesteProduto {

    @Test
    public void produtosComMesmoCodigoDevemSerIguais() {
        Produto p1 = new Produto("Arroz", 10, 20.0);
        Produto p2 = new Produto("Feijão", 10, 9.0);

        assertEquals(p1, p2);
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void produtosComCodigoDiferenteDevemSerDiferentes() {
        Produto p1 = new Produto("Arroz", 10, 20.0);
        Produto p2 = new Produto("Arroz", 11, 20.0);

        assertNotEquals(p1, p2);
    }

}
