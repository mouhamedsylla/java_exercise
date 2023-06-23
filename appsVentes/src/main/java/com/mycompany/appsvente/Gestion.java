/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.appsvente;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.io.IOException;
import java.util.*;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sylla
 */
class Gestion extends javax.swing.JFrame {
    private String prenom;
    private String nom;
    private String email;
    private String ntel;
    private String ecole;
    
    private String cahier;
    private String niveau;
    
    Connection con = null;
    PreparedStatement stat = null;
    Statement stat1 = null;
    ResultSet rs = null;
    
    java.util.Date dateAjout; 
    private int Stock = 0;
    DoitPayer paye;
    
    String ntelphone;
    DefaultTableModel model;
    ResultSetTableModel modl;
    
    Facture facture;
    int[] ci ={0, 0, 0, 0, 0};
    int[] cp = {0, 0, 0, 0, 0};
    int[] ce1 = {0, 0, 0, 0, 0};
    int[] ce2 = {0, 0, 0, 0, 0};
    int[] cm1 = {0, 0, 0, 0, 0};
    int[] cm2 = {0, 0, 0, 0, 0};
    
    public Gestion() {
        initComponents();
        Object[][] rowData = null;
        Object[] columnName = { "Cahier", "Q.CI", "Q. CP", "Q. CE1", "Q. CE2", "Q. CM1", "Q. CM2" };
        model = new DefaultTableModel(rowData, columnName);
        ComTable.setModel(model);
        ComCE1.setEnabled(false);
        ComCE2.setEnabled(false);
        ComCM1.setEnabled(false);
        ComCM2.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        StockCahier = new javax.swing.JComboBox<>();
        StockNiveau = new javax.swing.JComboBox<>();
        StockQuant = new javax.swing.JSpinner();
        AddStock = new javax.swing.JButton();
        ConsultStock = new javax.swing.JButton();
        jScrollPaneStock = new javax.swing.JScrollPane();
        jTableStock = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableHistorique = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnAddClient = new javax.swing.JButton();
        textPrenom = new javax.swing.JTextField();
        textNom = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        textTelephone = new javax.swing.JTextField();
        textEcole = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ComCI = new javax.swing.JSpinner();
        ComCP = new javax.swing.JSpinner();
        ComCE1 = new javax.swing.JSpinner();
        ComCE2 = new javax.swing.JSpinner();
        ComCM1 = new javax.swing.JSpinner();
        ComCM2 = new javax.swing.JSpinner();
        btnSubmitCom = new javax.swing.JButton();
        ComEcole = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        CahierTypeCommande = new javax.swing.JComboBox<>();
        AddCom = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        InfosAddClient = new javax.swing.JLabel();
        InfosPaye = new javax.swing.JLabel();
        aPayer = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ComTable = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        facturation = new javax.swing.JButton();
        send = new javax.swing.JButton();
        view = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        labelQStock = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        RevenuLabel = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        PayementEcole = new javax.swing.JTextField();
        PayementMontant = new javax.swing.JTextField();
        PayementRelicat = new javax.swing.JTextField();
        PayementValide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Stocks");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Cahier de");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Niveau");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Quantité");

        StockCahier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ecriture", "Lecture", "Prod écrite", "Transition", "Revision" }));

        StockNiveau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CI", "CP", "CE1", "CE2", "CM1", "CM2" }));

        AddStock.setText("ADD");
        AddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStockActionPerformed(evt);
            }
        });

        ConsultStock.setText("Consulté");
        ConsultStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultStockActionPerformed(evt);
            }
        });

        jScrollPaneStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPaneStockMouseClicked(evt);
            }
        });

        jTableStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cahier de", "Niveau", "Quantité", "Date d'ajout"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableStockMouseClicked(evt);
            }
        });
        jScrollPaneStock.setViewportView(jTableStock);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(29, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(ConsultStock)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddStock))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StockNiveau, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StockCahier, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StockQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(128, 128, 128))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPaneStock, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StockCahier, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StockNiveau, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StockQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddStock)
                            .addComponent(ConsultStock)))
                    .addComponent(jScrollPaneStock, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("Historiques des ventes");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        jTableHistorique.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ecole", "Montant Payé", "Rélicat", "Date Payement"
            }
        ));
        jScrollPane2.setViewportView(jTableHistorique);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(65, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Gestion Stocks & Ventes", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.lightGray));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setText("Informations Client");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Prenom");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Nom");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Email");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("N° Téléphone");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Ecole");

        btnAddClient.setLabel("ADD Client");
        btnAddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddClient, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNom, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textEcole, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPrenom)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNom)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(textEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textTelephone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textEcole)
                        .addGap(72, 72, 72)
                        .addComponent(btnAddClient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.lightGray));

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setText("Commande Client");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("CI");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("CP");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("CE1");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("CE2");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("CM1");

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("CM2");

        btnSubmitCom.setLabel("Submit");
        btnSubmitCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitComActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("Ecole");

        jLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel30.setText("Cahier de");

        CahierTypeCommande.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ecriture", "Lecture", "Prod-ecrite", "Transition", "Revision" }));
        CahierTypeCommande.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CahierTypeCommandeItemStateChanged(evt);
            }
        });
        CahierTypeCommande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CahierTypeCommandeActionPerformed(evt);
            }
        });

        AddCom.setText("ADD");
        AddCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddComActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ComCI, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ComCP, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ComCE1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ComCE2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ComCM1)
                                .addComponent(ComCM2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                            .addComponent(ComEcole, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CahierTypeCommande, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(AddCom, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmitCom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CahierTypeCommande, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComCE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComCE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComCM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComCM2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComEcole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmitCom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddCom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        InfosAddClient.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        InfosAddClient.setIcon(new javax.swing.ImageIcon("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\appsVente\\src\\main\\java\\com\\mycompany\\appsvente\\Done-icon.png")); // NOI18N
        InfosAddClient.setText("Client ajouté avec succée");

        InfosPaye.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        InfosPaye.setText("Montant net à payer : ");

        aPayer.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        aPayer.setText("0");

        ComTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ComTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ComTable);

        jLabel31.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel31.setText("Message d'Information");
        jLabel31.setFocusable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InfosAddClient, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(InfosPaye)
                                .addGap(18, 18, 18)
                                .addComponent(aPayer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InfosAddClient, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InfosPaye, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aPayer, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        facturation.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        facturation.setText("Facturé");
        facturation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturationActionPerformed(evt);
            }
        });

        send.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        send.setText("Send email");

        view.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        view.setText("View");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(facturation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(send, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(facturation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Gestion Achats", jPanel2);

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));

        jLabel20.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel20.setText("Infos Général");
        jLabel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel21.setText("Stocks");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel22.setText("Stocks écoulé");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel23.setText("Revenue");

        labelQStock.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        labelQStock.setForeground(new java.awt.Color(0, 255, 51));
        labelQStock.setText("0");

        jLabel25.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 51, 51));
        jLabel25.setText("0");

        RevenuLabel.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        RevenuLabel.setForeground(new java.awt.Color(153, 153, 153));
        RevenuLabel.setText("0");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(169, 169, 169)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelQStock, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RevenuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelQStock, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RevenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));

        jLabel24.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel24.setText("Payement");
        jLabel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        jLabel27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel27.setText("Ecole");

        jLabel28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel28.setText("Montant payé");

        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setText("Rélicat");

        PayementValide.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PayementValide.setText("Validé");
        PayementValide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayementValideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PayementEcole, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(PayementRelicat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(PayementMontant, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PayementValide, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PayementEcole, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PayementMontant, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PayementRelicat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PayementValide, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dashboard", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClientActionPerformed
        if(evt.getSource()==btnAddClient) {
            con = DbConnection.getConnection();
            try {
                stat1 = con.createStatement();
                prenom = textPrenom.getText();
                nom = textNom.getText();
                email = textEmail.getText();
                ntel = textTelephone.getText();
                ecole = textEcole.getText();
                if(("".equals(prenom)) || ("".equals(nom)) || ("".equals(ntel)) || ("".equals(ecole)))
                {
                System.out.println("erreur 101");
                InfosAddClient.setFont(new Font("Arial", 0, 14));
                InfosAddClient.setText("Erreur du requête SQL\n"+ "Champs maquantes");
                InfosAddClient.setIcon(new ImageIcon(getClass().getResource("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\appsVente\\src\\main\\java\\com\\mycompany\\appsvente\\danger-icon.png")));
                InfosAddClient.setVisible(true);
                }else {
                    stat1.executeUpdate("INSERT INTO clients(Prenom, Nom, email, NTelphone, Ecole) " + "VALUES('" + prenom + "','" + nom + "','" + email + "','" + ntel + "','" + ecole +"')");
                    //InfosAddClient.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
                    //InfosAddClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\appsVente\\src\\main\\java\\com\\mycompany\\appsvente\\Done-icon.png")));
                    InfosAddClient.setText("Client ajouté avec succée");
                    InfosAddClient.setVisible(true);  
                }
            }catch(SQLException e) {
                e.printStackTrace(); 
                InfosAddClient.setText("Erreur du requête SQL");
                InfosAddClient.setIcon(new ImageIcon("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\appsVente\\src\\main\\java\\com\\mycompany\\appsvente\\danger-icon.png"));
                InfosAddClient.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnAddClientActionPerformed

    private void btnSubmitComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitComActionPerformed
        if(evt.getSource()==btnSubmitCom) {
            con = DbConnection.getConnection();
            try {
                cahier = CahierTypeCommande.getSelectedItem().toString();
                stat1 = con.createStatement();
                int montant = 0;
                for(int i=0;i<model.getRowCount();i++) {
                    ArrayList<Object> data = new ArrayList();
                    for(int j=0;j<model.getColumnCount();j++) {
                        data.add(model.getValueAt(i, j));
                    }
                    cahier = (String)data.get(0);
                    int ci = (Integer)data.get(1);
                    int cp = (Integer)data.get(2);
                    int ce1 = (Integer)data.get(3);
                    int ce2 = (Integer)data.get(4);
                    int cm1 = (Integer)data.get(5);
                    int cm2 = (Integer)data.get(6);
                    stat1.executeUpdate("INSERT INTO commande(QCI, QCP, QCE1, QCE2, QCM1, QCM2, ID_Client, cahier_de)"
                            + "VALUES('"+ci+"','"+cp+"','"+ce1+"','"+ce2+"','"+cm1+"','"+cm2+"','" + ComEcole.getText() + "','"+cahier+"')");
                    paye = new DoitPayer();
                    montant = montant + paye.aPayer(cahier, ci, cp, ce1, ce2, cm1, cm2);
                    //
                }
                //InfosAddClient.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
                //InfosAddClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\appsVente\\src\\main\\java\\com\\mycompany\\appsvente\\Done-icon.png")));
                InfosAddClient.setText("La commande est ajouté avec succée");
                InfosAddClient.setVisible(true);
                setInfosClientInitial();
                new java.util.Timer().schedule(new java.util.TimerTask() {
                    @Override
                    public void run() {
                        InfosAddClient.setEnabled(false);
                    }
                }, 
                5000 
                );
                String val = String.valueOf(montant);
                aPayer.setText(val);
                InfosPaye.setVisible(true);
                aPayer.setVisible(true);
           
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnSubmitComActionPerformed
    
    public void setInfosClientInitial() {
        textPrenom.setText("");
        textNom.setText("");
        textEmail.setText("");
        textTelephone.setText("");
        textEcole.setText("");
        textPrenom.requestFocus();
    }
    
    private void AddStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStockActionPerformed
        if(evt.getSource()==AddStock) {
            dateAjout = new java.util.Date();
            java.sql.Timestamp dateAjoutSql = new java.sql.Timestamp(dateAjout.getTime());
            cahier = StockCahier.getSelectedItem().toString();
            niveau = StockNiveau.getSelectedItem().toString();
            con = DbConnection.getConnection();
            try {
                stat1 = con.createStatement();
                stat1.executeUpdate("INSERT INTO stocks(cahier_de, niveau, quantite, dates)" 
                        +"VALUES('"+ cahier + "','"+ niveau +"','" + StockQuant.getValue() + "','" + dateAjoutSql + "')");
                String query = "SELECT * FROM stocks";
                rs = stat1.executeQuery(query);
                RowSetFactory factory = RowSetProvider.newFactory();
                CachedRowSet crs = factory.createCachedRowSet();
                crs.populate(rs);
                ResultSetTableModel modl = new ResultSetTableModel(crs);
                jTableStock.setModel(modl);
                con.close();
                calculStockUpdate();
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AddStockActionPerformed

    private void ConsultStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultStockActionPerformed
        if(evt.getSource()==ConsultStock) {
            con = DbConnection.getConnection();
            try {
                stat1 = con.createStatement();
                String query = "SELECT * FROM stocks";
                rs = stat1.executeQuery(query);
                RowSetFactory factory = RowSetProvider.newFactory();
                CachedRowSet crs = factory.createCachedRowSet();
                crs.populate(rs);
                ResultSetTableModel modl = new ResultSetTableModel(crs);
                jTableStock.setModel(modl);
                con.close();
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_ConsultStockActionPerformed

    private void AddComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddComActionPerformed
        cahier = CahierTypeCommande.getSelectedItem().toString();
        Object[][] rowData = {{cahier, ComCI.getValue(), ComCP.getValue(), ComCE1.getValue(), ComCE2.getValue(), ComCM1.getValue(), ComCM2.getValue()}};
        model.addRow(rowData[0]);
        File file = new File("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\appsVente\\src\\main\\java\\com\\mycompany\\appsvente\\commande.properties");
        try{
            if(!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file, true); 
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("ci."+cahier+"="+String.valueOf(ComCI.getValue())+"\n");
            bufferedWriter.write("cp."+cahier+"="+String.valueOf(ComCP.getValue())+"\n");
            bufferedWriter.write("ce1."+cahier+"="+String.valueOf(ComCE1.getValue())+"\n");
            bufferedWriter.write("ce2."+cahier+"="+String.valueOf(ComCE2.getValue())+"\n");
            bufferedWriter.write("cm1."+cahier+"="+String.valueOf(ComCM1.getValue())+"\n");
            bufferedWriter.write("cm2."+cahier+"="+String.valueOf(ComCM2.getValue())+"\n");
            bufferedWriter.close();

            int value = 0;
            ComCI.setValue(value);
            ComCP.setValue(value);
            ComCE1.setValue(value);
            ComCE2.setValue(value);
            ComCM1.setValue(value);
            ComCM2.setValue(value);
        }catch(IOException e) {
        }  

    }//GEN-LAST:event_AddComActionPerformed

    private void CahierTypeCommandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CahierTypeCommandeActionPerformed

    }//GEN-LAST:event_CahierTypeCommandeActionPerformed

    private void CahierTypeCommandeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CahierTypeCommandeItemStateChanged
        cahier = (String)CahierTypeCommande.getSelectedItem();
        switch(cahier) {
            case "Ecriture":
                ComCI.setEnabled(true);
                ComCP.setEnabled(true);
                ComCE1.setEnabled(false);
                ComCE2.setEnabled(false);
                ComCM1.setEnabled(false);
                ComCM2.setEnabled(false);
                break;
            case "Transition":
                ComCI.setEnabled(true);
                ComCP.setEnabled(false);
                ComCE1.setEnabled(false);
                ComCE2.setEnabled(false);
                ComCM1.setEnabled(false);
                ComCM2.setEnabled(false);
                break;
            case "Revision":
                ComCI.setEnabled(false);
                ComCP.setEnabled(true);
                ComCE1.setEnabled(false);
                ComCE2.setEnabled(false);
                ComCM1.setEnabled(false);
                ComCM2.setEnabled(false);
                break;
            case "Prod-ecrite":
                ComCI.setEnabled(false);
                ComCP.setEnabled(false);
                ComCE1.setEnabled(true);
                ComCE2.setEnabled(true);
                ComCM1.setEnabled(true);
                ComCM2.setEnabled(true);
                break;
            case "Lecture":
                ComCI.setEnabled(true);
                ComCP.setEnabled(true);
                ComCE1.setEnabled(true);
                ComCE2.setEnabled(true);
                ComCM1.setEnabled(true);
                ComCM2.setEnabled(true);
        }
    }//GEN-LAST:event_CahierTypeCommandeItemStateChanged

    private void facturationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturationActionPerformed
            if(evt.getSource()==facturation) {
            ecole = ComEcole.getText();
            con = DbConnection.getConnection();
            try{
                stat1 = con.createStatement();
                rs = stat1.executeQuery("SELECT Prenom, Nom, NTelphone FROM clients WHERE Ecole = '"+ecole+"'");
                while(rs.next()) {
                    prenom = rs.getString("Prenom");
                    nom = rs.getString("Nom");
                    ntelphone = rs.getString("NTelphone");
                    
                }
                rs.close();
                for(int i=0;i<model.getRowCount();i++){
                    cahier = String.valueOf(model.getValueAt(i, 0));
                    setNBcahier(cahier);
                }
                //paye = new DoitPayer();
                String val = aPayer.getText();
                facture = new Facture();
                facture.makeFacture(prenom, nom, ntelphone, ecole, ci, cp, ce1, ce2, cm1, cm2, val);
                model.setRowCount(0);
                File file = new File("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\appsVente\\src\\main\\java\\com\\mycompany\\appsvente\\commande.properties");
                if(file.exists()) {
                file.delete();
                }
                }catch(SQLException e) {
                    e.printStackTrace();
                }catch(IOException e) {
                    e.printStackTrace();
                }
                }
            
    }//GEN-LAST:event_facturationActionPerformed

    private void PayementValideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayementValideActionPerformed
        con = DbConnection.getConnection();
        try {
            String ecole = PayementEcole.getText();
            int montant = Integer.valueOf(PayementMontant.getText());
            int relicat = Integer.valueOf(PayementRelicat.getText());
            java.util.Date d = new java.util.Date();
            java.sql.Timestamp dateAjoutSql = new java.sql.Timestamp(d.getTime());
            stat1 = con.createStatement();
            String query = "INSERT INTO payement(Ecole, Montant, Relicat, dates) VALUES('"+ecole+"', '"+montant+"', '"+relicat+"', '"+dateAjoutSql+"')";
            stat1.executeUpdate(query);
            getRevenu();
            UpdateVenteHistorique();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_PayementValideActionPerformed

    private void ComTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComTableMouseClicked
        int index = ComTable.getSelectedRow();
        model.removeRow(index);
    }//GEN-LAST:event_ComTableMouseClicked

    private void jScrollPaneStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPaneStockMouseClicked
        
    }//GEN-LAST:event_jScrollPaneStockMouseClicked
    
    private void jTableStockMouseClicked(java.awt.event.MouseEvent evt) {
        int index = jTableStock.getSelectedRow();
        
       
        
        
        con = DbConnection.getConnection();
        try{
            String query2 = "SELECT * FROM stocks";
            rs = stat1.executeQuery(query2);
            RowSetFactory factory = RowSetProvider.newFactory();
            CachedRowSet crs = factory.createCachedRowSet();
            crs.populate(rs);
            ResultSetTableModel modl = new ResultSetTableModel(crs);
            jTableStock.setModel(modl);
            
            int a = modl.getColumnCount();
        System.out.println("a = "+a);
        ArrayList<Object> tab = new ArrayList();
        for(int i=0; i<=a;i++) {
            tab.add(modl.getValueAt(index, i));
        }
            
            String cahier = String.valueOf(tab.get(0));
            String niveau = String.valueOf(tab.get(1));
            int q = (Integer)tab.get(2);
            java.util.Date date = new java.util.Date();
            date = (java.util.Date)tab.get(3);
            stat1 = con.createStatement();
            String query = "DELETE FROM stocks where cahier_de = '"+cahier+"' and '"+niveau+"' and "+q+" and '"+date+"'";
            stat1.executeUpdate(query);
            stat1.close();
            
            String query3 = "SELECT * FROM stocks";
            stat1 = con.createStatement();
            rs = stat1.executeQuery(query3);
            RowSetFactory factory1 = RowSetProvider.newFactory();
            CachedRowSet crs1 = factory1.createCachedRowSet();
            crs1.populate(rs);
            ResultSetTableModel modl1 = new ResultSetTableModel(crs1);
            jTableStock.setModel(modl1);
        }catch(SQLException e) {
            e.printStackTrace();
        }
       
       
    }
    public void UpdateVenteHistorique() {
        con = DbConnection.getConnection();
        try {
            String query2 = "SELECT * FROM payement";
            stat1 = con.createStatement();
            rs = stat1.executeQuery(query2);
                RowSetFactory factory = RowSetProvider.newFactory();
                CachedRowSet crs = factory.createCachedRowSet();
                crs.populate(rs);
                ResultSetTableModel model = new ResultSetTableModel(crs);
                jTableHistorique.setModel(model);
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void getRevenu() {
        con = DbConnection.getConnection();
        try{
            int Montant = 0;
            stat1 = con.createStatement();
            String query = "SELECT Montant FROM payement";
            rs = stat1.executeQuery(query);
            while(rs.next()) {
                int ajmontant = rs.getInt("Montant");
                Montant = Montant + ajmontant;
            }
            RevenuLabel.setText(String.valueOf(Montant));
            rs.close();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void visibleInfosAddDown() {
        InfosAddClient.setVisible(false);
    }
    public void visisbleaPayerDown() {
        aPayer.setVisible(false);
    }
    
    public void visibleInfosPayeDown() {
        InfosPaye.setVisible(false);
    }
    
    public void setStockNiveauNull() {
        StockNiveau = null;
    }

    public void calculStockUpdate() {
        con = DbConnection.getConnection();
        try {
            stat1 = con.createStatement();
            String query = "SELECT quantite FROM stocks";
            rs = stat1.executeQuery(query);
            Stock = 0;
            while(rs.next()) {
                int ajStock = rs.getInt("quantite");
                System.out.println("stock: "+ajStock);
                Stock = Stock + ajStock;
            }
            labelQStock.setText(String.valueOf(Stock));
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public void setNBcahier(String c) throws IOException{
        Properties props = new Properties();
        FileInputStream in = new FileInputStream("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\appsVente\\src\\main\\java\\com\\mycompany\\appsvente\\commande.properties");
        props.load(in);
        in.close();
        
        
        String b = c;
                switch(b) {
            case "Lecture":
                ci[2] = Integer.valueOf(props.getProperty("ci.Lecture"));//Integer)ComCI.getValue();
                cp[2] = Integer.valueOf(props.getProperty("cp.Lecture"));
                ce1[2] = Integer.valueOf(props.getProperty("ce1.Lecture"));
                ce2[2] = Integer.valueOf(props.getProperty("ce2.Lecture"));
                cm1[2] = Integer.valueOf(props.getProperty("cm1.Lecture"));
                cm2[2] = Integer.valueOf(props.getProperty("cm2.Lecture"));
                break;
            case "Ecriture":
                ci[3] = Integer.valueOf(props.getProperty("ci.Ecriture"));
                cp[3] = Integer.valueOf(props.getProperty("cp.Ecriture"));
                break;
            case "Transition":
                ci[1] = Integer.valueOf(props.getProperty("ci.Transition"));
                break;
            case "Revision":
                cp[4] = Integer.valueOf(props.getProperty("cp.Revision"));
                break;
            case "Prod-ecrite":
                ce1[0] = Integer.valueOf(props.getProperty("ce1.Prod-ecrite"));
                ce2[0] = Integer.valueOf(props.getProperty("ce2.Prod-ecrite"));
                cm1[0] = Integer.valueOf(props.getProperty("cm1.Prod-ecrite"));
                cm2[0] = Integer.valueOf(props.getProperty("cm2.Prod-ecrite"));
                break;
                
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCom;
    private javax.swing.JButton AddStock;
    private javax.swing.JComboBox<String> CahierTypeCommande;
    private javax.swing.JSpinner ComCE1;
    private javax.swing.JSpinner ComCE2;
    private javax.swing.JSpinner ComCI;
    private javax.swing.JSpinner ComCM1;
    private javax.swing.JSpinner ComCM2;
    private javax.swing.JSpinner ComCP;
    private javax.swing.JTextField ComEcole;
    private javax.swing.JTable ComTable;
    private javax.swing.JButton ConsultStock;
    private javax.swing.JLabel InfosAddClient;
    private javax.swing.JLabel InfosPaye;
    private javax.swing.JTextField PayementEcole;
    private javax.swing.JTextField PayementMontant;
    private javax.swing.JTextField PayementRelicat;
    private javax.swing.JButton PayementValide;
    private javax.swing.JLabel RevenuLabel;
    private javax.swing.JComboBox<String> StockCahier;
    private javax.swing.JComboBox<String> StockNiveau;
    private javax.swing.JSpinner StockQuant;
    private javax.swing.JLabel aPayer;
    private javax.swing.JButton btnAddClient;
    private javax.swing.JButton btnSubmitCom;
    private javax.swing.JButton facturation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneStock;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableHistorique;
    private javax.swing.JTable jTableStock;
    private javax.swing.JLabel labelQStock;
    private javax.swing.JButton send;
    private javax.swing.JTextField textEcole;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNom;
    private javax.swing.JTextField textPrenom;
    private javax.swing.JTextField textTelephone;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
