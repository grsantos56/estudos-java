
package interfaces;

/**
 *
 * @author Gabriel
 */
public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto() {
    this.volume = 50;
    this.ligado = false;
    this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("esta ligado: " + this.getLigado());
        System.out.println("esta tocando: " + this.getTocando());
        System.out.print("volume: " + this.getVolume());
        for(int i = 0; i<this.getVolume(); i+=10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 1);
        }else{
            System.out.println("não foi possivel aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
    if(this.getLigado()){
            this.setVolume(this.getVolume() - 1);
        }else{
            System.out.println("não foi possivel aumentar volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }else{
            System.out.println("não foi possivel mutar");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }else{
            System.out.println("não foi possivel desmutar");
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !this.getTocando()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }

}
