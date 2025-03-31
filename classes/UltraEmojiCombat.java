package ultraemojicombat;

public class UltraEmojiCombat {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("lULA", "Brasil", 70, 1.65f, 79.5f, 0, 0, 0); 
        l[1] = new Lutador("BOLSONARO", "Brasil", 65, 1.75f, 81.5f, 0, 0, 0); 
        Luta uec1 = new Luta();
        uec1.marcarLuta(l[0], l[1]);
        uec1.lutar();
        l[0].status();
        l[1].status();
    }
    
}
