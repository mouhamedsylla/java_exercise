/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficapp;

/**
 *
 * @author HP
 */
import javax.swing.*;
public class Appswing {
    public static void main(String[] args) {
        //Création et instanciation de l'objet frame
        JFrame frame = new JFrame("JavaApp");
        
        //dimensionner le frame
            //frame.setBounds(400, 200, 400, 200);
        
        //Création et instanciation de l'objet button
        JButton button = new JButton("click me");
        
        //Dimensinnement du button
        button.setBounds(160, 0, 100, 50);
        
        //Ajouter le button à la frame
        frame.add(button);
        
        //Paramétrer l'opération de fermeture
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(400, 500);
        frame.setLayout(null);
        //Afficher notre fenetre
        frame.setVisible(true);
        
    } 
}
