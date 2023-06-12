/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Taxi {
    private int mat;
    private String nom;
    private int kilometrage;
    
    public Taxi (int m, String n, int k) {
        mat = m;
        nom = n;
        kilometrage = k;
    }
    
    public void affiche() {
        System.out.println("Nom: "+nom+"\n"+"Matricule: "+mat+"\n"+"Kilométrage: "+kilometrage);
    }
   
    final int KILIMETRAGE_MAX = 100000;
    
    public void déplacement(int x) {
        kilometrage += x;
    }
    
    public String est_dépassé() {
        if (kilometrage > KILIMETRAGE_MAX)
            return "Kilométrage non dépasser";
        else
            return "Kilométrage dépassé";
    }
}
    
