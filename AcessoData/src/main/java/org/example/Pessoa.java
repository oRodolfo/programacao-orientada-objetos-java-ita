package org.example;

import java.util.Calendar;
import java.util.Date;

public class Pessoa {

    private Date dataDeNascimento;

    public Pessoa(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getIdade() {
        Calendar hoje = Calendar.getInstance();
        hoje.setTimeInMillis(Relogio.agora());

        Calendar nascimento = Calendar.getInstance();
        nascimento.setTime(dataDeNascimento);

        int idade = hoje.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR);

        // ainda não fez aniversário no ano atual
        if (hoje.get(Calendar.DAY_OF_YEAR) < nascimento.get(Calendar.DAY_OF_YEAR)) {
            idade--;
        }

        return idade;
    }

    public String getSigno() {
        Calendar c = Calendar.getInstance();
        c.setTime(dataDeNascimento);

        int dia = c.get(Calendar.DAY_OF_MONTH);
        int mes = c.get(Calendar.MONTH) + 1; // Janeiro = 1

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) return "Áries";
        if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) return "Touro";
        if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) return "Gêmeos";
        if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 21)) return "Câncer";
        if ((mes == 7 && dia >= 22) || (mes == 8 && dia <= 22)) return "Leão";
        if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) return "Virgem";
        if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) return "Libra";
        if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) return "Escorpião";
        if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) return "Sagitário";
        if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) return "Capricórnio";
        if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) return "Aquário";
        return "Peixes";
    }
}
