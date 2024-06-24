package entidade;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OperacoesTESTE {

	Operacoes op1, op2;
	@Before
	public void setUp() throws Exception {
	
	op1 = new Operacoes();
	op2 = new Operacoes();
	}
	@Test
	public void testMaiorValor() {
		 assertEquals(16, maiorValor(16, 9)); // CASO 1
	     assertEquals(17, maiorValor(16, 9), 0.01); // CASO 2 com delta
	     assertEquals(15, maiorValor(16, 9), 0.01); // CASO 3 com delta
	}
	
	public int maiorValor(int a, int b) {
        return Math.max(a, b);
	}

	@Test
	public void testMenorValor() {
		 assertFalse(menorValor(16, 9)); // CASO 4
	     assertTrue(menorValor(16, 9));  // CASO 5
	    }
	    public boolean menorValor(int a, int b) {
	        return a < b;
	    }
	    
	@Test
	public void testRaizQuadrada() {
		   assertEquals(9.380, raizQuadrada(88), 0.001); // CASO 8 com delta
    }

    public double raizQuadrada(double numero) {
        return Math.sqrt(numero);
	}

	@Test
	public void testDivide() {
		 assertEquals(25, divisao(50, 2), 0);    // CASO 9
	        assertEquals(0, divisao(50, 0), 0);     // CASO 10
	        assertEquals(0, divisao(0, 0), 0);      // CASO 11
	    }

	    public double divisao(double dividendo, double divisor) {
	        if (divisor == 0) {
	            throw new ArithmeticException("Divisão por zero");
	        }
	        return dividendo / divisor;
	}

	@Test
	public void testProduto() {
		 assertEquals(1_000_000_000, produto(1_000_000, 1_000_000)); // CASO 12
    }

    public int produto(int a, int b) {
        return a * b;
	}

	@Test
	public void testSoma() {
		 assertEquals(20, soma(10, 10));       // CASO 13
	        assertFalse(soma(10, 10) == 21);      // CASO 14
	        assertTrue(soma(10, 10) == 20);       // CASO 15
	    }

	    public int soma(int a, int b) {
	        return a + b;
	}

    @Test
    public void deveriaCompararDoisObjetos() {
        Object objeto1 = new Object();
        Object objeto2 = objeto1;

        assertSame(objeto1, objeto2);   // CASO 6

        verificandoHashDosObjetos(objeto1, objeto2);
    }

    public void verificandoHashDosObjetos(Object obj1, Object obj2) {
        System.out.println("Endereço hash do objeto 1: " + obj1.hashCode());
        System.out.println("Endereço hash do objeto 2: " + obj2.hashCode());
    }
    
    @Test(timeout = 100)
    public void verificandoTempoDeExecucaoAcumulador() {
        acumulador();
    }

    public void acumulador() {
        long startTime = System.currentTimeMillis();
        long count = 0;
        while (System.currentTimeMillis() - startTime < 50) { // Simulando uma operação que leva tempo
            count++;
        }
    }
}
