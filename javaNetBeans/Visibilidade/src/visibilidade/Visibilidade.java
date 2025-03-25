/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package visibilidade;

/**
 *
 * @author Gabriel
 */
public class Visibilidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Caneta c1 = new Caneta();
        c1.setModelo("bic");
        c1.setPonta(0.5f);
        System.out.println("tenho uma caneta do modelo " + c1.getModelo());
        System.out.println("a caneta esta tamapda "+ c1.getTampada());
        c1.status();*/
        Caneta c1 = new Caneta("bic", 0.5f, true, "azul");
        c1.status(); 
    }
    
}
