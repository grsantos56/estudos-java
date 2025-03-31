package exerciciojava;


public class ExercicioJava {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setDono("Gabriel Rodrigues dos Santos");
        p1.setNumConta(202503210);
        p1.abrirConta("CP");
        p1.mostraResultado();
        p1.depositar(500f);
        p1.mostraResultado();
        p1.sacar(200);
        p1.mostraResultado();

    }
    
}
