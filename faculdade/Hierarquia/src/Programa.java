
public class Programa {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setNome("a volta dos que não foram");
		livro.setAutor("jubileu");
		System.out.println(livro.getAutor());
		System.out.println(livro.getNome());
	}

}
