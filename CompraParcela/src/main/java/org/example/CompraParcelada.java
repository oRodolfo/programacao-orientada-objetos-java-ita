package org.example;

public class CompraParcelada extends  Compra{

    private final int parcelas;
    private final double jurosMensal; // ex: 0.02 = 2% ao mês

    public CompraParcelada(double valor, int parcelas, double jurosMensal) {
        super(valor);
        this.parcelas = parcelas;
        this.jurosMensal = jurosMensal;
    }

    @Override
    public double total() {
        return valor * Math.pow(1.0 + jurosMensal, parcelas);
    }
}
