package org.example;

import java.util.Objects;

public class Produto {

    private String nome;
    private int codigo;
    private double preco;

    public Produto(String nome, int codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    // Sobrescrita do equals se o codigo for o mesmo considera igual
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Verifica se são a mesma instância
        if (o == null || getClass() != o.getClass()) return false; // Verifica se é nulo ou classe diferente
        Produto produto = (Produto) o; // Cast para Produto
        return codigo == produto.codigo; // Compara apenas o código
    }

    // Sobrescrita do hashCode que gera hash baseado apenas no código
    @Override
    public int hashCode() {
        return Objects.hash(codigo); // Necessário para funcionar com coleções como HashMap/HashSet
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
