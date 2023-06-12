/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbojet;

/**
 *
 * @author HP
 */
public class Document {
    private String titre;
    private String auteur;
    //une variable static pour compter le nombre de document créer
    static int compteur;
    public Document() {
        //A chaque qu'une objet est instancier compteur sera incrémenté
        compteur++;
    }
    //Ici nos methode setter et getter ont des visibilité par défaut donc packages
    //Si on veut par exemples les utliser dans une classe d'une auteur package, il faut la déclarer public
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    String getTitre () {
        return titre;
    }
    
    String getAuteur() {
        return auteur;
    }
    public boolean aLeMemeTitre(Document doc){
        return this.titre == doc.titre;
    }
}
