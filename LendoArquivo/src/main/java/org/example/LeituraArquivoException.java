package org.example;

public class LeituraArquivoException extends Exception{
    public LeituraArquivoException(String mensagem){
        super(mensagem);
    }

    public LeituraArquivoException(String mensagem, Throwable cause){
        super(mensagem, cause);
    }
}
