
package exerciciojava;

public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //métodos
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }
    public void mostraResultado(){
        System.out.println("------------------------------");
        System.out.println("conta: " + this.getNumConta());
        System.out.println("tipo: " + this.getTipo());
        System.out.println("dono: " + this.getDono());
        System.out.println("saldo: " + this.getSaldo());
        System.out.println("status: " + this.getStatus());
        System.out.println("------------------------------");
    }
    public void abrirConta(String tipoConta){
        this.setTipo(tipoConta);
        this.setStatus(true);
        if(tipoConta.equals("CC")){
            this.setSaldo(50);
            System.out.println("voce abriu conta corrente e ganhou r$50,00");
        }else if(tipoConta.equals("CP")){
            this.setSaldo(150);
            System.out.println("voce abriu conta poupanca e ganhou r$150,00");
        }else{
            System.out.println("voce digitou informações incorretas. ");
        }
    }
    public void fecharConta(){
        if(this.saldo > 0){
            System.out.println("voce precisa sacar dinheiro da conta para fecha-la");
        }else if(this.saldo < 0){
            System.out.println("voce precisa pagar os debitos para fechar conta");
        }else{
            this.setStatus(false);
            System.out.println("conta fechada!");
        }
    }
    public void depositar(float dinheiroDepositado){
        if(this.getStatus() == true){
            this.setSaldo(getSaldo() + dinheiroDepositado); //saldo += dinheiro;
            System.out.printf("voce depositou %.2f reais na sua conta \n", dinheiroDepositado);
        }else{
            System.out.println("impossivel depositar (abra uma conta)! \n");
        }
    }
    public void sacar(float dinheiroSacado){
        if(dinheiroSacado <= this.getSaldo() && this.getStatus() == true){
            this.setSaldo(getSaldo() - dinheiroSacado);
            System.out.printf("voce sacou %.2f reais \n", dinheiroSacado);
        }else{
            System.out.println("erro ao sacar!! \n");
        }
    }
    public void pagarMensal(){
        float valorAPagar;
        if(this.tipo.equals("CC") && this.getStatus() == true){
            valorAPagar = 12.00f;
            this.setSaldo(getSaldo() - valorAPagar);
        }else if(this.tipo.equals("CP") && this.getStatus() == true){
            valorAPagar = 20.00f;
            this.setSaldo(getSaldo() - valorAPagar);
        }else{
            System.out.println("impossivel pagar menslidade");
        }
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    public int getNumConta(){
        return this.numConta;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setDono(String dono){
        this.dono = dono;
    }
    public String getDono(){
        return this.dono;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public boolean getStatus(){
        return this.status;
    }
}
