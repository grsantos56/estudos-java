package programacaoorientadaaobjetos;
public class ProgramacaoOrientadaAObjetos {
    public static void main(String[] args) {
        Mulher m1 = new Mulher();
        m1.altura = (float) 1.60;
        m1.idade = 23;
        m1.nome = "Maria";
        m1.peso = (float) 55.20;
        m1.status();
        m1.reclamar();
    }
    
}
