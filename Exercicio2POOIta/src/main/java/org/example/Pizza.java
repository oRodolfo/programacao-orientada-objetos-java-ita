package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pizza {

    private int quantidadeIngredientes = 0;

    // Mapa estático para contabilizar ingredientes de todas as pizzas
    private static Map<String, Integer> ingredientesUsados = new HashMap<>();

    public void adicionaIngrediente(String ingrediente) {
        quantidadeIngredientes++;
        contabilizaIngrediente(ingrediente);
    }

    public int getPreco() {
        if (quantidadeIngredientes <= 2) {
            return 15;
        } else if (quantidadeIngredientes <= 5) {
            return 20;
        } else {
            return 23;
        }
    }

    public int getQuantidadeIngredientes() {
        return quantidadeIngredientes;
    }

    //Método estático para registrar ingredientes
    public static void contabilizaIngrediente(String ingrediente) {
        ingredientesUsados.put(
                ingrediente,
                ingredientesUsados.getOrDefault(ingrediente, 0) + 1
        );
    }

    public static Map<String, Integer> getIngredientesUsados() {
        return ingredientesUsados;
    }

    //garantindo que todo os teste irá começar do zero todas as vezes q rodar
    public static void zeraRegistroIngredientes() {
        ingredientesUsados.clear();
    }
}
