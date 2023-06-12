/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitifs;

/**
 *
 * @author HP
 */
public class Type {
    
    static public void main(String[] args) {
        int intValue = 5;
        System.out.println("la valeur est: "+intValue);
        System.out.println("La valeur max et min d'un int:"+Integer.MAX_VALUE+", "+Integer.MIN_VALUE);
        
        double valeurDouble = 5.6;
        int zero = 0;
        
        double resultatDouble = valeurDouble / zero;
        System.out.println("resultatDouble: "+resultatDouble);
        
        char ctr = 'a';
        System.out.println("char: "+ctr+", "+Character.toUpperCase(ctr));
    }
}
