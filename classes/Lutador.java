
package ultraemojicombat;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int empates, int derrotas) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }
    
    public void apresentar(){
        System.out.println("--------------------- UEC ---------------------");
        System.out.println("Chegou a hora! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + "m de altura");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getEmpates() + " empates");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println("--------------------- UEC ---------------------");
    }
    public void status(){
        System.out.println("---------------- Estatisticas ----------------");
        System.out.println(this.getNome() + ", lutador " + this.getCategoria());
        System.out.println("Vitorias: "+ this.getVitorias());
        System.out.println("Empates: "+ this.getEmpates());
        System.out.println("Derrotas: "+ this.getDerrotas());
        System.out.println("---------------- Estatisticas ----------------");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(this.getPeso()<52){
            this.categoria = "muito leve para entrar em uma categoria";
        }else if(this.getPeso()< 73){
            this.categoria = "peso leve";
        }else if(this.getPeso() < 83.9){
            this.categoria = "peso medio";
        }else if(this.getPeso() < 120){
            this.categoria = "peso pesado";
        }else{
            this.categoria = "muito pesado para entrar em uma categoria";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
}
