/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package type;

/**
 *
 * @author HP
 */
public class Type_primitives {
    public static void main(String[] args) {
        /*
    //La classe wrapper Integer est converti en type primitif int    
    Integer val = Integer.valueOf(10);
    int i = val.intValue();
    System.out.println(i);  */
        
    /*    
    Integer val = 5;
    int i = val;
    System.out.println(i);
    */
    
   /* int val = 5;
    Integer value = val;
    System.out.println(value+" et son type est: "+value.getClass().getSimpleName());
        */
   
   
   /*
   Integer val = 5;
   System.out.println(val);
   */


  
  //Convertir des char en int
  char myChar = '5';
  int n = Character.getNumericValue(myChar);
 
  // On va afficher le type de myChar et n
  //D'abord myChar et n converti en classe wrapper
  
  Character c = myChar;
  System.out.println("Le type de myChar est: "+c.getClass().getSimpleName()+"\n et myChar = "+myChar);
  
  Integer i = n;
  System.out.println("Le type de n est: "+i.getClass().getSimpleName()+"\n"+" et n = "+n);
  
  
    }
}


