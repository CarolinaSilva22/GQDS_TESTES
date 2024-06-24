package testes;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.mockito.Mockito;
import entidade.ChamaServico;
import entidade.Icalculadora;

public class ChamaServicoTeste {
ChamaServico cs;
@Before
public void setUp() throws Exception {
Icalculadora ical = Mockito.mock(Icalculadora.class);
Mockito.when(ical.adicionar(10, 10)).thenReturn(20);
cs = new ChamaServico();
cs.setCalc(ical);
}
@After
public void tearDown() throws Exception {
cs = null;
System.gc(); // Chamada ao Garbage Collector.
}
@Test
public void deveriaSomarDoisNumeros() {
assertEquals("ÚNICO", 20, cs.adicionarDoisNumeros(10, 10), 0);
}
}