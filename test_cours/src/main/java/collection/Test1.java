/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.*;

/**
 *
 * @author sylla
 */
public class Test1 {
   public static void main(String[] args) {
       ArrayList<Integer> myArray = new ArrayList();
       int[] tab = {2, 3, 1, 4};
       for(int i=0; i<tab.length;i++){
           myArray.add(tab[i]);
       }
       
//       System.out.println(myArray.toString());
        //Affichage des elements de tab dans l'ordre inverse (2 méthodes)
        
        //1ere
        for(int i=tab.length-1;i>=0;i--){
            System.out.println(tab[i]);
        }
        
        System.out.println("###############################");
        
        //2eme
        ListIterator<Integer> itr = myArray.listIterator(myArray.size());
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
   }
}
