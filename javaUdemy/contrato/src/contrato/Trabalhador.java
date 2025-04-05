package contrato;

import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public class Trabalhador {
	private String nome;
	private Senioridade senioridade;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<DataContrato> contrato = new ArrayList<>();
	
	public Trabalhador() {
		
	}
		
	public Trabalhador(String nome, Senioridade senioridade, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.senioridade = senioridade;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public void adicionarContrato(DataContrato contrato) {
		this.contrato.add(contrato);
	}
	public void removerrContrato(DataContrato contrato) {
		this.contrato.remove(contrato);
	}
	
	public double salarioTotal(int ano, int mes) {
		double soma = this.salarioBase;
		Calendar cal = Calendar.getInstance();
		for(DataContrato c: contrato) {
			cal.setTime(c.getData());
			int cAno = cal.get(Calendar.YEAR);
			int cMes = 1 + cal.get(Calendar.MONTH);
			if(ano == cAno && mes == cMes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Senioridade getSenioridade() {
		return senioridade;
	}
	public void setSenioridade(Senioridade senioridade) {
		this.senioridade = senioridade;
	}
	public Double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<DataContrato> getContrato() {
		return contrato;
	}

	
	
	
}
