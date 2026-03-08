package org.example;

public class Carro {

    int potencia;
    int velocidade;
    String nomeCarro;


    void acelerar(){
        velocidade += potencia;
        System.out.println("O carro esta a " + velocidade + "KM/H");
    }

    void frear(){
        velocidade = velocidade/2;
        System.out.println("O carro esta a " + velocidade + "KM/H");
    }

    public int getVelocidade() {
        return velocidade;
    }

    void imprimir(){
        System.out.println("O carro " + nomeCarro + " esta a velcidade de " + getVelocidade() + "KM/H");
    }
}
