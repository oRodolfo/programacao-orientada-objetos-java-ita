package org.example;

public class CarroSoma extends CarroDeCorrida {

    private int potencia;

    public CarroSoma(String nomeCarro, int potencia, int velocidadeMaximo) {
        super(velocidadeMaximo, nomeCarro);
        this.potencia = potencia;
    }

    @Override
    public void acelerar(){
        velocidade += potencia;
        if(getVelocidade() > velocidadeMaximo){
            velocidade = velocidadeMaximo;
        }
    }

}