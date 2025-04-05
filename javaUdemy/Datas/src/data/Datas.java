package data;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class Datas {

	public static void main(String[] args) {
		DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //formatando a data
		DateTimeFormatter formatado2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //conseidera o fuso do sistema local
		
		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.now();
		Instant d3 = Instant.now();
		
		Instant d4 = Instant.parse("2025-04-04T12:32:05Z"); // colocando uma data manualmente
		Instant d5 = Instant.parse("2025-04-04T12:32:05-03:00");
		LocalDate d6 = LocalDate.parse("04/05/2025", formatado); //formatando a data. O mesmo vale para horas se minutos
		LocalDateTime d7 = LocalDateTime.of(2025, 10, 15, 14, 30);
		
		System.out.println("d1 " + d1);
		System.out.println("d2 " + d2);
		System.out.println("d3 " + d3);
		System.out.println("d4 " + d4);
		System.out.println("d5 " + d5);
		System.out.println("d6 " + d6);
		System.out.println("d7 " + d7);
		
		//FORMATANDO
		
		System.out.println("d8 " + d6.format(formatado)); //assim fica do jeito que foi declarado
		System.out.println("d9 " + formatado2.format(d4));
	}

}
