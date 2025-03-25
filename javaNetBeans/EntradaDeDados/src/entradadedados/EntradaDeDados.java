package entradadedados;

import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.printf("muito prazer %s voce tem %d anos\n", nome, idade);
    }
    
}
