/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schedulemanager;

import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author sylla
 */
public class Salle {
    private String nomSalle;
    private int  nbPlace;
    private Edt estAffecte_a;
    private LocalTime hours;
    private String jour;
    
    public Salle(String nom, int nbP,LocalTime HeureDispo, String j) {
        nomSalle = nom;
        nbPlace = nbP;
        hours = HeureDispo;
        jour = j;
    }
    public LocalTime getHdispo() {
        return hours;
    }
    public int getPlace() {
        return nbPlace;
    }
    public String getSalle() {
        return nomSalle;
    }
    
    public String getJour() {
        return jour;
    }
    public ArrayList<Object> affecteSalle(Edt edt) {
        estAffecte_a = edt;
        ArrayList<Object> infosClasse = new ArrayList();
        String nomClasse = estAffecte_a.getEdt_de();
        LocalTime h_fin = estAffecte_a.getHfin();
        infosClasse.add(nomClasse);
        infosClasse.add(h_fin);
        return infosClasse;
    }
    

}
