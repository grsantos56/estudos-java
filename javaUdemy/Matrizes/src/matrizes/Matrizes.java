package matrizes;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int elementos = entrada.nextInt();
		int matriz[][] = new int[elementos][elementos];
		for(int i = 0; i< matriz.length; i++) {
			for(int j = 0; j< matriz[i].length; j++) {
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		for(int i = 0; i< matriz.length; i++) {
			for(int j = 0; j< matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}System.out.println();
		System.out.println("diagonal pricipal");
		for(int i = 0; i< matriz.length; i++) {
			System.out.println(matriz[i][i] + " ");
		}
		
		int contador = 0;
		for(int i = 0; i< matriz.length; i++) {
			for(int j = 0; j< matriz[i].length; j++) {
				if(matriz[i][j] < 0) {
					contador ++;
				}
			}
		}System.out.println("numeros negativos: " + contador);
	}

}
