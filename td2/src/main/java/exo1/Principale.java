/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exo1;

/**
 *
 * @author HP
 */
public class Principale {
   public static void main(String[] args) {
      // Liquide nature = new Liquide();
       
      // nature.imprimer();
       //System.out.println(nature.imprimer());
       
       /*Café nature1 = new Café();
       nature1.imprimer();*/
      // System.out.println(nature1.imprimer());
       
      /* Lait nature2 = new Lait();
       nature2.imprimer();*/
      // System.out.println(nature2.imprimer());
       
       Tasse[] tasses = new Tasse[2];
       Tasse t1 = new Tasse();
       Tasse t2 = new Tasse();
       Liquide lait = new Lait();
       Liquide cafe = new Café();
       
       t1.ajouterLiquide(lait);
       t2.ajouterLiquide(cafe);
       tasses[0] = t1;
       tasses[1] = t2;
       
       for ( Tasse tasse:tasses ) {
           tasse.imprimer();
       }
    /*t1.ajouterLiquide(nature1.imprimer());
    t1.imprimer();
    System.out.println(t1.imprimer());*/
  
   
   } 
}
