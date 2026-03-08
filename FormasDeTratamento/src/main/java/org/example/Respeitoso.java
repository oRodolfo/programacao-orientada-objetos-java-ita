package org.example;

public class Respeitoso implements FormatadorNome{

    private boolean m; //masculino
    private boolean f; //feminino

    public Respeitoso(boolean m, boolean f) {
        this.m = m;
        this.f = f;
    }

    @Override
    public String formatarNome(String nome, String sobrenome) {
        if(m){
            return "Sr. " + sobrenome;
        }
        if(f){
            return "Sra. " + sobrenome;
        }
        return null;
    }
}
