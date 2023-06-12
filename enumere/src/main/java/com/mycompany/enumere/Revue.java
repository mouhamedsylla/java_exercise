/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enumere;

/**
 *
 * @author sylla
 */
public class Revue {
    private String titre;
    //private Frequence freq;
    private FreqEnum freq;
    
    public Revue(String titre, FreqEnum freq) {
        this.titre = titre;
        this.freq = freq;
    }

    public void Affiche() {
        switch(freq) {
            case MENSUEL:
                System.out.println("La frequence de "+titre+" est mensuel");
                break;
            case HEBDO:
                System.out.println("La frequence de "+titre+" est hedomadaire");
                break;
            default :
                System.out.println("La frequence de cette revue est inconnue");
                break;
                    }
                    
    }
}
