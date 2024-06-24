package entidade;
public class ChamaServico {
	Icalculadora c;
public int adicionarDoisNumeros(int x, int y) {
return c.adicionar(x, y);
}
public Icalculadora getCalc() {
return c;
}
public void setCalc(Icalculadora c) {
this.c = c;
}
}
