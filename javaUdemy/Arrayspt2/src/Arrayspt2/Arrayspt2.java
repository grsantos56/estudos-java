package Arrayspt2;
import java.util.Scanner;
public class Arrayspt2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int escolha = entrada.nextInt();
		
		Produto vetor[] = new Produto[escolha];
		
		Produto vet[] = new Produto[3];
		vet[0] = new Produto("acucar", 4.50);
		vet[1] = new Produto("sal", 1.50);
		vet[2] = new Produto("alho", 2.00);
		
		System.out.println(vet[0].getNome());
		
		for(int i=0; i < escolha; i++) {
			entrada.nextLine();
			String nome = entrada.nextLine();
			double preco = entrada.nextDouble();
			
			vetor[i] = new Produto(nome, preco);
		}
		double soma = 0;
		for(int i=0; i<escolha; i++) {
			soma += vetor[i].getPrice();
		}
		double media = soma/escolha;
		
		System.out.printf("a media dos precos foi de %f", media);
	}

}
