/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.genericclasse;

/**
 *
 * @author sylla
 */
class Pile {
    Object[] datas;
    int indice;
    
    public Pile(int taille) {
        datas = new Object[taille];
        indice = 0;
    }
    void push(Object doc) {
        datas[indice++] = doc;
    }
    
    Object pop() {
        return datas[indice--];
    }
}
