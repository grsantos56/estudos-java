package contrato;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat formatado = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do departamento: ");
		String nomeDepartamento = entrada.nextLine();

		System.out.println("Entre com os dados do trabalhador:");
		System.out.print("Nome: ");
		String nomeTrabalhador = entrada.nextLine();

		System.out.print("Senioridade: ");
		String senioridadeTrabalhador = entrada.nextLine();

		System.out.print("Salário base: ");
		double salarioBase = entrada.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, Senioridade.valueOf(senioridadeTrabalhador), salarioBase, new Departamento(nomeDepartamento));
		
		System.out.println("entre com a quantidade de contratos: ");
		int contratos = entrada.nextInt();
		
		for(int i = 1; i<=contratos; i++) {
			System.out.println("entre com o contrato #"+i+": ");
			System.out.println("data: DD/MM/YYYY: ");
			Date dataContrato = formatado.parse(entrada.next());
			System.out.println("valor por hora: ");
			double valorPorHora = entrada.nextDouble();
			System.out.println("duração: ");
			int duracao = entrada.nextInt();
			DataContrato contrato = new DataContrato(dataContrato, valorPorHora, duracao);
			trabalhador.adicionarContrato(contrato);
		}
		
		System.out.println();
		System.out.println("qual mes deseja ver o salario do contratado? [MM/YYYY] ");
		String mesEAno = entrada.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		System.out.println("nome: " + trabalhador.getNome());
		System.out.println("departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("salario final do periodo " + mesEAno + ": " + String.format("%.2f", trabalhador.salarioTotal(ano, mes)));
		
		
		entrada.close();
	}
}
