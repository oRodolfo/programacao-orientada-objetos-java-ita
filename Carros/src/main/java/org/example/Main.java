package org.example;

public class Main {
    public static void main(String[] args) {
        Corrida corridaDaAmizade = new Corrida(2000);

        corridaDaAmizade.adicionaCarro(new CarroSoma("Lancer GT", 110, 330));
        corridaDaAmizade.adicionaCarro(new CarroSoma("Ferrari Daytona", 220, 450));

        corridaDaAmizade.adicionaCarro(new CarroMultiplica(480, "Civic TypeR", 120));
        corridaDaAmizade.adicionaCarro(new CarroMultiplica(490, "Bugattii Chiron", 320));

        corridaDaAmizade.umDoisTresEJa();
    }
}