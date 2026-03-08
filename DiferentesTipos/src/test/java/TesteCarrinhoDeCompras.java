import org.example.CarrinhoDeCompras;
import org.example.Produto;
import org.example.ProdutoComTamanho;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TesteCarrinhoDeCompras {

    @Test
    public void adicionaProdutoDeveSomarQuantidadeSeJaExistir() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto p = new Produto("Arroz", 10, 20.0);

        carrinho.adicionaProduto(p, 2);
        carrinho.adicionaProduto(new Produto("Outro nome", 10, 99.0), 3); // mesmo código -> mesma chave

        assertEquals(5, carrinho.getQuantidade(p));
    }

    @Test
    public void produtosComMesmoCodigoMasTamanhosDiferentesDevemSerChavesDiferentes() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        ProdutoComTamanho m = new ProdutoComTamanho("Camisa", 1, 50.0, 'M');
        ProdutoComTamanho g = new ProdutoComTamanho("Camisa", 1, 50.0, 'G');

        carrinho.adicionaProduto(m, 1);
        carrinho.adicionaProduto(g, 2);

        assertEquals(1, carrinho.getQuantidade(m));
        assertEquals(2, carrinho.getQuantidade(g));
        assertEquals(2, carrinho.getItensSomenteLeitura().size());
    }

    @Test
    public void removeProdutoDeveDiminuirOuRemoverQuandoZerar() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto p = new Produto("Leite", 5, 4.0);

        carrinho.adicionaProduto(p, 3);
        carrinho.removeProduto(p, 1);
        assertEquals(2, carrinho.getQuantidade(p));

        carrinho.removeProduto(p, 5); // remove tudo (fica <= 0)
        assertEquals(0, carrinho.getQuantidade(p));
        assertTrue(carrinho.getItensSomenteLeitura().isEmpty());
    }

    @Test
    public void deveCalcularValorTotalCorretamente() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto p1 = new Produto("Arroz", 10, 20.0);
        ProdutoComTamanho p2 = new ProdutoComTamanho("Camisa", 1, 50.0, 'M');

        carrinho.adicionaProduto(p1, 2); // 40
        carrinho.adicionaProduto(p2, 3); // 150

        assertEquals(190.0, carrinho.getValorTotal(), 0.0001);
    }
}
