package br.com.jogo.main;

import br.com.jogo.banco.BancoDePalavras;
import br.com.jogo.macanica.FabricaMecanicaDoJogo;
import br.com.jogo.macanica.MecanicaDoJogo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        MecanicaDoJogo jogo = FabricaMecanicaDoJogo.criar();
        BancoDePalavras banco = new BancoDePalavras();

        while (!jogo.jogoAcabou()) {
            String palavra = banco.getPalavra();
            String palavraEmbaralhada = jogo.embaralharPalavra(palavra);

            System.out.println("Adivinhe a palavra: " + palavraEmbaralhada);
            String tentativa = in.nextLine();

            boolean acertou = jogo.tentarAcertar(palavra, tentativa);

            if (acertou) {
                System.out.println("Acertou!");
            } else {
                System.out.println("Errou!");
            }
        }

        System.out.println("Fim de jogo!");
        System.out.println("Pontuação final: " + jogo.getPontuacao());
        in.close();
    }
}
