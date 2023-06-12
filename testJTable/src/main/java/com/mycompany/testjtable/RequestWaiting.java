/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testjtable;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/**
 *
 * @author sylla
 */
public class RequestWaiting {
    Connection con; 
    ArrayList<String> waitRequest;
    Statement request;
    String sql;
    final String validation1 = "valide";
    final String validation2 = "annule";
    public void getRequest() {
        try{
        con = getConnection();
        String termine = "exit";
        sql = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Entré vos requetes et terminé en entrant exit: \n");
        waitRequest = new ArrayList();
        while(!sql.equals(termine)) {
            sql = sc.nextLine();
            if(sql.equals("exit"))
                break;
            waitRequest.add(sql);
        }
        String choix;
        System.out.println("Choisir valide ou annule");
        choix = sc.nextLine();
        if(choix.equals(validation1)) {
            request = con.createStatement();
            String r;
            for(int i = 0; i<waitRequest.size(); i++) {
                r =waitRequest.get(i);
                request.executeUpdate(r);
            }
            con.close();
        } 
        if(choix.equals(validation2)) {
            System.out.println("Vos requetes ont ete annule");
        }
        
        }catch(SQLException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    public Connection getConnection()throws SQLException, IOException{
        Properties props = new Properties();
        FileInputStream in = new FileInputStream("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\testJTable\\src\\main\\ressources\\database.properties");
        props.load(in);
        in.close();
        
        String drivers = props.getProperty("jdbc.drivers");
        if(drivers != null)
            System.setProperty("jdbc.drivers", drivers);
        String url = props.getProperty("jdbc.url");
        String username = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");
        return DriverManager.getConnection(url, username, password);
    }
    
    public static void main(String[] args) {
        RequestWaiting r = new RequestWaiting();
        r.getRequest();
    }
}
