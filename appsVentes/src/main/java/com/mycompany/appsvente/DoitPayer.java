/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appsvente;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.*;
/**
 *
 * @author sylla
 */
public class DoitPayer {
    ResultSet rs;
    Connection con;
    Statement stat;
    private int payeCI;
    private int payeCP;
    private int payeCE1;
    private int payeCE2;
    private int payeCM1;
    private int payeCM2;
    private int payeTotale = 0;
    
    public int aPayer(String type, int nCI, int nCP, int nCE1, int nCE2, int nCM1, int nCM2) {
        con = DbConnection.getConnection();
        try{
        Properties props = new Properties();
        FileInputStream in = new FileInputStream("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\appsVente\\src\\main\\java\\com\\mycompany\\appsvente\\infosPrix.properties");
        props.load(in);
        in.close();
        
        /*stat = con.createStatement();
        String query = "SELECT QCI, QCP, QCE1, QCE2, QCM1, QCM2, cahier_de FROM commande WHERE ID_Client='"+ecol+"'";
        rs = stat.executeQuery(query);
        while(rs.next()) {
            int nCI = rs.getInt("QCI");
            int nCP = rs.getInt("QCP");
            int nCE1 = rs.getInt("QCE1");
            int nCE2 = rs.getInt("QCE2");
            int nCM1 = rs.getInt("QCM1");
            int nCM2 = rs.getInt("QCM2");
            String type = rs.getString("cahier_de");*/
            
            switch(type) {
                case "Ecriture":
                    payeCI = nCI * Integer.parseInt(props.getProperty("ci.ecriture"));
                    payeCP = nCP * Integer.parseInt(props.getProperty("cp.ecriture"));
                    payeTotale = payeTotale + payeCI + payeCP;
                    break;

                case "Lecture":
                    payeCI = nCI * Integer.parseInt(props.getProperty("ci.lecture"));
                    payeCP = nCP * Integer.parseInt(props.getProperty("cp.lecture"));
                    payeCE1 = nCE1 * Integer.parseInt(props.getProperty("ce1.lecture"));
                    payeCE2 = nCE2 * Integer.parseInt(props.getProperty("ce2.lecture"));
                    payeCM1 = nCM1 * Integer.parseInt(props.getProperty("cm1.lecture"));
                    payeCM2 = nCM2 * Integer.parseInt(props.getProperty("cm2.lecture"));
                    payeTotale = payeTotale + payeCI+ payeCP+ payeCE1+ payeCE2+ payeCM1+ payeCM2;
                    break;

                case "Transition":
                    payeCI = nCI * Integer.parseInt(props.getProperty("ci.transition"));
                    payeTotale = payeTotale + payeCI;
                    break;

                case "Prod-ecrite":
                    payeCE1 = nCE1 * Integer.parseInt(props.getProperty("ce1.prodEcrite"));
                    payeCE2 = nCE2 * Integer.parseInt(props.getProperty("ce2.prodEcrite"));
                    payeCM1 = nCM1 * Integer.parseInt(props.getProperty("cm1.prodEcrite"));
                    payeCM2 = nCM2 * Integer.parseInt(props.getProperty("cm2.prodEcrite"));
                    payeTotale = payeTotale + payeCE1+ payeCE2+ payeCM1+ payeCM2;
                    break;
                case "Revision":
                    payeCP = nCP * Integer.parseInt(props.getProperty("cp.revision"));
                    payeTotale = payeTotale + payeCP;
                    break;
                    
                default :
                    System.out.println("echec");
                    break;
        }
        }        catch(IOException e) {
            e.printStackTrace();
        }
        return payeTotale;
        }


        
    }

