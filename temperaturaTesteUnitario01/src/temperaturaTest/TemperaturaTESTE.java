package temperaturaTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TemperaturaTESTE {

	Temperatura ObjTemp;
	@Before
	public void setUp() throws Exception {
		ObjTemp = new Temperatura();
	}

	@Test
	public void deveriaConverterCelsiusParaParenheit() {
		assertEquals(23.0, converterCelsiusParaFahrenheit(-5), 0.01); // CASO 1
        assertEquals(32.0, converterCelsiusParaFahrenheit(0), 0.01);  // CASO 2
        assertEquals(64.4, converterCelsiusParaFahrenheit(18), 0.01); // CASO 3
	}
	
	public double converterCelsiusParaFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
	@Test
	public void deveriaConverterCelsiusParaKelvin() {
		  assertEquals(268.15, converterCelsiusParaKelvin(-5), 0.01); // CASO 4
	        assertEquals(273.15, converterCelsiusParaKelvin(0), 0.01);  // CASO 5
	        assertEquals(291.15, converterCelsiusParaKelvin(18), 0.01); // CASO 6
	    }

	    public double converterCelsiusParaKelvin(double celsius) {
	        return celsius + 273.15;
	    }
	@Test
	public void deveriaClassificarTemperatura() {
	    assertEquals("NEGATIVA", classificarTemperatura(-5)); // CASO 7
        assertEquals("ZERO", classificarTemperatura(0));     // CASO 8
        assertEquals("POSITIVA", classificarTemperatura(18)); // CASO 9
    }

    public String classificarTemperatura(double celsius) {
        if (celsius < 0) {
            return "NEGATIVA";
        } else if (celsius == 0) {
            return "ZERO";
        } else {
            return "POSITIVA";
        }
	}
	@Test
	public void deveriaValidarConversaoCelsiusFarenheit() {
		        assertTrue(validarConversaoCelsiusFahrenheit(-5, 23)); // CASO 10
		    }

		    public boolean validarConversaoCelsiusFahrenheit(double celsius, double valorEsperadoFahrenheit) {
		        double resultadoFahrenheit = converterCelsiusParaFahrenheit(celsius);
		        return Math.abs(resultadoFahrenheit - valorEsperadoFahrenheit) < 0.01;
		    }

		    public double deveriaValidarConversaoCelsiusFarenheit(double celsius) {
		        return celsius * 9 / 5 + 32;
	

}
}
