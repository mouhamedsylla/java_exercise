/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package type;

/**
 *
 * @author HP
 */
public class Type_class {
     public static void main(String[] args){
        String msg = "Hello";
        System.out.println(msg);
        System.out.println("Type is: "+msg.getClass());
        
        Integer val = 20;
        System.out.println(val);
        System.out.println("Type is: "+val.getClass());
        System.out.println("    ************     ");
        
        // POUR VOIR QUE LE NOM DU TYPE AU LIEU DU NOM COMPLET QUALIFIE DE LA CLASSE
        
         String msg2 = "Hello";
        System.out.println(msg);
        System.out.println("Type is: "+msg2.getClass().getSimpleName());

        // Integer
        Integer val2 = 20;
        System.out.println(val);
        System.out.println("Type is: "+val2.getClass().getSimpleName());

        // Character
        Character ch = 'G';
        System.out.println(ch);
        System.out.println("Type is: "+ch.getClass().getSimpleName());
    }
}
