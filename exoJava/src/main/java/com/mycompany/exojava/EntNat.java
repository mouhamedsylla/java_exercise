/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exojava;
/**
 *
 * @author sylla
 */
public class EntNat {
    private int nb;
    public EntNat(int entier) throws ErrConst{
        if(entier<0)
            throw new ErrConst(entier);
        else
            nb = entier;
    }
    
    public int getN() {
        return nb;
    }
    
    public static void main(String[] args) {
        try {
            EntNat n = new EntNat(-3);
            System.out.println("Vous avez entrer : "+n.getN());
        }
        catch(ErrConst err) {
            System.out.println("Erreur!!! "+err.getNbr()+" est un nombre négative");
        }
    }
}
