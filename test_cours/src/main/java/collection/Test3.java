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
public class Test3 {
    public static void main(String[] args) {
        TreeSet<Integer> tr = new TreeSet();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un entier");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            Random r = new Random();
            int val = r.nextInt(1000);
            tr.add(val);
        }
        Iterator itr = tr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
