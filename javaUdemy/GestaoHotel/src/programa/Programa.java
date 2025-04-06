package programa;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("numero do quarto: ");
		int numeroQuarto = entrada.nextInt();
		System.out.println("data do chekin: [dd/mm/yyyy]");
		Date chekin = dataFormatada.parse(entrada.next());
		System.out.println("data do checkout: ");
		Date checkout = dataFormatada.parse(entrada.next());
		
		if(!checkout.after(chekin)) {
			System.out.println("data incorreta! ");
		}else {
			Reserva reserva = new Reserva(numeroQuarto, chekin, checkout);
			System.out.println(reserva);
			
			System.out.println("atualização de datas: ");
			System.out.println("data do chekin: [dd/mm/yyyy]");
			chekin = dataFormatada.parse(entrada.next());
			System.out.println("data do checkout: ");
			checkout = dataFormatada.parse(entrada.next());
			
			String erro = reserva.atualizarData(chekin, checkout);
			if(erro != null){
				System.out.println("erro ao reservar: " + erro);
			}else {
				System.out.println(reserva);
			}
			
			entrada.close();
			
		}
	}

}
