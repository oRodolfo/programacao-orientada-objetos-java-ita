package org.example;

public class Autoridade {

    private String nome;
    private String sobrenome;
    private FormatadorNome formatandoNome;

    public Autoridade(String nome, String sobrenome, FormatadorNome formatandoNome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.formatandoNome = formatandoNome;
    }

    public String getTratamento(){
        return formatandoNome.formatarNome(nome, sobrenome);
    }
}
