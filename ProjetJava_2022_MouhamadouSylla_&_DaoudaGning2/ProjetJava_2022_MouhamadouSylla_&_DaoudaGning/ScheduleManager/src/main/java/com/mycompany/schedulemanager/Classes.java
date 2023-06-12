/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schedulemanager;

/**
 *
 * @author sylla
 */
public class Classes {
    private String nomClasse;
    private int nbEtudiant;
    private String niveau;
    private String departement;
    private Edt myEdt;
    
    public Classes(String nom, int nbE, String niv, String dep, Edt edt) {
        this.nomClasse = nom;
        this.nbEtudiant = nbE;
        this.niveau = niv;
        this.departement = dep;
        this.myEdt = edt;
    }
    
    
    
}
