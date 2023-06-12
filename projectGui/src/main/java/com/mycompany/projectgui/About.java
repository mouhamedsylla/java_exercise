/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectgui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author sylla
 */
public class About extends JFrame implements ActionListener{
    JButton b1;
    JLabel l1;
    TextArea t;
    Font f1, f2, f3;
    String s;
    
    public About() {
        setLayout(null);
        b1 = new JButton("Exit"); 
        add(b1);
        b1.setBounds(180, 430, 120, 20);
        b1.addActionListener(this);
        
        f1 = new Font("RALEWAY", Font.BOLD, 100);
        setFont(f1);
        
        s = "                           About Projects      \n "
                +"\nElectricity Biling System is a software-based application "
                +"developed in Java programing language. The aims at serving"
                +"the department of Electricity of computerizing the billing"
                +"system. It mainly focuses on the calculation of Units consumed "
                +"during the specified time and the money to be paid to "
                +"electicity offices.";
        
        t = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t.setEditable(false);
        t.setBounds(20, 100, 450, 300);
        add(t);
        
        f2 = new Font("RALEWAY", Font.BOLD, 16);
        t.setFont(f2);
        
        //Container contentPane = this.getContentPane();
        // t = new TextArea();
        
        l1 = new JLabel("About Project");
        add(l1);
        l1.setBounds(170, 10, 180, 80);
        l1.setForeground(Color.red);
        
        f2 = new Font("RALEWAY", Font.BOLD, 20);
        l1.setFont(f2);
        
        setBounds(700, 220, 500, 550);
        setLayout(null);
        setResizable(false);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }
    
    public static void main(String[] args) {
        About about = new About();
    }

}
