/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.enumere;

/**
 *
 * @author sylla
 */
public class Enumere {

    public static void main(String[] args) {
        // ceci va permettre à l'utlisateur de créer ses propres valeurs de fréquence
        //Revue r1 = new Revue("Linux", new Frequence("MENSUEL"));
        //Revue r2 = new Revue("Physique", new Frequence("HEBDO"));
        
        // on peut le limiter à des valeurs prédéfini en l'empêchant d'intancier une objet Frequence
        // pour cela on va rendre le constructeur de Frequence privé dans ce cas on ne pourra pas instancier
        // Frequence en dehors de lui même
        
        Revue r1 = new Revue("Linux", FreqEnum.MENSUEL);
        Revue r2 = new Revue("Computer Science Magazine", FreqEnum.HEBDO);
        r1.Affiche();
        r2.Affiche();   
    }
}
