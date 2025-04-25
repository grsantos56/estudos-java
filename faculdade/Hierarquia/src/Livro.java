
public class Livro extends Produto{
	private String autor;	
	public Livro() {	
		super("");
		autor = "";
	}
	
	public Livro(String livro, String autor) {
		super(livro);
		this.autor = autor;	
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
