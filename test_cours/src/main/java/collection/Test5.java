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
public class Test5 {
    /*
    Le programme permet de manipuler des listes chaînées. Il se contente de créer
    deux listes chaînées, de les fusionner, puis il supprime un élément sur deux dans la seconde liste, et
    teste ﬁnalement la méthode removeAll.
    */
    
    public static void main(String[] args) {
        List<String> a = new LinkedList();
        List<String> b = new LinkedList();
        
        a.add("Claire");
        a.add("Carl");
        a.add("Erica");
        
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");
        
        a.addAll(b);
        ListIterator<String> Litr = a.listIterator();
//        while(Litr.hasNext()){
//            System.out.println(Litr.next());
//        }
        Collections.sort(a);
        ListIterator<String> Litr2 = a.listIterator(a.size()/2);
        while(Litr2.hasPrevious()){
            System.out.println(Litr2.previous());
        }
    }
}
