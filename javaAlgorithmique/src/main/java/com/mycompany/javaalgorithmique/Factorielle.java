/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaalgorithmique;

/**
 *
 * @author sylla
 */
public class Factorielle {
    int i = 0;
    int fact = 1;
    int n;
    
    public int calculFactorielle(int n) {
        while(i<n) {
            i = i + 1;
            fact = fact * i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        Factorielle f = new Factorielle();
       int result = f.calculFactorielle(12);
       
       System.out.println("Resultat: "+result);
    }
    
}
