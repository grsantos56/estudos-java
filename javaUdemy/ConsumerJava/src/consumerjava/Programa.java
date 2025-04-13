package consumerjava;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		List<Produto> produto = new ArrayList<>();
		produto.add(new Produto("tv", 3500.00));
		produto.add(new Produto("notebook", 3000.00));
		produto.add(new Produto("tablet", 1500.00));
		produto.add(new Produto("celular", 2000.00));
		
		produto.forEach(new AtualizaPreco());
		
		produto.forEach(System.out::println);
	}

}
