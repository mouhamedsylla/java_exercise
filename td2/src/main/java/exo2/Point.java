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
    float x, y;
  public Point(){
      x = 0;
      y = 0;
     /*this.x = x;
     this.y = y;*/
  };  
  public float getXvalue() {
      return x;
  };
 public float getYvalue() {
      return y;
  }
  public void setXYvalue(float a, float b) {
      x = a;
      y = b;
  };
 
  public void deplacer(float dx, float dy ) {
    x+=dx;
    y+=dy;
  };
public void Afficher() {
    System.out.println("Voici les coordonnées: x ="+getXvalue()+" y ="+getYvalue());
}
 public String toString() {
     return"("+getXvalue()+","+getYvalue()+")";
 }
}
