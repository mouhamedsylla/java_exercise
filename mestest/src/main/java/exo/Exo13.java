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
public class Exo13 {
  //Equation second degré
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Saisissez vos réels dans l'ordre suivant (a, b, c) :");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    
    //Calcul de delta
    double D = (b*b) - (4*a*c);
    System.out.println(D);
    //Vérifions le signe de D pour trouver les solutions possible
    
    /*** Si D est positif ***/
    if (D > 0) {
        double x1 = (-b-Math.sqrt(D))/2*a;
        double x2 = (-b+Math.sqrt(D))/2*a;
        
        System.out.println("L'équation admet deux solutions réels:\n"+"x1 ="+x1+" et x2 ="+x2);
                //System.out.println(x1);
               // System.out.println(x2);
    }
    if (D == 0) {
        double x0 = -b/(2*a);
        System.out.println("L'équation admet une solution réel:\n"+"x0 ="+x0);
    }
    if (D < 0) {
    System.out.println("L'équation n'admet pas de solution");
    }
    }
    }
      
