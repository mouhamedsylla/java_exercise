/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table_multiplication;

/**
 *
 * @author HP
 */
import java.util.*;

public class Multiplication {
    public static void main(String[] args) {   
 
    int n = 10;
    System.out.println("Entrez la table de multiplication que vouus voulez afficher !");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    while (a!=0) {
    for ( int i = 1; i <= n; i++) {
        int resultat = a * i;
        System.out.println(a+" x "+i+" = "+resultat);
    }
    a = 0;
    }
}
}
//Exo 9 de la td java0