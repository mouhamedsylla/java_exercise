/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exo1;

/**
 *
 * @author HP
 */
import java.util.Scanner;
  
public class EXercice1 {
    public static void main(String[] args) {
        int[] tab;
        System.out.println("Entrer un nombre\n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tab = new int[n];
        for(int i = 0; i<=n*2; i++) {
            if((i % 2) != 0) {
                int p = i*i;
                System.out.println(i+" a pour carre "+ p);
            }
        }
    }
}
