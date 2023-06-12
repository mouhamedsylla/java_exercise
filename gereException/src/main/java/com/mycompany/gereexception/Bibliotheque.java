/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gereexception;

import java.util.*;

/**
 *
 * @author sylla  
 */
class Bibliotheque {
    
    private Map<String,Livre> lesLivres = new HashMap<String,Livre>();
    
    void ajouterLivre(String leTitre) throws DoublonTitreException{
        Livre livre = new Livre(leTitre);
        
        if(lesLivres.keySet().contains(leTitre)) {
            throw new DoublonTitreException(leTitre);
        }
        else {
            lesLivres.put(leTitre, livre);
        }
            
    }

    void affiche() {
        for(String k : lesLivres.keySet()) {
            System.out.println("Livre : "+lesLivres.get(k));
        }
    }
    
    
}
