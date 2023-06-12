/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author HP
 */
public class Principal {
    public static void main(String[] args) {
        Personne p1 = new Personne();
        p1.setPersonne("Sylla", "Mouhamed", 23);
        
        Personne p2 = new Personne();
        p2.setPersonne("Diémé", "Awa", 23);
        
        System.out.println("Moi: Bonjour, Moi c'est "+p1.getPrenom()+" "+p1.getNom()+", j'ai "+p1.getAge()+" et voilà...\n");
        System.out.println("Lui: ...sa femme, c'est "+p2.getPrenom()+" "+p2.getNom()+", moi aussi j'ai "+p2.getAge()+".\n");
        System.out.println("Interviewer: Ah donc vous "+Personne.nbPersonne+" vous etez mariés. Félicitation! vous formez un joli couple");
    }
}
