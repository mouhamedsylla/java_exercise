/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testjtable;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
/**
 *
 * @author sylla
 */
public class ResultSetTable extends JFrame{
    JFrame frame;
    int DEFAULT_WIDTH;
    int DEFAULT_HEIGHT;
    JScrollPane scrollpane;
    JTable table;
    JComboBox combobox;
    JPanel panel;
    String[] columnName;
    public ResultSetTable() {
        
    }
    ResultSet rs = null;
    public void getColumnNane() throws SQLException{
            
    }
    
    private String USERNAME = "ahmed";
    private String PASSWORD = "Tuxcode";
    private String URL = "jdbc:mysql://localhost/tennis";
    Connection con = null;
    public Connection getConnection() throws SQLException{
        con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return con;    
}
}
