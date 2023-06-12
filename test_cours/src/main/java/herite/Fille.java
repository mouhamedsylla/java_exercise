/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herite;

/**
 *
 * @author HP
 */
public class Fille extends Parent {
    String genre;
    public Fille(String g, String nomFilm, String acteurPrincipal, int anneeSortie) {
        super(nomFilm, acteurPrincipal, anneeSortie);
        genre = g;
    }
    
    void Afficheinfos() {
        super.Affiche();
        System.out.println("Le genre du film est: "+genre);
    }
}
