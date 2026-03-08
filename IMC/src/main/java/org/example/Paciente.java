package org.example;

public class Paciente {

    double peso;
    double altura;

    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double CalculandoIMC(){
        return (peso/(altura*altura));
    }

    public String diagnostico(){
        double imc = CalculandoIMC();

        if(imc < 16){
            return "Baixo peso muito grave";
        } else if (imc <= 16.99) {
            return "Baixo peso grave";
        } else if (imc <= 18.49) {
            return  "Baixo peso";
        } else if (imc <= 24.99){
            return  "Peso Normal";
        } else if (imc <= 29.99) {
            return "SobrePeso";
        } else if (imc <= 34.99) {
            return  "Obesidade grau I";
        } else if (imc <= 39.99){
            return "Obesidade grau II";
        } else{
            return "Obesidade grau III (obesidade morbida)";
        }
    }

}
