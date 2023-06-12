/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionES;

import java.io.*;
import javax.swing.*;

/**
 *
 * @author sylla
 */
public class DataEtudiant extends JFrame{
    JTextArea ta = new JTextArea (50, 20);
    DataEtudiant (String titre) {
        setTitle (titre); // type Frame
        setSize (300, 100); 
        ta.setEditable (false);
        getContentPane().add (ta);
        setVisible (true);
    } 
    
    void ecriredata() {
        String chT = new String ("Données à écrire\n");
        DataOutputStream fs = null;
        try {
            fs = new DataOutputStream (new FileOutputStream ("etudiant.dat"));
            // les noms et prénoms sont sur 10 caractères;
            // on pourrait ajuster à 10 par programme
            Etudiant e1 = new Etudiant ("Dupont ", "Jules ");
            e1.modifNote (12.5f, 8.5f, 14.5f);
            Etudiant e2 = new Etudiant ("Duval ", "Jacques ");
            e2.modifNote (3.5f, 7.5f, 11.5f);
            Etudiant e3 = new Etudiant ("Dupré ", "Sébastien ");
            e3.modifNote (9.5f, 17.25f, 10.5f);
            e1.ecrireEtu (fs);
            e2.ecrireEtu (fs);
            e3.ecrireEtu (fs);
            chT += e1 + "\n" + e2 + "\n" + e3;
            fs.close();
        } catch (IOException e) {
            System.out.println (e);
        }
        ta.setText (chT);
    } 
    }


