package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		try{
			String vet[] = entrada.nextLine().split(" ");
			int posicao = entrada.nextInt();
			System.out.println(vet[posicao]);
		}catch(ArrayIndexOutOfBoundsException excecaco) {
			System.out.println("voce procurou uma posição inexistente!");
		}catch(InputMismatchException excecaco) {
			System.out.println("a posição do numero deve ser algarismos numericos! ");
		}
		
		System.out.println("fim do programa!");
	}
}
