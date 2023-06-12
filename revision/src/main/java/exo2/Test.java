/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exo2;

/**
 *
 * @author HP
 */
public class Test {
    public static void main(String[] args) {
        PointNom p1 = new PointNom();
 
        p1.setPointNom(1, 2, 'A');
        p1.affCoordNom();
        
        p1.deplacer(1, 5);
        p1.affCoordNom();
        
        PointNom p2 = new PointNom();
        
        p2.setNom('B');
        p2.setPoint(2, 3);
        
        p2.affCoordNom();
        
        
    }
}