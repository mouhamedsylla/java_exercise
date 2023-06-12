/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jeu;

/**
 *
 * @author HP
 */
public class Principale {
    public static void main(String[] args) {
        
        Gobelet monGobelet = new Gobelet();
        
        monGobelet.getValeur();
        System.out.println("La valeur des gobelets est : "+monGobelet.getValeur());
        
        monGobelet.lancer();
        System.out.println("La valeur des gobelets est : "+monGobelet.getValeur());
        /*monGobelet.setValeur(5);
        System.out.println("La valeur des gobelets est : "+monGobelet.getValeur());*/
    }
}

