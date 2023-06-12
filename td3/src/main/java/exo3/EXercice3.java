/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exo3;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class EXercice3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer votre mot :");
        int cpt0 = 0, cpt1 = 0, cpt2 = 0, cpt3 = 0, cpt4 = 0, cpt5 = 0;
        String mot = sc.next();
        String test = mot.toLowerCase();
        char[] tab = {'a','e','i','o','u','y'};
        for(int i = 0; i < test.length(); i++) {
            
            switch(test.charAt(i)) {
                    case 'a':
                        cpt0++;
                        break;
                    case 'e':
                        cpt1++; 
                        break;
                    case 'i':
                        cpt2++; 
                        break;
                    case 'o':
                        cpt3++; 
                        break;
                    case 'u':
                        cpt4++; 
                        break;
                    case 'y':
                        cpt5++;
                        break;
                     }
                   }
        System.out.println(cpt0+" fois la lettre a");
        System.out.println(cpt1+" fois la lettre e");
        System.out.println(cpt2+" fois la lettre i");
        System.out.println(cpt3+" fois la lettre o");
        System.out.println(cpt4+" fois la lettre u");
        System.out.println(cpt5+" fois la lettre y");
    }
}
