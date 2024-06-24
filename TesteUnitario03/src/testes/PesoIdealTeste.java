package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import entidade.Numero;
import entidade.PesoIdeal;

public class PesoIdealTeste {

	PesoIdeal peso;
	@Before
	public void setUp() throws Exception {
		peso = new PesoIdeal();
	}

    @Test
    public void testarAbaixoDoPeso() {
        assertEquals("Abaixo do peso", peso.classificacaoIMC(18.5, 0));
    }

    @Test
    public void testarPesoNormal() {
        assertEquals("Peso normal", peso.classificacaoIMC(22.0, 0)); 
    }

    @Test
    public void testarSobrepeso() {
        assertEquals("Sobrepeso", peso.classificacaoIMC(27.5, 0));
    }

    @Test
    public void testarObeso() {
        assertEquals("Obeso", peso.classificacaoIMC(35.0, 0)); 
    }

    @Test
    public void testarObesoMorbido() {
        assertEquals("Obeso mórbido", peso.classificacaoIMC(45.0, 0)); 
    }


}
