package contrato;

import java.time.LocalDate;

public class Parcela {
	private LocalDate data;
	private double quantia;
	public Parcela() {
		
	}
	public Parcela(LocalDate data, double quantia) {
		super();
		this.data = data;
		this.quantia = quantia;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public double getQuantia() {
		return quantia;
	}
	public void setQuantia(double quantia) {
		this.quantia = quantia;
	}
	
}
