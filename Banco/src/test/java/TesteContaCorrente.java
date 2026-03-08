import org.example.ContaCorrente;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteContaCorrente {

    ContaCorrente conta;

    @Before
    public void inicializaConta(){
        conta = new ContaCorrente();
        conta.depositar(200);
    }

    @Test
    public void deposito(){
        assertEquals(200, conta.saldo);
    }

    @Test
    public void sacar(){
        conta.sacar(150);
        assertEquals(50, conta.saldo);
    }

    @Test
    public void sacarMaiorSaldo(){
        conta.sacar(650);
        assertEquals(200, conta.saldo);
    }
}
