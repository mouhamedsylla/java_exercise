/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package type;

/**
 *
 * @author HP
 */
public class Chaine {
    public static void main(String[] args) {
    String text = "Mon bonnét";
    text = text.replace('é','e');// la methode replace() permet de remplacer 'é' par 'e'
    
    System.out.println(text);
    
    //Comparaison de chaine
    String texte1 = "bonjour";
    String texte2 = "Bonjour";
    
    if (texte1.equals(texte2)) {
        System.out.println("Ces deux chaines se correspondent alors JAVA ne prend pas  en compte la caste");
    }
    else
        System.out.println("Ces deux chaines ne se correspondent alors JAVA  prend en compte la caste");   
    
    //Détermination de la longueur 
    String texte3 = "Hi!!! Je débute en en JAVA";
    int longueur = texte3.length();
    
    
    System.out.println("Ma phrase est la suivante: "+texte3+" et sa longueur est de :"+longueur+" caractères");

    
    //Modifcation de la casse d'une chaine
         /*
    ***Obtenir en majuscle une chaine toUpperCase()
    ***Obtenir en miniscule une chaine toLowerCase()
         */
    String texte4 = "miniscule est ecrit en majuscle";
    String texte5 = "MAJUSCULE EST ECRIT EN MINISCULE";
    
    System.out.println(texte4.toUpperCase());
    System.out.println(texte5.toLowerCase());
    
  }  
}
