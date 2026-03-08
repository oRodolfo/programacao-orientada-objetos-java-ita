package br.com.jogo.macanica;

import br.com.jogo.embaralhador.Embaralhador;
import br.com.jogo.embaralhador.FabricaEmbaralhadores;

public class MecanicaErrosLimitados implements MecanicaDoJogo{

    private int erros = 0;
    private int pontuacao = 0;
    private Embaralhador embaralhador = FabricaEmbaralhadores.criar();

    @Override
    public String embaralharPalavra(String palavra) {
        return embaralhador.embaralhar(palavra);
    }

    @Override
    public boolean tentarAcertar(String palavra, String tentativa) {
        if (palavra.equalsIgnoreCase(tentativa)) {
            pontuacao += 10;
            return true;
        }
        erros++;
        return false;
    }

    @Override
    public boolean jogoAcabou() {
        return erros >= 5;
    }

    @Override
    public int getPontuacao() {
        return pontuacao;
    }
}
