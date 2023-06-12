/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bu;

/**
 *
 * @author HP
 */
public class Bibliotheque {
    Document[] lesDocs = new Document[2];
    String nomBu;
    private int indice = 0;
    
    public Bibliotheque(String nomBu) {
        this.nomBu = nomBu;
    }
    
    public void AjouterDocument(String titre, String auteur) {
        lesDocs[indice++] = new Livre(titre, auteur);
    }
    
     public void AjouterDocument(String titre, int nbPage) {
        lesDocs[indice++] = new Revue(titre, nbPage);
    }
     
    public Document[] getDocs() {
        return lesDocs;
    }
}
