/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g_taxi;

/**
 *
 * @author HP
 */

public class Test {
    public static void main(String[] args) {
        Taxi[] taxis = new Taxi[3];
        Taxi t1, t2, t3;
        t1 = new Taxi(199918, "Ahmed", 115000);
        t2 = new Taxi(196726, "Abdou", 120000);
        t3 = new Taxi(199825, "Moussa", 16500);
        t1 = taxis[0];
        t2 = taxis[1];
        t3 = taxis[2];
        
        for(Taxi t:taxis) {
            t.affiche();
        }
        
            
        }
   
}
