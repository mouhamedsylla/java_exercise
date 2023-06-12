/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jeu;

/**
 *
 * @author HP
 */
public class Gobelet {
    // La classe gobelet nous permet de créer des référencce à l'objet Dé
    // Créer des références à l'objet Dé revient à intancier la classe Dé
    //Et ici l'instatiation nous permet de créer 2 objets de type la classe Dé
 private Dé d1 = new Dé();
 private Dé d2 = new Dé();
  
 public void lancer() {
  d1.rouler();
  d2.rouler();
 };
 public int getValeur() {
     return d1.getValeur()+d2.getValeur();
 }
 public void setValeur(int f) {
     d1.setValeur(f);
     d2.setValeur(f);
 }
 
}
