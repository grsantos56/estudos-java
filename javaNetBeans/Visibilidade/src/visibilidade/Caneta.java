
package visibilidade;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    public Caneta(String m, float p, boolean t, String c ){
        this.modelo = m;
        this.ponta = p;
        this.tampada = t;
        this.cor = c;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public boolean getTampada(){
        return this.tampada;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("o modelo da caneta é " + this.modelo);
        System.out.println("a ponta da caneta e "+ this.ponta);
        System.out.println("a cor da caneta e "+this.cor);
        System.out.println("a caneta esta tampada "+this.tampada);
    }
}
