import org.example.Pizza;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPizza {

    @Before
    public void setUp() {
        Pizza.zeraRegistroIngredientes();
    }

    @Test
    public void precoDeveSer15QuandoTemAte2Ingredientes() {
        Pizza p = new Pizza();
        p.adicionaIngrediente("Queijo");
        p.adicionaIngrediente("Tomate");

        assertEquals(15, p.getPreco());
    }

    @Test
    public void precoDeveSer20QuandoTemEntre3e5Ingredientes() {
        Pizza p = new Pizza();
        p.adicionaIngrediente("Queijo");
        p.adicionaIngrediente("Tomate");
        p.adicionaIngrediente("Azeitona");

        assertEquals(20, p.getPreco());
    }

    @Test
    public void precoDeveSer23QuandoTemMaisDe5Ingredientes() {
        Pizza p = new Pizza();
        p.adicionaIngrediente("1");
        p.adicionaIngrediente("2");
        p.adicionaIngrediente("3");
        p.adicionaIngrediente("4");
        p.adicionaIngrediente("5");
        p.adicionaIngrediente("6");

        assertEquals(23, p.getPreco());
    }

    @Test
    public void deveRegistrarIngredientesGlobalmenteAoAdicionarIngredientes() {
        Pizza p1 = new Pizza();
        p1.adicionaIngrediente("Queijo");
        p1.adicionaIngrediente("Tomate");

        Pizza p2 = new Pizza();
        p2.adicionaIngrediente("Queijo");

        assertEquals(Integer.valueOf(2), Pizza.getIngredientesUsados().get("Queijo"));
        assertEquals(Integer.valueOf(1), Pizza.getIngredientesUsados().get("Tomate"));
    }

    @Test
    public void registroDeIngredientesDeveComecarZeradoEmCadaTeste() {
        assertTrue(Pizza.getIngredientesUsados().isEmpty());
    }
}
