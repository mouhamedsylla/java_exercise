/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exo2;

/**
 *
 * @author HP
 */
public class Principale {
    public static void main(String [] args) {
        Point p1 = new Point();
        p1.getXvalue();
        p1.getYvalue();
        /* System.out.println("voici les coordonnées x ="+p1.getXvalue()+" et y ="+p1.getYvalue());
         
        p1.setXYvalue(2.5f, 5);
      System.out.println("voici les coordonnées x ="+p1.getXvalue()+" et y ="+p1.getYvalue());
      p1.deplacer(1, 1);
      System.out.println("voici les coordonnées x ="+p1.getXvalue()+" et y ="+p1.getYvalue());*/
        p1.Afficher();
        p1.setXYvalue(2.5f, 5);
        p1.Afficher();
         System.out.println("voici les coordonnées en chaines de caractère"+p1.toString());
        
    }
}
