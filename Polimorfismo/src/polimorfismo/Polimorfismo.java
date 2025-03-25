
package polimorfismo;

public class Polimorfismo {
    public static void main(String[] args) {
       Gato g1 = new Gato();
       g1.fazerSom();
       Cachorro c1 = new Cachorro();
       c1.fazerSom();
       c1.setNome("tampinha");
        System.out.println(c1.getNome());
    }
    
}
