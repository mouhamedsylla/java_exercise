/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionES;

import java.io.IOException;


/**
 *
 * @author sylla
 */
public class Test1 {
    public static void main(String[] args)
    {
        try {
        int v = System.in.read();
        
        System.out.println("v :"+v);
        }catch(IOException e) {
            System.out.println(e);
        }

    }
}
