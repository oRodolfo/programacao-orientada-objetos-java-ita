package br.com.jogo.embaralhador;

public class EmbaralhadorInverso implements Embaralhador{

    @Override
    public String embaralhar(String palavra){
        return new StringBuilder(palavra).reverse().toString();
    }
}
