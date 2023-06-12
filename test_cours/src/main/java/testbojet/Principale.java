/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbojet;
import autrepackage.*;
/**
 *
 * @author HP
 */
public class Principale {
    public static void main(String[] args) {
     
        Document doc1 = new Document();
        doc1.setTitre("La conscience de soi meme");
        doc1.setAuteur("Damasio");
        
        Document doc2 = new Document();
        doc2.setTitre("Systeme d'exploitation");
        doc2.setAuteur("Andrew Tanenbaum");
        
        if(doc1.aLeMemeTitre(doc2))
            System.out.println(doc1.getTitre()+" et "+doc2.getTitre()+" ont le meme auteur");
        else
            System.out.println(doc1.getTitre()+" et "+doc2.getTitre()+" n'ont pas le meme auteur");
        // Création d'une instance de la classe Autreclasse pour accéder à modifie()
        Autreclasse doc3 = new Autreclasse();
        
        //La méthode modifie est une méthode classe donc accéssible depuis sa propre classe ou une instance de son classe
        // Ici toutes les intances ne sont pas liées à la classe de modifie donc on peut y accéder qu'avec la classe Autreclasse ou une instance de cette classe 
         
        doc3.modifie(doc2, "Réseaux");
        //Autreclasse.modifie(doc2, "Reseaux");
        
        System.out.println(doc2.getTitre()+" est ecrit par "+doc2.getAuteur());
    }
}
