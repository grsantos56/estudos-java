
package polimorfismo;

public abstract class Animal {
    protected String nome;
    protected float peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public abstract void fazerSom();
}
