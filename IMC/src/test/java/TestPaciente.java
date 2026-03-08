import org.example.Paciente;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPaciente {

    @Test
    public void PacienteBaixoPesoMuitoGrave(){
        Paciente p = new Paciente(45,1.70);
        assertEquals("Baixo peso muito grave", p.diagnostico());
    }

    @Test
    public void PacientePesoGrave(){
        Paciente p = new Paciente(48, 1.70);
        assertEquals("Baixo peso grave", p.diagnostico());
    }

    @Test
    public void PacienteBaixopeso(){
        Paciente p = new Paciente(52, 1.70);
        assertEquals("Baixo peso", p.diagnostico());
    }

    @Test
    public void PacientePesoNormal(){
        Paciente p = new Paciente(65, 1.70);
        assertEquals("Peso Normal", p.diagnostico());
    }

    @Test
    public void PacienteSobrePeso(){
        Paciente p = new Paciente(80, 1.70);
        assertEquals("SobrePeso", p.diagnostico());
    }

    @Test
    public void PacienteObesidadeGrauI(){
        Paciente p = new Paciente(95, 1.70);
        assertEquals("Obesidade grau I", p.diagnostico());
    }

    @Test
    public void PacienteObesidadeGrauII(){
        Paciente p = new Paciente(110, 1.70);
        assertEquals("Obesidade grau II", p.diagnostico());
    }

    @Test
    public void PacienteObesidadeGrauIII(){
        Paciente p = new Paciente(120, 1.70);
        assertEquals("Obesidade grau III (obesidade morbida)", p.diagnostico());
    }
}
