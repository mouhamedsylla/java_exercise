/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.schedulemanager;

import java.sql.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sylla
 */
public class DirScolarite extends javax.swing.JFrame {

    DefaultTableModel model, model1, model2;
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    Statement st1 = null;
    Statement st2 = null;
    Salle mySalle;
    Edt myEdt;
    int nbEtudiant;
    
    public DirScolarite() {
        initComponents();
        Object[][] rowData = null;
        Object[] columnName = {"Classe", "Matière", "Début", "Fin", "Type"};
        model = new DefaultTableModel(rowData, columnName);
        edt.setModel(model);
        
        Object[][] rowData1 = null;
        Object[] columnName1 = {"Nom", "Place", "Disponible A"};
        model1 = new DefaultTableModel(rowData1, columnName1);
        salleTable.setModel(model1);
        
        Object[][] rowData2 = null;
        Object[] columnName2 = {"Nom", "Place", "Occupé par", "Disponible à"};
        model2 = new DefaultTableModel(rowData2, columnName2);
        InfosSalleTable.setModel(model2);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jour = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        edt = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        salleTable = new javax.swing.JTable();
        affecte = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jourInfos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        salleInfos = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        InfosSalleTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        affectInfos = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(149, 219, 251));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Directeur Scolarité");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, null, null));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, java.awt.Color.black, null));

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black, null, null));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Emplois du temps");

        jour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi" }));
        jour.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jourItemStateChanged(evt);
            }
        });
        jour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jourActionPerformed(evt);
            }
        });

        edt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        edt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edtMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(edt);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jour, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black, null, null));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Affectation");

        salleTable.setModel(new javax.swing.table.DefaultTableModel(
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
        salleTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salleTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(salleTable);

        affecte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        affecte.setText("Affecté");
        affecte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affecteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(affecte, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(affecte)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Gestion des salles", jPanel2);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Disponibilité des sallles");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Jour");

        jourInfos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi" }));
        jourInfos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jourInfosItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Salle");

        salleInfos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                salleInfosItemStateChanged(evt);
            }
        });

        InfosSalleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(InfosSalleTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jourInfos, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salleInfos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jourInfos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salleInfos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Infos Salles", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, java.awt.Color.black, null));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(affectInfos, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(affectInfos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jourItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jourItemStateChanged
        setEdt();
    }//GEN-LAST:event_jourItemStateChanged

    private void affecteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affecteActionPerformed
        if(evt.getSource()==affecte) {
            ArrayList<Object> myInfo;
            LocalTime h_dispo_salle = mySalle.getHdispo();
            h_dispo_salle = h_dispo_salle.minusMinutes(1);
            System.out.println(h_dispo_salle);
            LocalTime h_deb_edt = myEdt.getHdebut();
            String nomC = myEdt.getEdt_de();
            con = DbConnection.getConnection();
            try {
                st = con.createStatement();
                String sql1 = "SELECT nbEtudiants FROM Classe WHERE nomClasse = '"+nomC+"'";
                rs = st.executeQuery(sql1);
                while(rs.next()) {
                    nbEtudiant = rs.getInt("nbEtudiants");
                }
            }catch(SQLException e) {
                e.printStackTrace();
            }
            finally {
                try{
                    if(con!=null)
                    con.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }   
            }
            boolean isbefore = h_deb_edt.isAfter(h_dispo_salle);
            
            System.out.println(isbefore);
            if(isbefore && nbEtudiant <= mySalle.getPlace()){
                myInfo = mySalle.affecteSalle(myEdt);
                String laClasse = String.valueOf(myInfo.get(0));
                LocalTime h_disponible = LocalTime.parse(String.valueOf(myInfo.get(1)));
                String string_h_disponible = String.valueOf(h_disponible);
                String laSalle = mySalle.getSalle();
                String leJour = mySalle.getJour();
                con = DbConnection.getConnection();
                try {
                    st = con.createStatement();
                    String sql = "UPDATE Salle SET Disponible_a = '"+string_h_disponible+"' WHERE nomSalle = '"+laSalle+"' AND jour = '"+leJour+"'";
                    st.executeUpdate(sql);
                    st1 = con.createStatement();
                    String sql2 = "UPDATE edt SET Salle = '"+mySalle.getSalle()+"' WHERE edt_de = '"+myEdt.getEdt_de()+"' AND jour = '"+myEdt.getJour()+"' AND matiere = '"+myEdt.getMatiere()+"'";
                    st1.executeUpdate(sql2);
                    ImageIcon icone = new ImageIcon("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\ScheduleManager\\src\\main\\ressources\\apply-icon.png");
                    affectInfos.setIcon(icone);
                    st2 = con.createStatement();
                    String sql3 = "INSERT INTO salle(nomSalle, nbPlace, estAffecte_a, jour) VALUES('"+mySalle.getSalle()+"', '"+mySalle.getPlace()+"', '"+myEdt.getEdt_de()+"', '"+mySalle.getJour()+"')";
                    st2.executeUpdate(sql3);
                    affectInfos.setEnabled(true);
                    affectInfos.setEnabled(true);
                    affectInfos.setText("Salle affecté avec succès");
                    affectInfos.setVisible(true);
                     new java.util.Timer().schedule(new java.util.TimerTask() {
                    @Override
                    public void run() {
                        affectInfos.setEnabled(false);
                    }
                    }, 
                    2000 
                    );
                }catch(SQLException e) {
                    e.printStackTrace();
                }
            }
            else {
                ImageIcon icone = new ImageIcon("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\ScheduleManager\\src\\main\\ressources\\danger-icon.png");
                affectInfos.setEnabled(true);
                affectInfos.setIcon(icone);
                affectInfos.setText("Affectation échoué");
                affectInfos.setVisible(true);
                new java.util.Timer().schedule(new java.util.TimerTask() {
                    @Override
                    public void run() {
                        affectInfos.setEnabled(false);
                    }
                    }, 
                    2000 
                    );
            }

        }
    }//GEN-LAST:event_affecteActionPerformed

    private void edtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edtMouseClicked
        if(evt.getSource()==edt) {    
            int index = edt.getSelectedRow();
            int column = model.getColumnCount();
            ArrayList<String> info = new ArrayList();
            for(int i=0;i<column;i++) {
                info.add(String.valueOf(model.getValueAt(index, i)));
            }
            String jr = String.valueOf(jour.getSelectedItem());
            myEdt = new Edt(info.get(0), info.get(1), jr, info.get(2), info.get(3), info.get(4));
            System.out.println("La classe est crée");
        }
    }//GEN-LAST:event_edtMouseClicked

    private void salleTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salleTableMouseClicked
        if(evt.getSource()==salleTable) {
            int index = salleTable.getSelectedRow();
            int column = model1.getColumnCount();
            ArrayList<Object> info = new ArrayList();
            for(int i=0;i<column;i++) {
                info.add(model1.getValueAt(index, i));
            }
            LocalTime heur_dispo = LocalTime.parse(String.valueOf(info.get(2)));
             String j = String.valueOf(jour.getSelectedItem());
            String nom = String.valueOf(info.get(0));
            int nbP = Integer.valueOf(String.valueOf(info.get(1)));
            mySalle = new Salle(nom, nbP, heur_dispo, j);
            System.out.println("La classe est crée");
        }
    }//GEN-LAST:event_salleTableMouseClicked

    private void jourInfosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jourInfosItemStateChanged
        setInfosSalle();
    }//GEN-LAST:event_jourInfosItemStateChanged

    private void salleInfosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_salleInfosItemStateChanged
        setInfosSalle();
    }//GEN-LAST:event_salleInfosItemStateChanged

    private void jourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jourActionPerformed
        
    }//GEN-LAST:event_jourActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        if(evt.getSource()==exit){
            this.setVisible(false);
        }
    }//GEN-LAST:event_exitActionPerformed


        public void setEdt() {
            con = DbConnection.getConnection();
            try {
                String jr = String.valueOf(jour.getSelectedItem());
                setSalleTable(jr);
                st = con.createStatement();
                String sql = "SELECT edt_de, matiere, horaire_debut, horaire_fin, type FROM edt WHERE jour = '"+jr+"'";
                rs = st.executeQuery(sql);
                RowSetFactory factory = RowSetProvider.newFactory();
                CachedRowSet crs = factory.createCachedRowSet();
                crs.populate(rs);
                model.setRowCount(0);
                while(crs.next()) {
                    String clse = crs.getString("edt_de");
                    String mat = crs.getString("matiere");
                    String h_d = crs.getString("horaire_debut");
                    String h_f = crs.getString("horaire_fin");
                    String type = crs.getString("type");
                    
                    Object[][] rowData = {{clse, mat, h_d, h_f, type}};
                    model.addRow(rowData[0]);
                }
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }
        
        public void setSalleTable(String jr) {
            con = DbConnection.getConnection();
            try {
                st = con.createStatement();
                String sql = "SELECT nomSalle, nbPlace, Disponible_a FROM Salle WHERE jour = '"+jr+"' AND estAffecte_a IS NULL";
                rs = st.executeQuery(sql);
                RowSetFactory factory = RowSetProvider.newFactory();
                CachedRowSet crs = factory.createCachedRowSet();
                crs.populate(rs);
                model1.setRowCount(0);
                while(crs.next()) {
                    String sal = crs.getString("nomSalle");
                    String nbp = crs.getString("nbPlace");
                    String h_d = crs.getString("Disponible_a");
                    String dispo = h_d;
                    
                    Object[][] rowData1 = {{sal, nbp, dispo}};
                    model1.addRow(rowData1[0]);
                }
            }catch(SQLException e) {
                e.printStackTrace();
            }           
        }
        
        public void setLabelVisible(boolean b) {
            affectInfos.setVisible(b);
        }
        
            public void setSalle() {
        salleInfos.removeAllItems();
        con = DbConnection.getConnection();
        String jr = String.valueOf(jourInfos.getSelectedItem());
        try {
            st = con.createStatement();
            String sql = "SELECT nomSalle FROM Salle WHERE jour = '"+jr+"'";
            rs = st.executeQuery(sql);
            RowSetFactory factory = RowSetProvider.newFactory();
            CachedRowSet crs = factory.createCachedRowSet();
            crs.populate(rs);
            while(crs.next()) {
                String nomC = crs.getString("nomSalle");
                salleInfos.addItem(nomC);
            }
            
        }catch(SQLException e) {
            e.printStackTrace();
        }      
    }
            
    public void setInfosSalle() {
        
        con = DbConnection.getConnection();
        try {
            model2.setRowCount(0);
            String sall = String.valueOf(salleInfos.getSelectedItem());
            String jr = String.valueOf(jourInfos.getSelectedItem());
            st = con.createStatement();
            String sql = "SELECT nomSalle, nbPlace, estAffecte_a, Disponible_a FROM Salle WHERE nomSalle = '"+sall+"' AND jour = '"+jr+"'";
            rs = st.executeQuery(sql);
            while(rs.next()) {
                String n = rs.getString("nomSalle");
                String nbP = rs.getString("nbPlace");
                String estA = rs.getString("estAffecte_a");
                String dispo = rs.getString("Disponible_a");
                
                Object[][] rowData2= {{n, nbP, estA, dispo}};
                model2.addRow(rowData2[0]);
            } 
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
        
        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable InfosSalleTable;
    private javax.swing.JLabel affectInfos;
    private javax.swing.JButton affecte;
    private javax.swing.JTable edt;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jour;
    private javax.swing.JComboBox<String> jourInfos;
    private javax.swing.JComboBox<String> salleInfos;
    private javax.swing.JTable salleTable;
    // End of variables declaration//GEN-END:variables
}
