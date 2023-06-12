/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangle;

/**
 *
 * @author HP
 */
import java.util.*;
public class TriangleIsocele {
    public static void main(String[] args) {
        int h;
        //int nbespace;
        int nbetoile = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre de ligne: ");
        h = sc.nextInt();
        //nbespace = (h*2) /2;
        for(int i=0; i< h ; i++) {
           /* for(int j=0; j<nbespace; j++) 
                System.out.print(' ');
            nbespace--;*/
            for(int k=0; k<nbetoile; k++) 
                System.out.print('*');
            System.out.println();
            nbetoile += 2;   
        }
    }
}
