
package estruturaderepeticao;

import java.util.Scanner;

public class EstruturaDeRepeticao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero para ver sua tabuada");
        int numero = entrada.nextInt();
        for(int contador = 1; contador<=10; contador++){
            System.out.printf("%d x %d = %d\n",numero,contador,numero*contador);
        }
    }
    
}
