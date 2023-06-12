/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jeu;

/**
 *
 * @author HP
 */
public class Dé {
   private int valeurFace = 6;
   // la méthode getValeur() me permet de recupérer la valeur de valeurFace et me retourne la valeur ainsi recupérer
  
   public int rouler() {
     valeurFace = (int)(Math.random()*6+1);
     return valeurFace;
   };
   public int getValeur() {
       return valeurFace;
   }
   // la méthode setValeur() lui ne retourne rien mais en prend en paramètre une int qui sera attribué à la variable valeurFace 
   public void setValeur(int f) {
       valeurFace = f;
   }
}
