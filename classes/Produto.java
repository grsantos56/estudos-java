package produto;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	public double valorEstoque() {
		return this.getPreco() * this.getQuantidade();	
	}
	public void adicionarProdutos(int quantidade) {
		this.setQuantidade(this.getQuantidade() + quantidade);
	}
	public void removerProduto(int quantidade) {
		if(this.getQuantidade() >= quantidade) {
			this.setQuantidade(this.getQuantidade() - quantidade);
		}else {
			System.out.println("você está tentando remover uma quantidade maior que o estoque");
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
