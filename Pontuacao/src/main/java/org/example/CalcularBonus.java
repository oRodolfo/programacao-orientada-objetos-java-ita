package org.example;

public class CalcularBonus {

    public int bonusDoDia;

    public int bonus(Usuario u){
        int multiplicador = 1;
        if(u.clienteVip){
            multiplicador *= 5;
        }

        return  multiplicador;
    }
}
