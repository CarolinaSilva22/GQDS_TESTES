package entidade;

public class MediaVetores {
    public static void main(String[] args) {
        double[] vet1 = { 90, 88, 78, 76 };
        double[] vet2 = { 865, 564, 43, 12 };

        double mediaVet1 = calcularMedia(vet1);
        double mediaVet2 = calcularMedia(vet2);

        System.out.println("Média do vetor 1: " + mediaVet1);
        System.out.println("Média do vetor 2: " + mediaVet2);
    }

    public static double calcularMedia(double[] vetor) {
        double soma = 0;
        for (double valor : vetor) {
            soma += valor;
        }
        return soma / vetor.length;
    }

}
