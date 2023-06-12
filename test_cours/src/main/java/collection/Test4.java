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
public class Test4 {
    public static void main(String[] args) {
        HashSet<Integer> val = new HashSet();
        val.add(2);
        val.add(2);
        val.add(3);
        
        Iterator itr = val.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(val.size());
    }
}
