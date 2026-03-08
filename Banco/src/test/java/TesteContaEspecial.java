import org.example.ContaEspecial;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteContaEspecial extends TesteContaCorrente{

    @Before
    public void inicializaConta(){
        conta = new ContaEspecial(100);
        conta.depositar(200);
    }

    @Test
    public void sacarMaiorSaldo(){
        int valorSacado = conta.sacar(680);
        assertEquals(200, conta.saldo);
        assertEquals(0, valorSacado);
    }

    @Test
    public void sacarMaiorSaldoDentroDoLimite(){
        int valorSacado = conta.sacar(250);
        assertEquals(-50, conta.saldo);
        assertEquals(250, valorSacado);
    }
}
