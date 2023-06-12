/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exo1;

/**
 *
 * @author HP
 */
public class Point {
    private int x, y;
    public void initialise(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void deplacer(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    
}
