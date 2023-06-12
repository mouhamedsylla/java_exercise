/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herite;

/**
 *
 * @author HP
 */
public class Parent {
    protected String nomFilm;
    protected String acteurPrincipal;
    protected int anneeSortie;
    
    public Parent(String n, String ac, int a) {
        nomFilm = n;
        acteurPrincipal = ac;
        anneeSortie = a;
    }
    
    public void Affiche() {
        System.out.println("Le film "+nomFilm+" est sortie en "+anneeSortie+", l'acteur principal est incarné par "+acteurPrincipal);
    }
}
