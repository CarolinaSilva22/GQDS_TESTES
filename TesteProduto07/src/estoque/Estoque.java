package estoque;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<String, Produto> produtos = new HashMap<>();

    public void adicionarProduto(Produto produto) {
        produtos.put(produto.getNome(), produto);
    }

    public Produto getProduto(String nome) {
        return produtos.get(nome);
    }

    public void atualizarQuantidade(String nome, int quantidade) {
        Produto produto = produtos.get(nome);
        if (produto != null) {
            produto.setQuantidade(quantidade);
        }
    }

    public boolean produtoDisponivel(String nome, int quantidade) {
        Produto produto = produtos.get(nome);
        return produto != null && produto.getQuantidade() >= quantidade;
    }
}
