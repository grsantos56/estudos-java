/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;
import java.util.Scanner;
public class While {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int soma = 0;
        String pergunta;
        while(true){
            System.out.println("digite um número: ");
            num = entrada.nextInt();
            soma += num;
            System.out.println("deseja continuar? [S/N]");
            pergunta = entrada.next();
            if(!pergunta.equals("S")){ // SE COLOCAR PERGUNTA != "S" NÃO DA CERTO PORQUE NÃO SE COMPARA STRINGS DESSA FORMA NO JAVA, POR ISSO FOI USADO .equals
                break;
            }
        }
        System.out.printf("a soma dos numeros foi %d\n", soma);
    }
    
}
