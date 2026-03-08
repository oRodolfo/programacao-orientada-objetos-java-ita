package org.example;

public class RegistroPontos {

    private CalcularBonus bonus;

    public RegistroPontos(CalcularBonus cb){
        bonus = cb;
    }

    public void fazerUmComentario(Usuario u){
        u.pontos += 3 * bonus.bonus(u);
    }

    public void criarTopico(Usuario u){
        u.pontos += 5 * bonus.bonus(u);
    }

    public void curtida(Usuario u){
        u.pontos += 1 * bonus.bonus(u);
    }
}
