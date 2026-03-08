package br.com.jogo.util;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class LeitorArquivo {

    public static List<String> ler(String nomeArquivo) {
        List<String> linhas = new ArrayList<>();

        InputStream is = LeitorArquivo.class.getClassLoader().getResourceAsStream(nomeArquivo);
        if (is == null) {
            throw new RuntimeException("Arquivo nao encontrado em src/main/resources: " + nomeArquivo);
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linha = linha.trim();
                if (!linha.isEmpty()) {
                    linhas.add(linha);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao ler o arquivo: " + nomeArquivo, e);
        }

        return linhas;
    }
}
