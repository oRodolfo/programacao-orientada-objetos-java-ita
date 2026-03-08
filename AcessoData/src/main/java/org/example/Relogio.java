package org.example;

public class Relogio {

    // Se for diferente de zero, este valor será usado como "agora"
    private static long tempoFixo = 0;

    public static long agora() {
        if (tempoFixo != 0) {
            return tempoFixo;
        }
        return System.currentTimeMillis();
    }

    public static void setTempoFixo(long tempo) {
        tempoFixo = tempo;
    }

    public static void limparTempoFixo() {
        tempoFixo = 0;
    }
}
