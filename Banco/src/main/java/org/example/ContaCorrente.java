package org.example;

public class ContaCorrente {

    public int saldo;

    public int sacar(int valor){
        if(valor > saldo){
            return 0;
        }else{
            saldo -= valor;
            return valor;
        }
    }

    public int depositar(int valor){
        saldo += valor;
        return 0;
    }
}
