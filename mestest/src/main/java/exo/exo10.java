/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exo;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class exo10 {
    public static void main(String[] args) {
   
    int somme = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez des entiers à sommer :");
   
    while (somme != 50) {
    int entiers = sc.nextInt();
    somme = somme + entiers;
    int cpt = 0;
    if (somme == 50) {
     System.out.println("Vos sommes d'entiers ont atteint 50");
    }
    if (somme > 50) {
        somme = somme - entiers;
    System.out.println("Vos sommes d'entiers ont dépassé 50");
    System.out.println("Entrez une valeur inférieur à celui saisi précédemment: ");
    while (somme != 50){  
    int b = sc.nextInt();
    somme = somme + b;
    if ((somme < 50) || (somme > 50)){
    somme = somme - b;
    System.out.println("Entrez une autre valeurs la somme n'est toujours pas égale à 50");
    cpt++;
    }
    if (cpt == 5) {
    int c = 50 - somme;
    System.out.println("La valeur à saisir est "+c+" PAUVRE CONS!!!!!!!!!");
    }
    }
    System.out.println("Vos sommes d'entiers ont atteint 50");
    }
    
    }
    System.out.println("Bravoooo!!!!!");
    };
    }
    
    
