package ultraemojicombat;
import java.util.Random;
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        System.out.println("#########################-DESAFIANTE-#########################");
        this.desafiante.apresentar();
        System.out.println("#########################-DESAFIADO-#########################");
        this.desafiado.apresentar();
        Random aleatorio = new Random();
        int vencedor = aleatorio.nextInt(3);
        System.out.println("--------------------- RESULTADO DA LUTA ---------------------");
        switch(vencedor){
            case 0:
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                System.out.println("A luta ficou empate!");
                break;
            case 1:
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                System.out.println("O lutador " + this.desafiado.getNome() + " foi o campeao");
                break;
            case 2:
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();
                System.out.println("O lutador " + this.desafiante.getNome() + " foi o campeao");
                break;
            default:
                break;
        }
        System.out.println("--------------------- RESULTADO DA LUTA ---------------------");
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
