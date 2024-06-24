package entidade;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;


public class OperacoesTeste {
	
	Operacoes objetoOp;
	
	
	
	@Before
	public void setUp() throws Exception {
		objetoOp = new Operacoes();
	}
		
	@After
	public void tearDown() throws Exception {
		objetoOp = null;
		System.gc();
	}

	@Test
	public void testeMaiorValor() {
	
		assertEquals("TESTE 1:", 16, objetoOp.maiorValor(16, 9), 0); 
	}

	@Test
	public void testeMenorValor() {
	
		assertTrue("TESTE 2: ", objetoOp.menorValor(16, 9) == 9);	
	}
	
	@Test
	public void testeProduto() {
		assertFalse("TESTE 3: ", objetoOp.produto(16, 5) == 81);
	}	
}
