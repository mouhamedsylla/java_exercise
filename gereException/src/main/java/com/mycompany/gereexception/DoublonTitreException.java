/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gereexception;

/**
 *
 * @author sylla
 */
public class DoublonTitreException extends Exception {
    private String leTitreAProbleme;
    public DoublonTitreException(String leTitre) {
        leTitreAProbleme = leTitre;
    }
    public String getTitre() {
         return leTitreAProbleme;
     }
}
