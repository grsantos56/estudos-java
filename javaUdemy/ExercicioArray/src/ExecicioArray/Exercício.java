package ExecicioArray;
import java.util.Scanner;

public class Exercício {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Hotel vet[] = new Hotel[10];

        System.out.print("Quantos hóspedes deseja registrar? ");
        int hospedes = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < hospedes; i++) { 
            System.out.printf("Digite o nome do %d° hóspede: ", i + 1);
            String nome = entrada.nextLine();

            System.out.printf("Digite o email do %d° hóspede: ", i + 1);
            String email = entrada.nextLine(); 

            System.out.print("Qual quarto ele deseja ficar? (0-9): ");
            int numEscolhido = entrada.nextInt();
            entrada.nextLine(); 

            if (numEscolhido < 0 || numEscolhido >= vet.length) {
                System.out.println("Número de quarto inválido! Escolha entre 0 e 9.");
                i--; 
                continue;
            }

            if (vet[numEscolhido] != null) {
                System.out.println("Este quarto já está ocupado! Escolha outro.");
                i--;
                continue;
            }

            vet[numEscolhido] = new Hotel(nome, email);
        }

        System.out.println("\nLista de quartos ocupados:");
        for (int i = 0; i < vet.length; i++) { 
            if (vet[i] != null) {
                System.out.println("Quarto " + i + ": " + vet[i]); 
            }
        }

        entrada.close(); 
    }
}
