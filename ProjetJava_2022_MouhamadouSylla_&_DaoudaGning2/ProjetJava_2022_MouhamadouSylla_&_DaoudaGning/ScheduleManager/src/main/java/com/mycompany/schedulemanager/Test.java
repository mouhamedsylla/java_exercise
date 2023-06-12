/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schedulemanager;

import java.sql.*;

/**
 *
 * @author sylla
 */
public class Test {
    static Connection con;

        
    public static void main(String[] args)  {
        con = DbConnection.getConnection();
        try{
            DatabaseMetaData md = con.getMetaData();
    ResultSet rs = md.getTables(null, null, "%", null);
    while (rs.next()) {
      System.out.println(rs.getString(3));
    }  
            }catch(SQLException e) {
        e.printStackTrace();
}
    }
}
