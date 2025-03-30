package estruturawhile;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class EstruturaWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("soma de numeros pares");
        int numPar = 0;
        while(true){
            System.out.println("digite varios numeros e verifique a soma dos pares [0] para finalizar programa");
            int usuario = entrada.nextInt();
            if(usuario == 0){
                break;
            }
            else if(usuario%2==0){
                numPar += usuario;
            }
        }System.out.printf("a soma dos pares foi %d ", numPar);
    }
    
}
