package org.example;

public class Main {
    public static void main(String[] args) {
        Pilha p = new Pilha(10);
        p.empilhar("Rodolfo");
        p.empilhar("Jose");
        p.empilhar("Maria");
        p.empilhar("Eduardo");

        System.out.println(p.topo());
        System.out.println(p.tamanho());

        System.out.println(p.desempilhar());
        System.out.println(p.topo());
        System.out.println(p.tamanho());
    }
}