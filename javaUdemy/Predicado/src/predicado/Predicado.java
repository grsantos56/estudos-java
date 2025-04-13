package predicado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Predicado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto("tv", 2000.00));
		lista.add(new Produto("notebook", 2500.00));
		lista.add(new Produto("tablet", 1500.00));
		
		lista.removeIf(new ProdutoPredicado());
		
		for(Produto p: lista) {
			System.out.println(p);
		}
	}

}
