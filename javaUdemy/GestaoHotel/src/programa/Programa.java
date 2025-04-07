package programa;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.println("numero do quarto: ");
			int numeroQuarto = entrada.nextInt();
			System.out.println("data do chekin: [dd/mm/yyyy]");
			Date chekin = dataFormatada.parse(entrada.next());
			System.out.println("data do checkout: ");
			Date checkout = dataFormatada.parse(entrada.next());

			Reserva reserva = new Reserva(numeroQuarto, chekin, checkout);
			System.out.println(reserva);
			
			System.out.println("atualização de datas: ");
			System.out.println("data do chekin: [dd/mm/yyyy]");
			chekin = dataFormatada.parse(entrada.next());
			System.out.println("data do checkout: ");
			checkout = dataFormatada.parse(entrada.next());
			
			reserva.atualizarData(chekin, checkout);
			System.out.println("erro ao reservar: " + reserva);

		}catch(ParseException excecao) {
			System.out.println("formato de data invalido! ");
		}catch(Excecoes excecao) {
			System.out.println("erro ao reservar: " + excecao.getMessage());
		}catch(InputMismatchException excecao) {
			System.out.println("o campo aceita apena números! ");
		}catch(RuntimeException excecao) {
			System.out.println("erro inesperado! ");
		}
			entrada.close();
				
	}

}
