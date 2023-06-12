/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.schedulemanager;

import java.sql.*;
import java.util.ArrayList;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sylla
 */
public class Admin extends javax.swing.JFrame {

    Connection con;
    Statement stat, stat1;
    ResultSet rs = null;
    DefaultTableModel model, model1;
    public Admin() {
        initComponents();
        Object[][] rowdata = null;
        Object[] columndata = {"nom", "prenom", "statut", "identification"};
        model = new DefaultTableModel(rowdata, columndata);
        AccessTab.setModel(model);
        
        Object[][] rowdata1 = null;
        Object[] columndata1 = {"Classe", "Jour", "Matière", "Début cours", "Fin cours", "Professeur", "Type"};
        model1 = new DefaultTableModel(rowdata1, columndata1);
        TableInfosSalle.setModel(model1);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AStype = new javax.swing.JComboBox<>();
        ASnom = new javax.swing.JTextField();
        ASprenom = new javax.swing.JTextField();
        ASDepMat = new javax.swing.JTextField();
        AdminDelete = new javax.swing.JButton();
        AdminAdd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ASpassword = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textSearch = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AccessTab = new javax.swing.JTable();
        AcessBlock = new javax.swing.JCheckBox();
        AccessNoBlock = new javax.swing.JCheckBox();
        AdminAccess = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jour = new javax.swing.JComboBox<>();
        Salle = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableInfosSalle = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        adminInfos = new javax.swing.JLabel();
        modifAccess = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("jCheckBoxMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(149, 219, 251));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Administrateur");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, null, null));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, java.awt.Color.black, null));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Ajouter / Supprimer");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, null, null));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Nom");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Prénom");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Dép/Matière");

        AStype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enseignant", "Directeur Scolarité", "Chef Département" }));
        AStype.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                AStypeItemStateChanged(evt);
            }
        });

        AdminDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\ScheduleManager\\src\\main\\java\\com\\mycompany\\schedulemanager\\image\\delete-icon.png")); // NOI18N
        AdminDelete.setText("Supprimé");
        AdminDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminDeleteActionPerformed(evt);
            }
        });

        AdminAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\ScheduleManager\\src\\main\\java\\com\\mycompany\\schedulemanager\\image\\text-plus-icon.png")); // NOI18N
        AdminAdd.setText("Ajouté");
        AdminAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminAddActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Password");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(AdminDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(AdminAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AStype, 0, 168, Short.MAX_VALUE)
                    .addComponent(ASnom)
                    .addComponent(ASprenom)
                    .addComponent(ASDepMat)
                    .addComponent(ASpassword))
                .addGap(50, 50, 50))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(AStype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ASnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ASprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ASDepMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ASpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminAdd)
                    .addComponent(AdminDelete))
                .addGap(40, 40, 40))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Modifier accès");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, null, null));

        textSearch.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null)));
        textSearch.setOpaque(true);

        Search.setIcon(new javax.swing.ImageIcon("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\ScheduleManager\\src\\main\\java\\com\\mycompany\\schedulemanager\\image\\search-icon.png")); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        AccessTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Prenom", "Statut", "Identification"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(AccessTab);

        AcessBlock.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        AcessBlock.setText("bloqué");

        AccessNoBlock.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        AccessNoBlock.setText("autorisé");

        AdminAccess.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        AdminAccess.setIcon(new javax.swing.ImageIcon("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\ScheduleManager\\src\\main\\java\\com\\mycompany\\schedulemanager\\image\\apply-icon.png")); // NOI18N
        AdminAccess.setText("Submit");
        AdminAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminAccessActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 8)); // NOI18N
        jLabel8.setText("*entré ici un nom ex: Sylla");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AdminAccess)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Search))
                                .addComponent(AcessBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AccessNoBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search))
                .addGap(2, 2, 2)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AcessBlock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccessNoBlock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdminAccess)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Gestion des accès", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Disponiblité des salles");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Jour");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Salle");

        jour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi" }));
        jour.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jourItemStateChanged(evt);
            }
        });

        Salle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SalleItemStateChanged(evt);
            }
        });

        TableInfosSalle.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TableInfosSalle);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jour, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(Salle, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Infos salles", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, java.awt.Color.black, null));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminInfos, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modifAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminInfos, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(modifAccess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exit.setText("Logout");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        if(evt.getSource()==Search){
            model.setRowCount(0);
        }
        con = DbConnection.getConnection();
        ArrayList<String> table = new ArrayList();
        try{
            DatabaseMetaData md = con.getMetaData();
            ResultSet rs = md.getTables(null, null, "%", null);
            while (rs.next()) {
            table.add(rs.getString(3));
            }
            for(int i = 1; i<table.size(); i++) {
            System.out.println(i+": "+table.get(i));
            }   
            table.remove(2);
            table.remove(5);
            table.remove(5);
            table.remove(5);
            
            String nom = textSearch.getText();
            int row = 0;
            int column = 0;
            for(int i = 1; i<table.size(); i++) {
                
                stat = con.createStatement();
                String myTable = table.get(i);
                String sql = "SELECT nom, prenom, statut, identification FROM "+myTable+" WHERE nom = '"+nom+"'";
                rs = stat.executeQuery(sql);

                while(rs.next()) {
                    String rsnom = rs.getString("nom");
                    String rsprenom = rs.getString("prenom");
                    String rstatut = rs.getString("statut");
                    int id = rs.getInt("identification");
                    Object[][] rowdata = {{rsnom, rsprenom, rstatut, id}};
                    model.addRow(rowdata[0]);
                }
                row++;
                column = 0;
            }

             
            }catch(SQLException e) {
                e.printStackTrace();
            }finally{
                try{
                    if(con!=null) con.close();
                }catch(SQLException e) {
                    e.printStackTrace();
                }
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void AdminAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminAccessActionPerformed
        if(evt.getSource()==AdminAccess) {
        int index = AccessTab.getSelectedRow();
        String ident = String.valueOf(AccessTab.getValueAt(index, 3));
        String statu = String.valueOf(AccessTab.getValueAt(index, 2));
        int id = Integer.valueOf(ident);
        
        con = DbConnection.getConnection();
        try {
            stat1 = con.createStatement();
            if(AcessBlock.isSelected()){
            String sql = "UPDATE "+statu+" set access = 0 WHERE identification = "+id+"";
            stat1.executeUpdate(sql);
            //JOptionPane.showMessageDialog(null, "Utilisateur bloqué");
            ImageIcon icone1 = new ImageIcon("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\ScheduleManager\\src\\main\\ressources\\danger-icon.png");
                        modifAccess.setIcon(icone1);
                        modifAccess.setEnabled(true);
                        modifAccess.setText("Utilisateur bloqué");
                        modifAccess.setVisible(true);
                     new java.util.Timer().schedule(new java.util.TimerTask() {
                    @Override
                    public void run() {
                        modifAccess.setEnabled(false);
                    }
                    }, 
                    2000 
                    );
            AcessBlock.setSelected(false);
            }
            if(AccessNoBlock.isSelected()){
            String sql = "UPDATE "+statu+" set access = 1 WHERE identification = "+id+"";
            stat1.executeUpdate(sql);
            //JOptionPane.showMessageDialog(null, "Utilisateur débloqué");
            ImageIcon icone2 = new ImageIcon("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\ScheduleManager\\src\\main\\ressources\\apply-icon.png");
                        modifAccess.setIcon(icone2);
                        modifAccess.setEnabled(true);
                        modifAccess.setText("Utilisateur débloqué");
                        modifAccess.setVisible(true);
                     new java.util.Timer().schedule(new java.util.TimerTask() {
                    @Override
                    public void run() {
                        modifAccess.setEnabled(false);
                    }
                    }, 
                    2000 
                    );
            AccessNoBlock.setSelected(false);
            }
            
        }catch(SQLException e) {
            e.printStackTrace();
        }
        finally{
                try{
                    if(con!=null) con.close();
                }catch(SQLException e) {
                    e.printStackTrace();
                }
        }
        }
    }//GEN-LAST:event_AdminAccessActionPerformed

    private void AdminAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminAddActionPerformed
        if(evt.getSource()==AdminAdd) {
            con = DbConnection.getConnection();
            try {
                String nom = ASnom.getText();
                String prenom = ASprenom.getText();
                String password = ASpassword.getText();
                String dep_mat = ASDepMat.getText();
                stat = con.createStatement();
                String sql = "";
                
                String acteur = String.valueOf(AStype.getSelectedItem());
                switch(acteur) {
                    case "Enseignant":
                        sql = "INSERT INTO Enseignant(nom, prenom, password, matiere) VALUES('"+nom+"', '"+prenom+"', '"+password+"', '"+dep_mat+"')";
                        stat.executeUpdate(sql);
                        //JOptionPane.showMessageDialog(null, "Utilisateur ajouté");
                        ImageIcon icone = new ImageIcon("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\ScheduleManager\\src\\main\\ressources\\apply-icon.png");
                        adminInfos.setIcon(icone);
                        adminInfos.setEnabled(true);
                        adminInfos.setText("Utilisateur ajouté");
                        adminInfos.setVisible(true);
                     new java.util.Timer().schedule(new java.util.TimerTask() {
                    @Override
                    public void run() {
                        adminInfos.setEnabled(false);
                    }
                    }, 
                    2000 
                    );
                        break;
                    case "Chef Département":
                        sql = "INSERT INTO ChefDepartement(nom, prenom, password, nomDepartement) VALUES('"+nom+"', '"+prenom+"', '"+password+"', '"+dep_mat+"')";
                        stat.executeUpdate(sql);
                        //JOptionPane.showMessageDialog(null, "Utilisateur ajouté");
                        ImageIcon icone1 = new ImageIcon("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\ScheduleManager\\src\\main\\ressources\\apply-icon.png");
                        adminInfos.setIcon(icone1);
                        adminInfos.setEnabled(true);
                        adminInfos.setText("Utilisateur ajouté");
                        adminInfos.setVisible(true);
                     new java.util.Timer().schedule(new java.util.TimerTask() {
                    @Override
                    public void run() {
                        adminInfos.setEnabled(false);
                    }
                    }, 
                    2000 
                    );
                        break;
                    case "Directeur Scolarité":
                        sql = "INSERT INTO DirScolarite(nom, prenom, password) VALUES('"+nom+"', '"+prenom+"', '"+password+"')";
                        stat.executeUpdate(sql);
                        //JOptionPane.showMessageDialog(null, "Utilisateur ajouté");
                        ImageIcon icone2 = new ImageIcon("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\ScheduleManager\\src\\main\\ressources\\apply-icon.png");
                        adminInfos.setIcon(icone2);
                        adminInfos.setEnabled(true);
                        adminInfos.setText("Utilisateur ajouté");
                        adminInfos.setVisible(true);
                     new java.util.Timer().schedule(new java.util.TimerTask() {
                    @Override
                    public void run() {
                        adminInfos.setEnabled(false);
                    }
                    }, 
                    2000 
                    );
                        break;
                }
                
            }catch(SQLException e) {
                e.printStackTrace();
            }finally{
                try{
                    if(con!=null)
                        con.close();
                }catch(SQLException e) {
                    e.printStackTrace();
                }
            }
            
        }
    }//GEN-LAST:event_AdminAddActionPerformed

    private void AStypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_AStypeItemStateChanged
        String acteur = String.valueOf(AStype.getSelectedItem());
        if(acteur=="Directeur Scolarité") {
            ASDepMat.setEnabled(false);
        }
        else{
            ASDepMat.setEnabled(true);
        }
    }//GEN-LAST:event_AStypeItemStateChanged

    private void AdminDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminDeleteActionPerformed
        con = DbConnection.getConnection();
        try {
                String nom = ASnom.getText();
                String prenom = ASprenom.getText();
                String password = ASpassword.getText();
                String dep_mat = ASDepMat.getText();
                stat = con.createStatement();
                String sql = "";
                
                String acteur = String.valueOf(AStype.getSelectedItem());
                switch(acteur) {
                    case "Enseignant":
                        sql = "DELETE FROM Enseignant WHERE nom = '"+nom+"' AND prenom = '"+prenom+"' AND password = '"+password+"' AND matiere = '"+dep_mat+"'";
                        stat.executeUpdate(sql);
                        //JOptionPane.showMessageDialog(null, "Utilisateur supprimé");
                        ImageIcon icone = new ImageIcon("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\ScheduleManager\\src\\main\\ressources\\danger-icon.png");
                        adminInfos.setIcon(icone);
                        adminInfos.setEnabled(true);
                        adminInfos.setText("Utilisateur supprimé");
                        adminInfos.setVisible(true);
                     new java.util.Timer().schedule(new java.util.TimerTask() {
                    @Override
                    public void run() {
                        adminInfos.setEnabled(false);
                    }
                    }, 
                    2000 
                    );
                        break;
                    case "Chef Département":
                        sql = "DELETE FROM ChefDepartement WHERE nom = '"+nom+"' AND prenom = '"+prenom+"' AND password = '"+password+"' AND nomDepartement = '"+dep_mat+"'";
                        stat.executeUpdate(sql);
                        //JOptionPane.showMessageDialog(null, "Utilisateur supprimé");
                        ImageIcon icone1 = new ImageIcon("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\ScheduleManager\\src\\main\\ressources\\danger-icon.png");
                        adminInfos.setIcon(icone1);
                        adminInfos.setEnabled(true);
                        adminInfos.setText("Utilisateur supprimé");
                        adminInfos.setVisible(true);
                     new java.util.Timer().schedule(new java.util.TimerTask() {
                    @Override
                    public void run() {
                        adminInfos.setEnabled(false);
                    }
                    }, 
                    2000 
                    );
                        break;
                    case "Directeur Scolarité":
                        sql = "DELETE FROM DirScolarite WHERE nom = '"+nom+"' AND prenom = '"+prenom+"' AND password = '"+password+"'";
                        stat.executeUpdate(sql);
                        //JOptionPane.showMessageDialog(null, "Utilisateur supprimé");
                        ImageIcon icone2 = new ImageIcon("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\ScheduleManager\\src\\main\\ressources\\danger-icon.png");
                        adminInfos.setIcon(icone2);
                        adminInfos.setEnabled(true);
                        adminInfos.setText("Utilisateur supprimé");
                        adminInfos.setVisible(true);
                     new java.util.Timer().schedule(new java.util.TimerTask() {
                    @Override
                    public void run() {
                        adminInfos.setEnabled(false);
                    }
                    }, 
                    2000 
                    );
                        break;
                }
                
            }catch(SQLException e) {
                e.printStackTrace();
            }finally{
                try{
                    if(con!=null)
                        con.close();
                }catch(SQLException e) {
                    e.printStackTrace();
                }
            }
            
        
    }//GEN-LAST:event_AdminDeleteActionPerformed

    private void jourItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jourItemStateChanged
        setInfosSalle();
    }//GEN-LAST:event_jourItemStateChanged

    private void SalleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SalleItemStateChanged
        setInfosSalle();
    }//GEN-LAST:event_SalleItemStateChanged

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        if(evt.getSource()==exit){
            this.setVisible(false);
        }
    }//GEN-LAST:event_exitActionPerformed

        public void setInfosSalle() {
        model1.setRowCount(0);
        con = DbConnection.getConnection();
        try {
            String sall = String.valueOf(Salle.getSelectedItem());
            String jr = String.valueOf(jour.getSelectedItem());
            stat = con.createStatement();
            String sql = "SELECT nomSalle, nbPlace, estAffecte_a, Disponible_a FROM Salle WHERE jour = '"+jr+"' AND nomSalle = '"+sall+"'";
            rs = stat.executeQuery(sql);
            while(rs.next()) {
                String n = rs.getString("nomSalle");
                String nbP = rs.getString("nbPlace");
                String estA = rs.getString("estAffecte_a");
                String dispo = rs.getString("Disponible_a");
                
                Object[][] rowData1 = {{n, nbP, estA, dispo}};
                model1.addRow(rowData1[0]);
            } 
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
        
            public void setSalle() {
        Salle.removeAllItems();
        con = DbConnection.getConnection();
        String jr = String.valueOf(jour.getSelectedItem());
        
        try {
            stat = con.createStatement();
            String sql = "SELECT nomSalle FROM Salle WHERE jour = '"+jr+"' AND estAffecte_a IS NULL";
            rs = stat.executeQuery(sql);
            RowSetFactory factory = RowSetProvider.newFactory();
            CachedRowSet crs = factory.createCachedRowSet();
            crs.populate(rs);
            while(crs.next()) {
                String nomC = crs.getString("nomSalle");
                Salle.addItem(nomC);
            }
            
        }catch(SQLException e) {
            e.printStackTrace();
        }      
    }
         public void setFalseVisible() {
             adminInfos.setVisible(false);
         }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ASDepMat;
    private javax.swing.JTextField ASnom;
    private javax.swing.JTextField ASpassword;
    private javax.swing.JTextField ASprenom;
    private javax.swing.JComboBox<String> AStype;
    private javax.swing.JCheckBox AccessNoBlock;
    private javax.swing.JTable AccessTab;
    private javax.swing.JCheckBox AcessBlock;
    private javax.swing.JButton AdminAccess;
    private javax.swing.JButton AdminAdd;
    private javax.swing.JButton AdminDelete;
    private javax.swing.JComboBox<String> Salle;
    private javax.swing.JButton Search;
    private javax.swing.JTable TableInfosSalle;
    private javax.swing.JLabel adminInfos;
    private javax.swing.JButton exit;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jour;
    private javax.swing.JLabel modifAccess;
    private javax.swing.JTextField textSearch;
    // End of variables declaration//GEN-END:variables
}
