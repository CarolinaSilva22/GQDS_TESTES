package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import estoque.Produto;

public class ProdutoTeste {
	   private Produto produto;

	    @Before
	    public void setUp() throws Exception {
	        produto = new Produto("Produto A", 10, 5.0);
	    }

	    @Test
	    public void testProduto() {
	        assertEquals("Produto A", produto.getNome());
	        assertEquals(10, produto.getQuantidade());
	        assertEquals(5.0, produto.getPreco(), 0.01);
	    }
}
