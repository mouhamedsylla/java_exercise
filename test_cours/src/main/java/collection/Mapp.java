/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.Collection;
import java.util.TreeMap;
import java.util.Iterator;

/**
 *
 * @author sylla
 */
public class Mapp {
    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap();
        t.put(0, "Mouhamed");
        t.put(1, "Moussa");
        t.put(2, "Ibra");
        
        Collection c = t.keySet();
        Iterator itr = c.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
