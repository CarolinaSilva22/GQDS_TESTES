package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.EquacaoSegundoGrau;

public class TesteEquacaoSegundoGrau {
	    EquacaoSegundoGrau servico;
	
		@Before
		public void setUp() throws Exception {
			servico = new EquacaoSegundoGrau();
		}
		
	    @Test
	    public void testarIgualdadeConfirmada() {
	        assertEquals("Igualdade confirmada: 0 = 0", servico.resolverEquacaoSegundoGrau(0, 0, 0));
	    }

	    @Test
	    public void testarCoeficientesIncorretos() {
	        assertEquals("Coeficientes informados incorretamente", servico.resolverEquacaoSegundoGrau(0, 0, 8));
	    }

	    @Test
	    public void testarEquacaoPrimeiroGrau() {
	        assertEquals("Esta é uma equação de primeiro grau: x = 4.0", servico.resolverEquacaoSegundoGrau(0, 2, -8));
	    }

	    @Test
	    public void testarSemRaizesReais() {
	        assertEquals("Esta é uma equação de segundo grau. Esta equação não possui raízes reais (delta < 0): delta = -464.0",
	                servico.resolverEquacaoSegundoGrau(10, -4, 12));
	    }

	    @Test
	    public void testarDuasRaizesIguais() {
	        assertEquals("Esta é uma equação de segundo grau. Esta equação possui duas raízes reais iguais: x' = x'' = 0.5",
	                servico.resolverEquacaoSegundoGrau(4, -4, 1));
	    }

	    @Test
	    public void testarDuasRaizesDiferentes() {
	        assertEquals("Esta é uma equação de segundo grau. Esta equação possui duas raízes reais diferentes: delta = 8.0, x' = -1.585786437626905, x'' = -4.414213562373095",
	                servico.resolverEquacaoSegundoGrau(1, 6, 7));
	    }
	}
