package br.com.jogo.macanica;

public interface MecanicaDoJogo {

    String embaralharPalavra(String palavra);
    boolean tentarAcertar(String palavra, String tentativa);
    boolean jogoAcabou();
    int getPontuacao();
}
