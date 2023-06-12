/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exo3;

/**
 *
 * @author HP
 */
public class Employé {
 protected String nom;
 protected int matricule;
 protected int indice;
 protected int val;
 
 public Employé(String nom, int matricule, int indice) {
   this.nom = nom;
   this.matricule = matricule;
   this.indice = indice;
 }
 public void caracteristik() {
     System.out.println("Employé \n"+"Nom: "+nom+"\n"+"Matricule: "+matricule+"\n"+" Indice salairial: "+indice);
 }
 public int salaire() {
  return indice * val;   
 }
}
