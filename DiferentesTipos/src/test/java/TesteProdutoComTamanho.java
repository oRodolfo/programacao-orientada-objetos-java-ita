import org.example.ProdutoComTamanho;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TesteProdutoComTamanho {

    @Test
    public void mesmoCodigoETamanhoDeveSerIgual() {
        ProdutoComTamanho p1 = new ProdutoComTamanho("Camisa", 1, 50.0, 'M');
        ProdutoComTamanho p2 = new ProdutoComTamanho("Camisa", 1, 60.0, 'M');

        assertEquals(p1, p2);
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void mesmoCodigoTamanhoDiferenteDeveSerDiferente() {
        ProdutoComTamanho p1 = new ProdutoComTamanho("Camisa", 1, 50.0, 'M');
        ProdutoComTamanho p2 = new ProdutoComTamanho("Camisa", 1, 50.0, 'G');

        assertNotEquals(p1, p2);
    }
}
