/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testjtable;
import java.awt.*;
import java.io.*;
import java.sql.*;
import java.util.Properties;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sql.rowset.*;



/**
 *
 * @author sylla
 */
public class Test1 {
    private JFrame frame;
    private JComboBox combo;
    private JPanel panel;
    private Connection con;
    private Statement stat;
    private ResultSet  rs;
    private JTable myTable;
    private ResultSetMetaData rsmd;
    private JScrollPane scrollPane;
    private boolean scrolling;
    ResultSetTableModel model;
    
    public Test1(){
        frame = new JFrame();
        frame.setSize(600, 700);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        
        panel = new JPanel();
        frame.add(panel);
        
        combo = new JComboBox();
        combo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                try{ 
                    if (scrollPane != null) 
                        frame.remove(scrollPane);
                    String tableName = (String)combo.getSelectedItem();
                    if (rs != null) rs.close();
                    String query = "SELECT * FROM " + tableName;
                    rs = stat.executeQuery(query);
                    if (scrolling)
                        model = new ResultSetTableModel(rs);
                    else{
                        RowSetFactory factory = RowSetProvider.newFactory();
                        CachedRowSet crs = factory.createCachedRowSet();
                        crs.populate(rs);
                        model = new ResultSetTableModel(crs);
                    }
                        JTable mytable = new JTable(model);
                        scrollPane = new JScrollPane(mytable);
                        frame.add(scrollPane, BorderLayout.CENTER);
                        frame.validate();
                  
                } 
                catch (SQLException e){
                    e.printStackTrace();
                }
            }
        });
        panel.add(combo);
        frame.add(panel, BorderLayout.NORTH);
        
        try  {
            con = getConnection();
            DatabaseMetaData meta = con.getMetaData();
            if (meta.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                scrolling = true;
                stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            }
            else{
                stat = con.createStatement();
                scrolling = false;
            }
            ResultSet tables = meta.getTables(null, null, null, new String[] { "TABLE" });
            while (tables.next())
                combo.addItem(tables.getString(3));
            tables.close();
        }
        catch(SQLException sqle) {
            sqle.printStackTrace();
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public Connection getConnection() throws SQLException, IOException{
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
        new Test1();
    }

}
