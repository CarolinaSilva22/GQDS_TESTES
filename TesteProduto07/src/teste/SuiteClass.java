package teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ComprasTeste.class, EstoqueTeste.class, ProdutoTeste.class, VendaTeste.class })
public class SuiteClass {

}
