/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exo2;

/**
 *
 * @author HP
 */
public class Point {
        private int x, y;
    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void deplacer(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public void affCoord() {
        System.out.println("Coordonnées :"+x+" "+y);
    }
    
}
