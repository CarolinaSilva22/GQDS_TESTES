package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import estoque.Estoque;
import estoque.Produto;
import vendas.Venda;

public class VendaTeste {
    private Estoque estoque;
    private Venda venda;

    @Before
    public void setUp() throws Exception {
        estoque = new Estoque();
        Produto produto = new Produto("Produto A", 10, 5.0);
        estoque.adicionarProduto(produto);
        venda = new Venda(estoque);
    }

    @Test
    public void testVenderProduto() throws Exception {
        venda.venderProduto("Produto A", 5);
        Produto produto = estoque.getProduto("Produto A");
        assertEquals(5, produto.getQuantidade());
    }

    @Test(expected = Exception.class)
    public void testVenderProdutoQuantidadeInsuficiente() throws Exception {
        venda.venderProduto("Produto A", 15);
    }
}
