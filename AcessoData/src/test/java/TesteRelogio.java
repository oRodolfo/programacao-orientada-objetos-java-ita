import org.example.Relogio;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TesteRelogio {


    @After
    public void tearDown() {
        // Garante isolamento entre testes
        Relogio.limparTempoFixo();
    }

    @Test
    public void agora_semTempoFixo_deveRetornarTempoDoSistema() {
        long antes = System.currentTimeMillis();
        long agora = Relogio.agora();
        long depois = System.currentTimeMillis();

        // O valor retornado deve estar entre antes e depois
        assertTrue(agora >= antes);
        assertTrue(agora <= depois);
    }

    @Test
    public void agora_comTempoFixo_deveRetornarTempoConfigurado() {
        long tempoFixo = 1_700_000_000_000L;

        Relogio.setTempoFixo(tempoFixo);

        long agora = Relogio.agora();

        assertEquals(tempoFixo, agora);
    }

    @Test
    public void agora_aposLimparTempoFixo_deveVoltarAoTempoDoSistema() {
        Relogio.setTempoFixo(123456L);
        Relogio.limparTempoFixo();

        long antes = System.currentTimeMillis();
        long agora = Relogio.agora();
        long depois = System.currentTimeMillis();

        assertTrue(agora >= antes);
        assertTrue(agora <= depois);
    }
}
