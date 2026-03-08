package org.example;

public class CarroMultiplica extends  CarroDeCorrida{

    private double potencia;

    public CarroMultiplica(int velocidadeMaximo, String nomeCarro, double potencia) {
        super(velocidadeMaximo, nomeCarro);
        if(potencia > 1 && potencia < 2){
            this.potencia = potencia;
        }else {
            this.potencia = 1.5;
        }
    }

    @Override
    public void acelerar() {
        if(velocidade == 0){
            velocidade = 10;
        }else{
            velocidade *= potencia;
            if(velocidade > velocidadeMaximo){
                velocidade = velocidadeMaximo;
            }
        }
    }
}
