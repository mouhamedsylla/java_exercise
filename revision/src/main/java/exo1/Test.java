/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exo1;

/**
 *
 * @author HP
 */
public class Test {
    public static void main(String[] args) {
        PointA p1 = new PointA();
        p1.initialise(2, 3);
        
        p1.affiche();
        
        Point p2 = new Point(); 
        p2.initialise(5, 0);
        //Un appel tel que p2.affiche() conduirait à une erreur de compilation puisque la classe de p(Point) ne possède pas de méthode affiche.
        //Si la classe Point n'avait pas disposé des méthodes d'accès getX et getY, il n'aurait pas été possible d'accéder à ses champs privés x et y
        //depuis la classe PointA. Il n'aurait donc pas été possible de la doter de la méthode affiche. L'héritage ne permet pas de contourner le 
        //principe d'encapsulaton.
        System.out.println("Les coordonnées sont :"+p2.getX()+" "+p2.getY());
    }
}
