/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schedulemanager;

import java.time.LocalTime;

/**
 *
 * @author sylla
 */
public class Edt {
    private String edt_de;
    private String matiere;
    private String jour;
    private String type;
    
    private LocalTime deb;
    private LocalTime finito;
    
    private static int cpt = 0;
    
    public Edt(String nomClasse, String nomMatiere, String Ljour, String Hdebut, String Hfin, String Ltype) {
        this.edt_de = nomClasse;
        this.matiere = nomMatiere;
        this.jour = Ljour;
        this.type = Ltype;
        
        deb = LocalTime.parse(Hdebut);
        finito = LocalTime.parse(Hfin);
        cpt++;
    }
    
    public String getEdt_de() {
        return edt_de;
    }
    
    public String getJour(){
        return jour;
    }
    
    public String getDebut(){
        String debut = deb.toString();
        return debut;
    }
    
    public LocalTime getHdebut(){
        return deb;
    }
    
    public String getFin(){
        String fin = finito.toString();
        return fin;
    }
    
    public LocalTime getHfin() {
        return finito;
    }

    
    public String getMatiere() {
        return matiere;
    }
    
    public String getType() {
        return type;
    }
}
