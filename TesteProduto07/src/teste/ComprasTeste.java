package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import compras.Compras;
import estoque.Estoque;
import estoque.Produto;

public class ComprasTeste {
    private Estoque estoque;
    private Compras compras;

    @Before
    public void setUp() throws Exception {
        estoque = new Estoque();
        compras = new Compras(estoque);
    }

    @Test
    public void testComprarProduto() {
        compras.comprarProduto("Produto A", 10, 5.0);
        Produto produto = estoque.getProduto("Produto A");
        assertNotNull(produto);
        assertEquals(10, produto.getQuantidade());
        assertEquals(5.0, produto.getPreco(), 0.01);
    }
}
