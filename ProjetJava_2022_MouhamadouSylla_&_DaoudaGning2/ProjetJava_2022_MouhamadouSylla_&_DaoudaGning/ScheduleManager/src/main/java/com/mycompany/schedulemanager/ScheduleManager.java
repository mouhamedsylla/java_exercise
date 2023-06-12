/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.schedulemanager;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.swing.JOptionPane;

/**
 *
 * @author sylla
 */
public class ScheduleManager extends javax.swing.JFrame {

    /**
     * Creates new form ScheduleManager
     */
    Connection con;
    PreparedStatement stat; 
    Statement stat1;
    ResultSet rs, rs1;
    boolean access;
    String formation;
    String niveau;
    String enom;
    String eprenom;
    public ScheduleManager() {
        initComponents();
        this.setResizable(false);
        access = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Lnom = new javax.swing.JTextField();
        Lprenom = new javax.swing.JTextField();
        Lpass = new javax.swing.JPasswordField();
        Lacteur = new javax.swing.JComboBox<>();
        connect = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(149, 219, 251));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, java.awt.Color.black, null));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setText("Login");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Prénom");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nom");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Password");

        Lacteur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Etudiant", "Enseignant", "Directeur Scolarité", "Chef Département" }));

        connect.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        connect.setText("Se connecter");
        connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Créer compte");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(connect)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Lacteur, 0, 148, Short.MAX_VALUE)
                        .addComponent(Lnom)
                        .addComponent(Lprenom)
                        .addComponent(Lpass)))
                .addGap(82, 82, 82))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lacteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(connect)
                    .addComponent(jButton3))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectActionPerformed
        if(!Lnom.getText().isEmpty() || !Lprenom.getText().isEmpty() || !Lpass.getText().isEmpty()) {
        con = DbConnection.getConnection();
        try{
            String nom = Lnom.getText();
            String prenom = Lprenom.getText();
            String password = Lpass.getText();
            String acteur = "";
            int index = Lacteur.getSelectedIndex();
            switch(index) {
                case 0:
                    acteur = "Admin";
                    break;
                case 1:
                    acteur = "Etudiants";
                    break;
                case 2:
                    acteur = "Enseignant";
                    break;
                case 3:
                    acteur = "DirScolarite";
                    break;
                case 4:
                    acteur = "ChefDepartement";
                    break;
            }
            
            stat1 = con.createStatement();
            String sql = "SELECT access FROM "+acteur+" WHERE nom = '"+nom+"' AND prenom = '"+prenom+"' AND password = '"+password+"'";
            rs1 = stat1.executeQuery(sql);
            while(rs1.next()){
                boolean acces = rs1.getBoolean("access");
                access = acces;
            }
            stat = con.prepareStatement("SELECT nom FROM "+acteur+" WHERE nom =? AND prenom =? AND password =?");
            stat.setString(1, nom);
            stat.setString(2, prenom);
            stat.setString(3, password);
            rs = stat.executeQuery();
            if(rs.next()) {
                if(access){
                switch(acteur) {
                    case "Admin":
                        java.awt.EventQueue.invokeLater(new Runnable() {
                            public void run() {
                            Admin admin = new Admin();
                            admin.setSalle();
                            admin.setInfosSalle();
                            admin.setFalseVisible();
                            admin.setVisible(true);
                            }
                        });
                        break;
                    case "Etudiants":
                        con = DbConnection.getConnection();
                        try{
                            
                            stat1 = con.createStatement();
                            String sql3 = "SELECT nom, prenom, classe, niveau FROM Etudiants WHERE nom = '"+nom+"' AND prenom = '"+prenom+"' AND password = '"+password+"'";
                            rs = stat1.executeQuery(sql3);
                            while(rs.next()){
                                enom = rs.getString("nom");
                                eprenom = rs.getString("prenom");
                                formation = rs.getString("classe");
                                niveau = rs.getString("niveau");
                            }
                        }catch(SQLException e) {
                            e.printStackTrace();
                        }finally{
                            try{
                                if(con!=null)
                                    con.close();
                            }catch(SQLException e){
                                e.printStackTrace();
                            }
                        }
                        java.awt.EventQueue.invokeLater(new Runnable() {
                            public void run() {
                            Etudiant et = new Etudiant(enom, eprenom, formation, niveau);
                            et.setEdt();
                            et.setVisible(true);
                            }
                        });
                        
                        break;
                    case "ChefDepartement":
                            java.awt.EventQueue.invokeLater(new Runnable() {
                                public void run() {
                                con = DbConnection.getConnection();
                                try{
                                    String dep = "";
                                    stat1 = con.createStatement();
                                    String sql = "SELECT nomDepartement FROM ChefDepartement WHERE nom = '"+nom+"' AND prenom = '"+prenom+"'";
                                    rs = stat1.executeQuery(sql);
                                    while(rs.next()) {
                                        dep = rs.getString("nomDepartement");
                                    }
                                    ArrayList<String> nomClass = new ArrayList();

                                    stat1.close();
                                    rs.close();
                                    String sql2 = "SELECT nomClasse FROM Classe WHERE departement = '"+dep+"'";
                                    stat1 = con.createStatement();
                                    rs = stat1.executeQuery(sql2);
                                    RowSetFactory factory = RowSetProvider.newFactory();
                                    CachedRowSet crs = factory.createCachedRowSet();
                                    crs.populate(rs);
                                    while(crs.next()) {
                                        String n = crs.getString("nomClasse");
                                        nomClass.add(n);
                                    }
                                    
                                    ChefDepartement c = new ChefDepartement();
                                    c.setMatiere();
                                    c.setProf();
                                    c.setClasse(nomClass);
                                    c.setSalle();
                                    c.setInfosSalle();
                                    c.setVisible(true);
                                }catch(SQLException e) {
                                    e.printStackTrace();
                                }
                                }
                            });
                        break;
                        
                    case "DirScolarite":
                        java.awt.EventQueue.invokeLater(new Runnable() {
                            public void run() {
                                DirScolarite DS = new DirScolarite();
                                DS.setEdt();
                                DS.setLabelVisible(false);
                                DS.setSalle();
                                DS.setInfosSalle();
                                DS.setVisible(true);
                            }
                        });
                        break;
                }
                }else{
                    JOptionPane.showMessageDialog(null, "Accès refusé");
                }
            }else {
                JOptionPane.showMessageDialog(null, "Connexion refusé");
            }
            
        }catch(SQLException e) {
            e.printStackTrace();
                }
        finally{
            try{
            if(con!=null)
                con.close();
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }
        
        }
    }//GEN-LAST:event_connectActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScheduleManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScheduleManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScheduleManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScheduleManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScheduleManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Lacteur;
    private javax.swing.JTextField Lnom;
    private javax.swing.JPasswordField Lpass;
    private javax.swing.JTextField Lprenom;
    private javax.swing.JButton connect;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
