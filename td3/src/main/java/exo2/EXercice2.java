/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exo2;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class EXercice2 {
    public static void main(String[] args) {
        float[] tab = new float[5];
        float som = 0, moy;
        float max = 0, min =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer 5 valeurs :\n");
        for(int i = 0; i < 5; i++) {
            tab[i] = sc.nextFloat();
            som = som + tab[i];
            max = tab[0];
            min = tab[0];
        }
        for(int i = 1; i < 5; i++) {
            if((tab[i-1] < tab[i]) && (max < tab[i]))
                max = tab[i];
            if((tab[i-1] > tab[i]) && (tab[i] < min))
                min = tab[i];
        }
        moy = som / 2;
        System.out.println("La moyenne est : "+ moy);
        System.out.println("La plus grande est : "+ max);
        System.out.println("La plus petite est : "+min);
    }
}
