/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exo;

/**
 *
 * @author HP
 */
import java.util.*;
public class Exo7 {
  public static void main(String[] args) {
      int r;
      Scanner sc = new Scanner(System.in);
      System.out.println("Entrez deux nombre et ensuite l'opérateur");
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      String c = sc.next();
      String op = c;      
      
      
      switch(op) {
          case "+" : r = a + b;
          System.out.println("La somme est de l'addition : "+r);
          break;
          case "-" : r = a - b;
          System.out.println("Le résultat est de la soustraction : "+r);
          break;
          case "/" : r = a / b;
          System.out.println("Le résultat est de la division : "+r);
          break;
          default : System.out.println("L'opérateur est inconnue!");
      }
  }  
}
