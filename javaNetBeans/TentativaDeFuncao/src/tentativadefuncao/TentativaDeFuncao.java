package tentativadefuncao;
import java.util.Scanner;
public class TentativaDeFuncao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int pergunta;
        System.out.println("digite 1 para ver a área do circulo e 2 para a do retangulo: ");
        pergunta = entrada.nextInt();
        if(pergunta == 1){
            System.out.println("digite o raio");
            float raio = entrada.nextFloat();
            double areaDoCirculo = circulo(raio);
            System.out.printf("a area e %.2f", areaDoCirculo);
        }else if(pergunta == 2){
            System.out.println("digite a altura");
            float altura = entrada.nextFloat();
            System.out.println("digite a largura");
            float largura = entrada.nextFloat();
            double areaDoRetangulo = quadrado(altura, largura);
            System.out.printf("a area e %.2f", areaDoRetangulo);
        }
    }
    public static float quadrado(float largura, float altura){
        return largura*altura;
    }
    public static double circulo(float raio){
        return raio*raio*3.14;
    }
}
