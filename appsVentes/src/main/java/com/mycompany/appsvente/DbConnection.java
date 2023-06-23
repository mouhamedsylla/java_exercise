/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appsvente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sylla
 */
public class DbConnection {
    public static String url = "jdbc:sqlite:\\src\\main\\ressources\\dbappsvente.db";
    public static String user = "";
    public static String password = "";

 
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(url, user, password);
            if (con != null) {
                System.out.println("dk");
                return con;
 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
}
}
