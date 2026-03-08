package org.example;

public abstract class CarroDeCorrida {

    protected int velocidade;
    protected int velocidadeMaximo;
    protected String nomeCarro;

    public CarroDeCorrida(int velocidadeMaximo, String nomeCarro) {
        this.velocidadeMaximo = velocidadeMaximo;
        this.nomeCarro = nomeCarro;
        this.velocidade = 0;
    }

    public abstract void acelerar();

    public void frear(){
        velocidade = velocidade/2;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }
}
