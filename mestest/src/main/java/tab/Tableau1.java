/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tab;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
public class Tableau1 {
    public static void main(String[] args) {
      ArrayList<Integer> tab = new ArrayList();
      tab.add(2);
      tab.add(7);
      tab.add(1);
      
      for(int v : tab) {
          System.out.println(v);
      }
    }
}
