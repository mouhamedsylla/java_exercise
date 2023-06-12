/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.sql.*;
public class JDBC2022 {

    public static Connection initConnection () {
    Connection co = null;
    String url = "jdbc:mysql://localhost/MABD?user=root";
    try{
    Class.forName("org.gjt.mm.mysql.Driver");
      //ou Class.forName("com.mysql.jdbc.Driver").newInstance ( ) ;
    co = DriverManager.getConnection(url);
    System.out.println("connexion réussie");
        }
    catch (SQLException se) {
    System.out.println("connexion impossible");
    }
    return co;
    }
  
    }

