/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exo1;

/**
 *
 * @author HP
 */
public class Tasse {
/* String contenu;
 public void ajouterLiquide(String li) {
     contenu = li;
 }
 public String imprimer() {
     return contenu;
 }*/
    
 //String contenu[] = {"café", "lait"};
    private Liquide l;
 public void ajouterLiquide(Liquide li) {
    l = li;
 };
 public void imprimer() {
    l.imprimer();
 }
 /*public void imprimer(){
  for( int i = 0; i<= contenu.length; i++) {
      String contenu1 = contenu[0];
      String contenu2= contenu[1];
  }
}*/
 
}
