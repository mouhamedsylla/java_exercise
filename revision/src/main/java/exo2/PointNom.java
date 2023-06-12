/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exo2;

/**
 *
 * @author HP
 */
public class PointNom extends Point{
    private char nom;
    
    public void setPointNom(int x, int y, char n) {
        setPoint(x, y);
        nom = n;
    }
    public void setNom(char n) {
        nom = n;
    }
    public void affCoordNom() {
        affCoord();
        System.out.println("Le nom du point est :"+nom);
    }
}
