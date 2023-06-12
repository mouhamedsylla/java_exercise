/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exo3;

/**
 *
 * @author HP
 */
public class Responsable extends Employé {
    Employé[] sousOrdre;
    String titreRespon;
    public Responsable( String nom, int matricule, int indice, Employé[] t, String r ) {
        super(nom,matricule,indice);
        sousOrdre = t;
        titreRespon = r;
    }
    
    /*public void affsousOrdre() {
        super.caracteristik();
        System.out.println("Le tiitirre du du responsable:"+titreRespon);
        for ( int i = 0; i<= sousOrdre.length; i++) {
            sousOrdre[i].caracteristik();
        }
    
    }*/
    public void affInfoEmp () {
        super.caracteristik();
        System.out.println(titreRespon);
    }
    public void affsousOrdre() {
        this.affInfoEmp();
        System.out.println("Les subordonnées sont :\n");
         for ( int i = 0; i<= sousOrdre.length; i++) {
            sousOrdre[i].caracteristik();
        }
        
    }
    
}
