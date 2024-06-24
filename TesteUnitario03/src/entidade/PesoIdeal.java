package entidade;

public class PesoIdeal {
    
    public String classificacaoIMC(double peso, double altura) {
        double imc = peso / (altura * altura);

        if (imc < 20) {
            return "Abaixo do peso";
        } else if (imc >= 20 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobre peso";
        } else if (imc >= 30 && imc < 40) {
            return "Obeso";
        } else {
            return "Obeso mórbido";
        }
    }
}