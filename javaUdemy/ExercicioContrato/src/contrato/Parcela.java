package contrato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {
	private LocalDate data;
	private double quantia;
	
	private static DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
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
	@Override
	public String toString() {
		return "data " + data.format(formatado) + ", quantia=" + String.format("%.2f", quantia);
	}
	
}
