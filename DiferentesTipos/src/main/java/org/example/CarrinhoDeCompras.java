package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

    private final Map<Produto, Integer> itens = new HashMap<>();

    public void adicionaProduto(Produto produto, int quantidade) {
        validaProdutoEQuantidade(produto, quantidade);
        itens.merge(produto, quantidade, Integer::sum);
    }

    public void removeProduto(Produto produto, int quantidade) {
        validaProdutoEQuantidade(produto, quantidade);

        Integer atual = itens.get(produto);
        if (atual == null) return; // ou lançar exceção, se preferir

        int novo = atual - quantidade;
        if (novo > 0) {
            itens.put(produto, novo);
        } else {
            itens.remove(produto);
        }
    }

    public double getValorTotal() {
        double total = 0.0;
        for (Map.Entry<Produto, Integer> e : itens.entrySet()) {
            total += e.getKey().getPreco() * e.getValue();
        }
        return total;
    }

    public int getQuantidade(Produto produto) {
        return itens.getOrDefault(produto, 0);
    }

    public Map<Produto, Integer> getItensSomenteLeitura() {
        return Collections.unmodifiableMap(itens);
    }

    private void validaProdutoEQuantidade(Produto produto, int quantidade) {
        if (produto == null) throw new IllegalArgumentException("produto não pode ser null");
        if (quantidade <= 0) throw new IllegalArgumentException("quantidade deve ser > 0");
    }
}
