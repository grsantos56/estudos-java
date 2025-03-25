package programacaoorientadaaobjetos;
public class Mulher {
    private String nome;
    private float altura;
    private float peso;
    public int idade;
    
    public void status(){
        System.out.printf("nome: %s\naltura: %.2f\npeso: %.2f\nidade: %d\n", this.nome, this.altura, this.peso, this.idade);
    }
    
    public static void comer(){
        boolean fome = true;
        if(fome == true){
            System.out.println("comer");
        }
    }
    public static void reclamar(){
        boolean tudoEstaCorreto = true;
        if(tudoEstaCorreto == false){
            System.out.println("vou reclamar");
        }else{
            System.out.println("vou reclamar mesmo nada estando errado");
        }
    }
}
