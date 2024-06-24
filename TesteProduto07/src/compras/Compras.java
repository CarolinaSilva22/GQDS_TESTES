package compras;

	import estoque.Estoque;
	import estoque.Produto;

	public class Compras {
	    private Estoque estoque;

	    public Compras(Estoque estoque) {
	        this.estoque = estoque;
	    }

	    public void comprarProduto(String nome, int quantidade, double preco) {
	        Produto produto = estoque.getProduto(nome);
	        if (produto == null) {
	            produto = new Produto(nome, quantidade, preco);
	            estoque.adicionarProduto(produto);
	        } else {
	            produto.setQuantidade(produto.getQuantidade() + quantidade);
	        }
	    }
	}

