package org.example;


public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        c1.potencia = 10;
        c1.velocidade = 50;
        c1.nomeCarro = "Monza Tubarao";
        c1.imprimir();

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        c1.frear();
        c1.acelerar();
    }
}