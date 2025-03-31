package estruturafor;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class EstruturaFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero para ver sua tabuada: ");
        int num = entrada.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", num, i, num*i);
        }
    }
    
}
