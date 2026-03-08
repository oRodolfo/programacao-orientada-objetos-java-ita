import org.example.CompraParcelada;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteCompraParcelada {

    private static final double DELTA = 1e-9;

    @Test
    public void total_1Parcela_deveAplicarJurosCompostos() {
        CompraParcelada c = new CompraParcelada(1000.0, 1, 0.02);
        assertEquals(1020.0, c.total(), DELTA);
    }

    @Test
    public void total_2Parcelas_deveAplicarJurosCompostos() {
        CompraParcelada c = new CompraParcelada(1000.0, 2, 0.02);
        assertEquals(1040.4, c.total(), DELTA);
    }

    @Test
    public void total_5Parcelas_deveAplicarJurosCompostos() {
        CompraParcelada c = new CompraParcelada(1000.0, 5, 0.02);
        assertEquals(1104.0808032, c.total(), DELTA);
    }

    @Test
    public void total_10Parcelas_deveAplicarJurosCompostos() {
        CompraParcelada c = new CompraParcelada(1000.0, 10, 0.02);
        assertEquals(1218.9944199947574, c.total(), DELTA);
    }
}
