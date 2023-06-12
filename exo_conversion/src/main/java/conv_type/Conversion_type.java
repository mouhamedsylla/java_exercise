/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conv_type;

/**
 *
 * @author HP
 */
public class Conversion_type {
    public static void main(String[] args) {
    //Converson en chaine de caratère 
    int i = 10;
    
    String chaine = String.valueOf(i);
     System.out.println("Le type de chaine est: "+chaine.getClass().getSimpleName()+"\n Et sa valeur est:"+chaine);
    
}
}
