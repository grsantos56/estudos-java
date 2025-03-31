package produto;

public class Principal {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.setNome("tv");
		p1.setPreco(2249.90);
		p1.setQuantidade(10);
		
		System.out.println(p1.getNome());
		System.out.println(p1.getPreco());
		System.out.println(p1.getQuantidade());
		
		p1.adicionarProdutos(5);
		System.out.println(p1.getQuantidade());
		
		p1.valorEstoque();
		System.out.println(	p1.valorEstoque());
		
		
	}

}
