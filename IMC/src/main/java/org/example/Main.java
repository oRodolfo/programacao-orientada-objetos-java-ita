package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();

        Paciente paciente = new Paciente(peso, altura);
        System.out.printf("Seu IMC: %.2f%n", paciente.CalculandoIMC());
        System.out.println("Seu diagnostico: " + paciente.diagnostico());
    }
}