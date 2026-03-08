package br.com.jogo.macanica;

import br.com.jogo.embaralhador.Embaralhador;
import br.com.jogo.embaralhador.FabricaEmbaralhadores;

public class MecanicaTentativasFixas implements MecanicaDoJogo{

    private int pontuacao = 0;
    private int tentativas = 3;
    private Embaralhador embaralhador = FabricaEmbaralhadores.criar();

    @Override
    public String embaralharPalavra(String palavra){
        tentativas = 3;
        return embaralhador.embaralhar(palavra);
    }

    @Override
    public boolean tentarAcertar(String palavra, String tentativa){
        tentativas--;
        if(palavra.equalsIgnoreCase(tentativa)){
            pontuacao += 10;
            return true;
        }
        return false;
    }

    @Override
    public boolean jogoAcabou(){
        return pontuacao >= 50;
    }

    @Override
    public int getPontuacao(){
        return pontuacao;
    }
}
