/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tab;

/**
 *
 * @author HP
 */
import java.util.*;
public class Tableau2 {
    public static void main(String[] args) {
        ArrayList<String> tab = new ArrayList(Arrays.asList(args));
       /* for(int i = 0; i< tab.size(); i++) {
            String str = tab.get(i);
            System.out.println("ARgs: "+str);
        }*/
       for(String str : tab) {
            System.out.println("ARgs: "+str);
       }
    }
}
