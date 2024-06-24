package teste;

import static org.junit.Assert.*;
import estoque.Estoque;
import estoque.Produto;

import org.junit.Before;
import org.junit.Test;


public class EstoqueTeste {
     private Estoque estoque;

    @Before
    public void setUp() throws Exception {
        estoque = new Estoque();
        Produto produto = new Produto("Produto A", 10, 5.0);
        estoque.adicionarProduto(produto);
    }

    @Test
    public void testAdicionarEObterProduto() {
        Produto produto = estoque.getProduto("Produto A");
        assertNotNull(produto);
        assertEquals("Produto A", produto.getNome());
    }

    @Test
    public void testAtualizarQuantidade() {
        estoque.atualizarQuantidade("Produto A", 20);
        Produto produto = estoque.getProduto("Produto A");
        assertEquals(20, produto.getQuantidade());
    }

    @Test
    public void testProdutoDisponivel() {
        assertTrue(estoque.produtoDisponivel("Produto A", 5));
        assertFalse(estoque.produtoDisponivel("Produto A", 15));
    }
}
