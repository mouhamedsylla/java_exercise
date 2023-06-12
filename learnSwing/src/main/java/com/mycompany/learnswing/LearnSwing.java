/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.learnswing;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author sylla
 */
public class LearnSwing {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("TuxCode");
        frame.setSize(350,350);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");
        frame.setIconImage(icon);
        
                
    }
}
