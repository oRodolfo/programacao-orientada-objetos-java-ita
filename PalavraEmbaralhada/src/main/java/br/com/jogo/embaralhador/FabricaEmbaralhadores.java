package br.com.jogo.embaralhador;

import java.util.Random;

public class FabricaEmbaralhadores {

    public static Embaralhador criar(){
        Random r = new Random();

        if(r.nextBoolean()){
            return new EmbaralhadorInverso();
        }
        return new EmbaralhadorAleatorio();
    }
}
