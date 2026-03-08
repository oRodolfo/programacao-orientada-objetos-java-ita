package org.example;

public class Compra {
    int valorTotal;
    int numParcelas;

    public Compra(int valor){
        valorTotal = valor;
        numParcelas = 1;
    }

    public Compra(int qtdParcelas, int valorParcelas){
        numParcelas = qtdParcelas;
        valorTotal = qtdParcelas * valorParcelas;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public int getNumParcelas() {
        return numParcelas;
    }

    public int getValorParcela(){
        return valorTotal/numParcelas;
    }
}
