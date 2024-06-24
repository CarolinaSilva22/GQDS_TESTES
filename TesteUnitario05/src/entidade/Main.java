
import entidade.Produto;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        boolean clienteVIP = false;
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Arroz", 5, 18.75));
        produtos.add(new Produto("Feijão", 1, 4.95));
        produtos.add(new Produto("Leite", 1, 3.49));

        double total = calcularTotal(produtos, clienteVIP);
        System.out.println(total);
    }

    public static double calcularTotal(ArrayList<Produto> produtos, boolean clienteVIP) {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco() * produto.getQuantidade();
        }

        total = aplicarDesconto(total, clienteVIP);
        total = adicionarTaxaEntrega(total);
        return total;
    }

    private static double aplicarDesconto(double total, boolean clienteVIP) {
        if (clienteVIP) {
            return total * 0.90;
        } else {
            return total * 0.95;
        }
    }

    private static double adicionarTaxaEntrega(double total) {
        DayOfWeek diaSemana = LocalDate.now().getDayOfWeek();
        if (diaSemana == DayOfWeek.SUNDAY) {
            return total + 10.00;
        } else {
            return total + 5.00;
        }
    }
}

