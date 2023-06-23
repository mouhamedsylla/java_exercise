/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appsvente;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author sylla
 */

class ResultSetTableModel extends AbstractTableModel{
    ResultSet rs;
    ResultSetMetaData rsmd;
    public ResultSetTableModel(ResultSet aResultSet) {
        rs = aResultSet;
        try{
            rsmd = rs.getMetaData();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getRowCount() {
        try{
            rs.last();
            return rs.getRow();
        }
        catch(SQLException e){
            e.printStackTrace(); 
        return 0;
        }
    }

    @Override
    public int getColumnCount() {
        try{ 
            return rsmd.getColumnCount();
        }
        catch (SQLException e){ 
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try{
            rs.absolute(rowIndex + 1);
            return rs.getObject(columnIndex + 1);
        }
        catch(SQLException e){
            e.printStackTrace(); 
            return null;
        }
    }
    
    public String getColumnName(int columnIndex) {
        try{
            return rsmd.getColumnName(columnIndex+1);
        }
        catch(SQLException e) {
            e.printStackTrace();
            return "";
        }
    }
    
}

