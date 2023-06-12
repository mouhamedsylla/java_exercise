/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sta;

/**
 *
 * @author HP
 */
public class Principale {
    public static void main(String[] args) {
        Statique p1 = new Statique("mouhamed", "sylla", 23);
        //Statique p2 = new Statique("moussa", "fall", 32);
        System.out.println("Le nombre de personne est de : "+p1.getNbPersonne());
    }
}
