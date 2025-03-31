/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author Gabriel
 */
public class Contador {
    public static String contador(int a, int b){
        String s = "";
        for(int c = a; c<=b; c++){
            s +=c + "";
        }
        return s;
    }
}
