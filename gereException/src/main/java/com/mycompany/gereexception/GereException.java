/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gereexception;

/**
 *
 * @author sylla
 */
public class GereException {

    public static void main(String[] args) {
        Bibliotheque bib = new Bibliotheque();
        try {
        bib.ajouterLivre("La conscience même de soi");
        System.out.println("Tout est ok");
        
        bib.ajouterLivre("La conscience même de soi");
        System.out.println("Tout est ok");
        
        
    }
    catch(DoublonTitreException excp) {
        System.out.println("Le titre :"+excp.getTitre()+" est un doublon");
        return;
    }
    catch(Exception e) {
        System.out.println("Erreur Inconnu");
    }
    finally {
        bib.affiche();
        }
    
    }
}
