/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionES;

import java.io.*;

/**
 *
 * @author sylla
 */
public class Etudiant {
    String nom;
    String prenom;
    float note[] = new float[3];
    
    Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        for(int i = 0; i <= note.length; i++) note[i] = 0;
    }
    
    Etudiant() {
        this("", "");
    }
    
    void modifNote (float n1, float n2, float n3) {
        note [0] = n1;
        note [1] = n2;
        note [2] = n3;
    }
    
    void modifNote (int i, float n) {
        if (i >= 1 && i <= note.length) note[i-1] = n;
    }
    
    @Override
     public String toString () {
        return nom + " " + prenom + " " 
        + note[0] + " " + note[1] + " "+ note[2];
    }
    
    //Ecrire les caractéristiques d'un etudiant dans le fichier fs 
    void ecrireEtu(DataOutputStream fs){
        try {
            fs.writeChars(nom);
            fs.writeChars(prenom);
            for(int i = 0; i <= note.length; i++) fs.writeFloat(note[i]);
        }catch(IOException e) {
            System.out.println(e);
        }
    }
    
    //Lire les caractéristiques d'un etudiant dans le fichier fs
    void lireEtu(DataInputStream fe) {
        try {
            for (int i=0; i < 10; i++) {
            char c = fe.readChar();
            nom += c;
            }
            for (int i=0; i < 10; i++) prenom += fe.readChar();
            for (int i=0; i < note.length; i++) {
            note[i] = fe.readFloat();
            }
        }
        catch(IOException e) {
            System.out.println ("lireEtu " + e);
            }
    }
    void lireDEtu (RandomAccessFile fe, int num) {
    try {
        fe.seek (num*(20*2+3*4)); // 20 caractères Unicode + 3 réels
        for (int i=0; i < 10; i++) nom += fe.readChar();
        for (int i=0; i < 10; i++) prenom += fe.readChar();
        for (int i=0; i < note.length; i++) note[i] = fe.readFloat();
        } catch (IOException e) {
            System.out.println ("Erreur lors de l’accès aléatoire " + e);
            }
   }
}
