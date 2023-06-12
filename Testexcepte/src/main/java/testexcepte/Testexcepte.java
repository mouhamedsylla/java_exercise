/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testexcepte;
import java.io.*;

/**
 *
 * @author HP
 */
public class Testexcepte {
    public static void main(String[] args){
        //Exception runtime
        
        //Si aucune paramétre n'est passée et que la condition n'est pas là
        // alors on aura l'exception ArrayIndexOutOfBoundException
        if(args.length>0){
            int resultat = Integer.parseInt(args[0]);
            System.out.println("Résultat : "+resultat);
        }
        else{
            System.out.println("Aucune argument n'est saisi");
        }
        
        //Exceptions gérées
        
        FileInputStream fichier = new FileInputStream("Coucou.txt");
   }    
}
