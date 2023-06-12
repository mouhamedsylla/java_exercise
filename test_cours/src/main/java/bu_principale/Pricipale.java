/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bu_principale;
import bu.*;
/**
 *
 * @author HP
 */
public class Pricipale {    
    public static void main(String[]  args) {
    //Document[] docs = new Document[5];
    //Document est une class abstract donc ne peut pas etre instancier
    //Document doc1 = new Document();
    //On peut alors créer une tableau de type Document parce qu'il peut contenir des sous type dérivée de lui
    //docs[0] = new Livre("Conscience de soi", "Damasio");
    //docs[1] = new Revue("Java magazine", 150);    
    //for(int i=0; i<2; i++) {
    //    System.out.println("Document "+i+": "+docs[i].Affiche());
    //}
    
    Bibliotheque bu1 = new Bibliotheque("Sylla");
    
    bu1.AjouterDocument("Operating System", "Andrew Tanenbaum");
    bu1.AjouterDocument("Linux Magazine", 100);
     int n = 0;
    for(Document doc : bu1.getDocs()) {
        n++;
        System.out.println("Document "+n+": "+doc.Affiche());
    }
    }
}
