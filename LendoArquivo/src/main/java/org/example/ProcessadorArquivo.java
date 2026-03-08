package org.example;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {

    private ProcessadorArquivo() {
    }

    public static Map<String, String> processar(String nomeArquivo) throws LeituraArquivoException {
        File file = new File(nomeArquivo);

        Map<String, String> dados = new LinkedHashMap<>();
        boolean temAlgumaLinha = false;

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                temAlgumaLinha = true;

                String[] partes = linha.split("->", -1); // -1 mantém vazios, e conta TODAS ocorrências
                if (partes.length != 2) {
                    throw new LeituraArquivoException("Formato de arquivo inválido");
                }

                String chave = partes[0].trim();
                String valor = partes[1].trim();
                dados.put(chave, valor);
            }
        } catch (IOException e) {
            // Scanner(File) pode lançar FileNotFoundException (subclasse de IOException em termos de “erro de IO” no enunciado)
            // e o close também pode falhar (raro), mas cai aqui.
            throw new LeituraArquivoException("Erro ao abrir o arquivo" + e.getMessage(), e);
        } catch (RuntimeException e) {
            // Scanner pode lançar runtime em cenários de IO/estado; o enunciado só exige IOException,
            // mas isso ajuda a manter o comportamento consistente de “erro ao abrir”.
            // Se você preferir, pode remover esse catch.
            throw new LeituraArquivoException("Erro ao abrir o arquivo" + e.getMessage(), e);
        }

        if (!temAlgumaLinha) {
            throw new LeituraArquivoException("Arquivo vazio");
        }

        return dados;
    }
}
