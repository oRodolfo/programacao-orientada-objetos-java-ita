package org.example;

import java.util.Objects;

public class ProdutoComTamanho extends Produto{

    private int tamanho;

    public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho) {
        super(nome, codigo, preco);
        this.tamanho = tamanho;
    }

    //sobrescrita do metodo hashCode()
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + tamanho;
        return  result;
    }

    // ProdutosComTamanho são iguais se tiverem mesmo código e mesmo tamanho
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdutoComTamanho other = (ProdutoComTamanho) o;
        return getCodigo() == other.getCodigo() &&
                Objects.equals(tamanho, other.tamanho);
    }
}
