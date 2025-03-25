/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancapt2;

/**
 *
 * @author Gabriel
 */
public class Bolsista extends Estudante{
    private int bolsa;
    
    public void renovarBolsa(){
        
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    @Override
    public void pagarMens(){
        System.out.println(this.getNome() + "e bolsista! pagamento facilitado");
    }
}
