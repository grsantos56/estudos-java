
package estruturadecondicao;
import java.util.Scanner;
public class EstruturaDeCondicao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite a primeira not do aluno");
        float nota1 = entrada.nextFloat();
        System.out.println("digite a segunda nota do aluno");
        float nota2 = entrada.nextFloat();
        float media = (nota1+nota2)/2;
        System.out.printf("a media do aluno foi %.2f\n", media);
        if(media>=7){
            System.out.println("aluno aprovado");
        }else{
            System.out.println("aluno reprovado");
        }
        
    }
    
}
