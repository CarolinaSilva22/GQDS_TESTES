package entidade;

public class EquacaoSegundoGrau {
   
	public String resolverEquacaoSegundoGrau(double a, double b, double c) {
        if (a == 0 && b == 0 && c == 0) {
            return "Igualdade confirmada: 0 = 0";
        } else if (a == 0 && b == 0) {
            return "Coeficientes informados incorretamente";
        } else if (a == 0) {
            double x = -c / b;
            return "Esta é uma equação de primeiro grau: x = " + x;
        } else {
            double delta = calcularDelta(a, b, c);
            if (delta < 0) {
                return "Esta é uma equação de segundo grau. Esta equação não possui raízes reais (delta < 0): delta = " + delta;
            } else if (delta == 0) {
                double x = -b / (2 * a);
                return "Esta é uma equação de segundo grau. Esta equação possui duas raízes reais iguais: x' = x'' = " + x;
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                return "Esta é uma equação de segundo grau. Esta equação possui duas raízes reais diferentes: delta = " + delta + ", x' = " + x1 + ", x'' = " + x2;
            }
        }
	}
	    	private double calcularDelta(double a, double b, double c) {
	            return b * b - 4 * a * c;
	        }
	    }