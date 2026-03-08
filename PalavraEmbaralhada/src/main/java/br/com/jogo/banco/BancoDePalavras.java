package br.com.jogo.banco;

import br.com.jogo.util.LeitorArquivo;

import java.util.List;
import java.util.Random;

public class BancoDePalavras {

    private final List<String> palavras;
    private final Random random = new Random();

    public BancoDePalavras() {
        this.palavras = LeitorArquivo.ler("palavras.txt");

        if (this.palavras == null || this.palavras.isEmpty()) {
            throw new RuntimeException("Arquivo palavras.txt nao foi lido ou esta vazio.");
        }
    }

    public String getPalavra() {
        return palavras.get(random.nextInt(palavras.size()));
    }
}
