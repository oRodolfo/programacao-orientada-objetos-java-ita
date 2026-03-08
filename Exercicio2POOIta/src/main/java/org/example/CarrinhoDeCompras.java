package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Pizza> pizzas = new ArrayList<>();

    public void adicionaPizza(Pizza pizza) {
        if (pizza.getQuantidadeIngredientes() > 0) {
            pizzas.add(pizza);
        }
    }

    public int getTotal() {
        int total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.getPreco();
        }
        return total;
    }
}
