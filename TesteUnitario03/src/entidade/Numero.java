package entidade;

public class Numero {
    public double raizCubica(double numero) {
        return Math.cbrt(numero);
    }

    public int fatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número deve ser não-negativo.");
        }
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public int somaIntervalo(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número deve ser não-negativo.");
        }
        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            soma += i;
        }
        return soma;
    }
}