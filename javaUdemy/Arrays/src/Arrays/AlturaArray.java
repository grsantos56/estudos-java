package Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;

public class AlturaArray {
    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de alturas a serem digitadas:");
        int qtd = entrada.nextInt();
        double[] vetor = new double[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.printf("Digite a altura %d: ", i + 1);
            vetor[i] = entrada.nextDouble();
        }
        
        double soma = 0;
        for(int i = 0; i<qtd; i++) {
        	soma += vetor[i];
        }
        double media = soma/qtd;
        System.out.printf("a media das alturas é %.2f", media);
        
        entrada.close(); 
    }
}