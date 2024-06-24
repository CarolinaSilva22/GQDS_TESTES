package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import entidade.Numero;

public class NumeroTeste {

	Numero n;
	@Before
	public void setUp() throws Exception {
		n = new Numero();
	}

	@Test
	public void testRaizCubica() {
		 assertEquals(3.0, n.raizCubica(27.0), 0.0);
		 assertEquals(2.71, n.raizCubica(20.0), 0.01);
	}
	
	@Test
	public void testFatorial() {
	    assertEquals(120, n.fatorial(5));
	    assertEquals(1, n.fatorial(0));
	}
	
	@Test
	public void testSomaIntervalo() {
		assertEquals(15, n.somaIntervalo(5));
        assertEquals(0, n.somaIntervalo(0));
    }

}
