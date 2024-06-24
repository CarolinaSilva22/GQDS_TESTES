package vendas;


import estoque.Estoque;
import estoque.Produto;

public class Venda {
    private Estoque estoque;

    public Venda(Estoque estoque) {
        this.estoque = estoque;
    }

    public void venderProduto(String nome, int quantidade) throws Exception {
        Produto produto = estoque.getProduto(nome);
        if (produto == null || produto.getQuantidade() < quantidade) {
            throw new Exception("Quantidade insuficiente no estoque para o produto: " + nome);
        }
        produto.setQuantidade(produto.getQuantidade() - quantidade);
    }
}
