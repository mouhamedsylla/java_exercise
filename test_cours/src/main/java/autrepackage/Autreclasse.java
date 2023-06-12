/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autrepackage;
import testbojet.*;
/**
 *
 * @author HP
 */
public class Autreclasse {
    //On importe le package testbojet pour acceder au classe Document
    //La visibilité public du méthode setTitre nous permet d'y accéder à partir de ce classe de packages différents 
    
    public static void modifie(Document doc, String t) {
        doc.setTitre(t);
    }
}
