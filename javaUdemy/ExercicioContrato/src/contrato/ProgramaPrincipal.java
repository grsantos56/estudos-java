package contrato;

import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("entre com os dados");
		System.out.println("numero do veiculo: ");
		int numeroVeiculo = entrada.nextInt();
		System.out.println("data: [dd/MM/yyyy]");
		LocalDate data = LocalDate.parse(entrada.next(), formatado);
		System.out.println("valor do contrato: ");
		double valorTotal = entrada.nextDouble();
		
		Contrato obj = new Contrato(numeroVeiculo, data, valorTotal);
		ServicoContrato contrato = new ServicoContrato(null);
		contrato.ProcessoDePagamento(obj, numeroVeiculo);
		
		System.out.println("parcelas: ");
		
		for(Parcela parcela: obj.getParcelas()) {
			System.out.println(parcela);
		}
		
		entrada.close();
	}

}
