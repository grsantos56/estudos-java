package data;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
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
		System.out.println();
		System.out.println();
		System.out.println("d8 " + d6.format(formatado)); //assim fica do jeito que foi declarado
		System.out.println("d9 " + formatado2.format(d4));
		
		//HORAS
		System.out.println();
		LocalDateTime h1 = LocalDateTime.ofInstant(d5, ZoneId.systemDefault());
		LocalDateTime h2 = LocalDateTime.ofInstant(d5, ZoneId.of("Portugal"));
		
		
		System.out.println("h1 " + h1);
		System.out.println("h2 " + h2);
		
		//MÉTODOS GET
		System.out.println();
		System.out.println("d4 dia: "+ d2.getDayOfMonth());
		System.out.println("d4 mês: "+ d2.getMonthValue());
		System.out.println("d4 ano: "+ d2.getYear());
		
		//CALCULOS COM DATAS
		System.out.println();
		LocalDateTime semanaAnterior = d2.minusDays(7);
		LocalDateTime proximaSemana = d2.plusDays(7);
		
		Instant semanaAnteirorInstant = d4.minus(7, ChronoUnit.DAYS);
		Instant proximaSemanaInstant = d4.plus(7, ChronoUnit.DAYS);
		
		System.out.println("semana anterior de d2: " + semanaAnterior);
		System.out.println("proxima semana de d2: " + proximaSemana);
		System.out.println("semana anterior de d4: " + semanaAnteirorInstant);
		System.out.println("proxima semana de d4: " + proximaSemanaInstant);
		
		//DURÇÃO
		System.out.println();
		Duration t1 = Duration.between(semanaAnteirorInstant, d4);
		Duration t2 = Duration.between(semanaAnterior, d1.atTime(0, 0)); //atTime serve para zerar ass horas e minutos ou o metodo atStartOfDay()
		
		System.out.println("diferença de tempo: " + t1.toDays() + " dias");
		System.out.println("diferença de tempo: " + t2.toDays() + " dias");
		
	}

}
