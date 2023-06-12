/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sta;

/**
 *
 * @author HP
 */
public class Statique {
    static int nb_objet;
    String nom;
    String prenom;
    int age;
    public Statique(String p, String n, int a) {
       prenom = p;
       nom = n;
       age = a;
       nb_objet++;
    }
    public static int getNbPersonne() {
        return nb_objet;
    }
}
