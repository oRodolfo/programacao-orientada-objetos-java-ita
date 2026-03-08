package org.example;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Pizza p1 = new Pizza();
        p1.adicionaIngrediente("Queijo");
        p1.adicionaIngrediente("Tomate");

        Pizza p2 = new Pizza();
        p2.adicionaIngrediente("Calabresa");
        p2.adicionaIngrediente("Queijo");
        p2.adicionaIngrediente("Cebola");

        Pizza p3 = new Pizza();
        p3.adicionaIngrediente("Frango");
        p3.adicionaIngrediente("Catupiry");
        p3.adicionaIngrediente("Milho");
        p3.adicionaIngrediente("Queijo");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionaPizza(p1);
        carrinho.adicionaPizza(p2);
        carrinho.adicionaPizza(p3);

        System.out.println("Total do carrinho: R$ " + carrinho.getTotal());

        System.out.println("\nIngredientes utilizados:");
        for (Map.Entry<String, Integer> entry : Pizza.getIngredientesUsados().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
