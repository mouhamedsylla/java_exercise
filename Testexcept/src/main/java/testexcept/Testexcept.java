/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testexcept;

/**
 *
 * @author HP
 */
public class Testexcept {
    public static void main(String[] args){
        if(args.length>0){
            int resultat = Integer.parseInt(args[0]);
            System.out.println("Résultat : "+resultat);
        }
        else{
            System.out.println("Aucune argument n'est saisi");
        }
   }
}
