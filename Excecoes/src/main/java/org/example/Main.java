package org.example;

public class Main {
    public static void main(String[] args) {
        a(100);
    }

    public static void a(int i) {
        System.out.println("Executando a() com " + i);
        try {
            b(i);
        } catch (Exception e) {
            System.out.println("tratando a exceção: " + e.getMessage());
        }
    }

    public static void b(int i) throws Exception {
        System.out.println("Executando b() com " + i);
        throw new Exception("mensagem");
    }
}