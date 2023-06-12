/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tennis;

import java.sql.*;


public class TestDeConnection {
    public static void main(String... args){
        Connection conn = null;
        try {
            //Seulement avant Java 7/JDBC 4 
            //Class.forName(DRIVER_CLASS_NAME);
            
            //MySQL driver MySQL Connector
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tennis", "ahmed", "Tuxcode");
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT NOM, PRENOM, ID FROM JOUEUR");
            
            while(rs.next()) {
                final String nom = rs.getString("NOM");
                final String prenom = rs.getString("PRENOM");
                final int id = rs.getInt("ID");
                System.out.println("Le joueur / La joueuse représenté(e) par le numéro "+id+" se nomme "+prenom+" "+nom);
                
            }
            rs.close();
            statement.close();
            System.out.println("Connection succeded");
        } catch (SQLException e) {
            e.printStackTrace();
           }
        finally {
            try {
                if (conn!=null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

