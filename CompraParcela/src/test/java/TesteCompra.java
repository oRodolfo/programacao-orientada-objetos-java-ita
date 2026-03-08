import org.example.Compra;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteCompra {

    private static final double DELTA = 1e-9;

    @Test
    public void total_deveRetornarValorDaCompra() {
        Compra compra = new Compra(500.00);

        assertEquals(500.00, compra.total(), DELTA);
    }

    @Test
    public void total_comValorZero_deveRetornarZero() {
        Compra compra = new Compra(0.0);

        assertEquals(0.0, compra.total(), DELTA);
    }

    @Test
    public void total_comValorDecimal_deveRetornarValorExato() {
        Compra compra = new Compra(123.45);

        assertEquals(123.45, compra.total(), DELTA);
    }
}
