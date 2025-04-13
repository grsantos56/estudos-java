package predicado;

import java.util.function.Predicate;

public class ProdutoPredicado implements Predicate<Produto> {

	@Override
	public boolean test(Produto p) {
		
		return p.getPreco() < 2000.00;
	}
	
}
