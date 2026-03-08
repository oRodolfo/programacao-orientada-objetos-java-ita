package br.com.jogo.macanica;

import java.util.Random;

public class FabricaMecanicaDoJogo {

    public static MecanicaDoJogo criar() {
        Random r = new Random();
        if (r.nextBoolean()) {
            return new MecanicaTentativasFixas();
        }
        return new MecanicaErrosLimitados();
    }
}
