/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tab;

/**
 *
 * @author HP
 */
public class Maintab {
    public static void main(String[] args) {
        for(int i=0; i<args.length; i++) {
            if(i == 2) {
                int age = Integer.parseInt(args[i]);
                System.out.println("Age: "+age);
            }
            else
            System.out.println(args[i]);
        }
    }
}
