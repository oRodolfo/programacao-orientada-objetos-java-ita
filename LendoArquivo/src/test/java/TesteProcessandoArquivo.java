import org.example.LeituraArquivoException;
import org.example.ProcessadorArquivo;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.FileWriter;
import java.util.Map;

import static org.junit.Assert.*;

public class TesteProcessandoArquivo {

    @Rule
    public TemporaryFolder temp = new TemporaryFolder();

    @Test
    public void processar_deveLerArquivoComSucesso() throws Exception {
        File f = temp.newFile("dados.txt");
        try (FileWriter w = new FileWriter(f)) {
            w.write("nome->Eduardo\n");
            w.write("sobrenome->Guerra\n");
            w.write("idade->35\n");
        }

        Map<String, String> mapa = ProcessadorArquivo.processar(f.getAbsolutePath());

        assertEquals(3, mapa.size());
        assertEquals("Eduardo", mapa.get("nome"));
        assertEquals("Guerra", mapa.get("sobrenome"));
        assertEquals("35", mapa.get("idade"));
    }

    @Test
    public void processar_arquivoVazio_deveLancarExcecao() throws Exception {
        File f = temp.newFile("vazio.txt"); // cria arquivo vazio

        try {
            ProcessadorArquivo.processar(f.getAbsolutePath());
            fail("Era esperado LeituraArquivoException");
        } catch (LeituraArquivoException e) {
            assertEquals("Arquivo vazio", e.getMessage());
        }
    }

    @Test
    public void processar_semSeta_deveLancarExcecaoFormatoInvalido() throws Exception {
        File f = temp.newFile("invalido1.txt");
        try (FileWriter w = new FileWriter(f)) {
            w.write("nome=Eduardo\n"); // não tem ->
        }

        try {
            ProcessadorArquivo.processar(f.getAbsolutePath());
            fail("Era esperado LeituraArquivoException");
        } catch (LeituraArquivoException e) {
            assertEquals("Formato de arquivo inválido", e.getMessage());
        }
    }

    @Test
    public void processar_comDuasSetas_deveLancarExcecaoFormatoInvalido() throws Exception {
        File f = temp.newFile("invalido2.txt");
        try (FileWriter w = new FileWriter(f)) {
            w.write("nome->Eduardo->X\n"); // mais de um ->
        }

        try {
            ProcessadorArquivo.processar(f.getAbsolutePath());
            fail("Era esperado LeituraArquivoException");
        } catch (LeituraArquivoException e) {
            assertEquals("Formato de arquivo inválido", e.getMessage());
        }
    }

    @Test
    public void processar_arquivoInexistente_deveLancarExcecaoErroAoAbrir() {
        String caminhoInexistente = "nao_existe_arquivo_123456.txt";

        try {
            ProcessadorArquivo.processar(caminhoInexistente);
            fail("Era esperado LeituraArquivoException");
        } catch (LeituraArquivoException e) {
            assertTrue(
                    "Mensagem deveria começar com 'Erro ao abrir o arquivo'",
                    e.getMessage().startsWith("Erro ao abrir o arquivo")
            );
        }
    }
}
