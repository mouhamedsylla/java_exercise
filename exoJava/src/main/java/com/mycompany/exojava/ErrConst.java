/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exojava;

/**
 *
 * @author sylla
 */
class ErrConst extends Exception {
    private int nbr;
    public ErrConst(int entier) {
        nbr = entier;
    }
    public int getNbr() {
        return nbr;
    }
}
