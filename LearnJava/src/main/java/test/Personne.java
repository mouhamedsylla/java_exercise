/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author HP
 */
public class Personne {
    String nom;
    String prenom;
    int age;
    static int nbPersonne;
    public void setPersonne(String n, String p, int a) {
        nom = n;
        prenom = p;
        age = a;
        
        nbPersonne++;
    }
    
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public int getAge() {
        return age;
    }
 
   
    
}
