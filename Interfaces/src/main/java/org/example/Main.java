package org.example;

public class Main {
    public static void main(String[] args) {
        Barulhento[] barulhentos = new Barulhento[10];

        barulhentos[0] = new Cachorro();
        barulhentos[1] = new Carro();
        barulhentos[2] = new Cachorro();
        barulhentos[3] = new Vuvuzela();
        barulhentos[4] = new Cachorro();
        barulhentos[5] = new Bateria();
        barulhentos[6] = new Cachorro();
        barulhentos[7] = new Bateria();
        barulhentos[8] = new Carro();
        barulhentos[9] = new Carro();

        sons(barulhentos);
    }

    public static void sons(Barulhento[] barulhentos){
        for(Barulhento b : barulhentos){
            System.out.println(b.fazerBarulho());
        }
    }
}