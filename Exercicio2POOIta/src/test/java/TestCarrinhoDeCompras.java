import org.example.CarrinhoDeCompras;
import org.example.Pizza;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCarrinhoDeCompras {

    @Before
    public void setUp() {
        Pizza.zeraRegistroIngredientes();
    }

    @Test
    public void totalDeveSomarPrecosDasPizzasCorretamente() {
        Pizza p1 = new Pizza();
        p1.adicionaIngrediente("Queijo"); // 1 ingrediente => 15

        Pizza p2 = new Pizza();
        p2.adicionaIngrediente("Queijo");
        p2.adicionaIngrediente("Tomate");
        p2.adicionaIngrediente("Azeitona"); // 3 ingredientes => 20

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionaPizza(p1);
        carrinho.adicionaPizza(p2);

        assertEquals(35, carrinho.getTotal());
    }

    @Test
    public void naoDeveAceitarPizzaSemIngredientes() {
        Pizza semIngredientes = new Pizza(); // 0 ingredientes

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionaPizza(semIngredientes);

        assertEquals(0, carrinho.getTotal());
    }
}
