package comparable;

public class Funcionario implements Comparable<Funcionario> {
	private String nome;
	private double salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public int compareTo(Funcionario o) {
		// TODO Auto-generated method stub
		return nome.compareTo(o.getNome());
	}
	
	
	
}
