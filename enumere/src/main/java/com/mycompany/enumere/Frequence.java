/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enumere;

/**
 *
 * @author sylla
 */
public class Frequence {
    private String frequence;
    
    private Frequence(String frequence) {
        this.frequence = frequence;
    }
    
    public static final Frequence MENSUEL = new Frequence("MENSUEL");
    public static final Frequence HEBDO = new Frequence("HEBDO");
    
    public String getFreq() {
        return frequence;
    }
}
