package programa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	private Integer numeroQuarto;
	private Date chekin;
	private Date checkout;
	
	private static SimpleDateFormat formatado = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reserva() {
		
	}
	
	public Reserva(Integer numeroQuarto, Date chekin, Date checkout) {
		this.numeroQuarto = numeroQuarto;
		this.chekin = chekin;
		this.checkout = checkout;
	}
	
	public long duracao() {
		long duracaoMilisegundos = checkout.getTime() - chekin.getTime();
		return TimeUnit.DAYS.convert(duracaoMilisegundos, TimeUnit.MILLISECONDS) ;
	}
	
	public void atualizarData(Date chekin, Date checkout) {
		this.chekin = chekin;
		this.checkout = checkout;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getChekin() {
		return chekin;
	}

	public Date getCheckout() {
		return checkout;
	}

	@Override
	public String toString() {
		return "Reserva numeroQuarto: " + numeroQuarto + 
				", chekin: " + formatado.format(chekin) + 
				", checkout: " + formatado.format(checkout) +
				"duração: " + duracao() +
				"dias";
	}

	
	
	
}
