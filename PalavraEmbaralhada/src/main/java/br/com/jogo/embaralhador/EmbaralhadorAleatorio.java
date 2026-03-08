package br.com.jogo.embaralhador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmbaralhadorAleatorio implements Embaralhador{

    @Override
    public String embaralhar(String palavra){
        List<Character> letras = new ArrayList<>();

        for(char c : palavra.toCharArray()){
            letras.add(c);
        }
        Collections.shuffle(letras);

        StringBuilder sb = new StringBuilder();
        for(char c : letras){
            sb.append(c);
        }

        return sb.toString();
    }
}
