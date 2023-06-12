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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sylla
 */
public class ChefDepartement extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    Statement st = null;
    DefaultTableModel model, model1;
    public ChefDepartement() {
        initComponents();
        Object[][] rowData1 = null;
        Object[] columnName1 = {"Nom", "Place", "Occupé par", "Disponible à"};
        model1 = new DefaultTableModel(rowData1, columnName1);
        TableInfosSalle.setModel(model1);
        
        Object[][] rowData = null;
        Object[] columnName = {"Classe", "Jour", "Matière", "Début cours", "Fin cours", "Professeur", "Type"};
        model = new DefaultTableModel(rowData, columnName);
        EdtTable.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EdtTable = new javax.swing.JTable();
        classe = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        jour = new javax.swing.JComboBox<>();
        matiere = new javax.swing.JComboBox<>();
        professeur = new javax.swing.JComboBox<>();
        AjEdt = new javax.swing.JButton();
        SubEdt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Hdeb = new javax.swing.JTextField();
        Fdeb = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jourInfos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableInfosSalle = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        Salle = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(149, 219, 251));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Chef Département");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, null, null));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, java.awt.Color.black, null));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, java.awt.Color.black, null));

        EdtTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(EdtTable);

        classe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                classeItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Classe");

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cours", "TD", "TP" }));

        jour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi" }));

        matiere.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                matiereItemStateChanged(evt);
            }
        });

        AjEdt.setIcon(new javax.swing.ImageIcon("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\ScheduleManager\\src\\main\\java\\com\\mycompany\\schedulemanager\\image\\text-plus-icon.png")); // NOI18N
        AjEdt.setText("Ajouté");
        AjEdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjEdtActionPerformed(evt);
            }
        });

        SubEdt.setIcon(new javax.swing.ImageIcon("C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\ScheduleManager\\src\\main\\java\\com\\mycompany\\schedulemanager\\image\\apply-icon.png")); // NOI18N
        SubEdt.setText("Submit");
        SubEdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubEdtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Heure Début");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Heure Fin");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(AjEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SubEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(classe, 0, 111, Short.MAX_VALUE))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Hdeb, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Fdeb, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jour, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(matiere, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(professeur, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matiere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(professeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(classe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Hdeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Fdeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AjEdt)
                    .addComponent(SubEdt))
                .addGap(42, 42, 42))
        );

        jTabbedPane1.addTab("Dashboard", jPanel3);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Disponiblité des salles");

        jourInfos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi" }));
        jourInfos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jourInfosItemStateChanged(evt);
            }
        });
        jourInfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jourInfosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Jour");

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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Salle");

        Salle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SalleItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jourInfos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Salle, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 193, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jourInfos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Salle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        jTabbedPane1.addTab("Infos Salles", jPanel4);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, java.awt.Color.black, null));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void matiereItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_matiereItemStateChanged
        setProf();
    }//GEN-LAST:event_matiereItemStateChanged

    private void classeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_classeItemStateChanged
        setMatiere();
    }//GEN-LAST:event_classeItemStateChanged

    private void AjEdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjEdtActionPerformed
        String classrom = String.valueOf(classe.getSelectedItem());
        String jours = String.valueOf(jour.getSelectedItem());
        String mat = String.valueOf(matiere.getSelectedItem());
        LocalTime deb = LocalTime.parse(Hdeb.getText());
        LocalTime fin = LocalTime.parse(Fdeb.getText());
        String profs = String.valueOf(professeur.getSelectedItem());
        String typ = String.valueOf(type.getSelectedItem());
        
        Object[][] rowData = {{classrom, jours, mat, deb, fin, profs, typ}};
        //EdtTable.setModel(model);
        
        model.addRow(rowData[0]);
        
    }//GEN-LAST:event_AjEdtActionPerformed

    private void SubEdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubEdtActionPerformed
        int l=model.getRowCount();
        int c=model.getColumnCount();
        con=DbConnection.getConnection();
        try{
        for(int i=0;i<l;i++){ 
            ArrayList<Object> list = new ArrayList();
            for(int j=0;j<c;j++){
                System.out.println(model.getValueAt(i, j));
                list.add(model.getValueAt(i, j));
            }

            String classrom=String.valueOf(list.get(0));
            String jours=String.valueOf(list.get(1));
            String mat=String.valueOf(list.get(2));
            LocalTime deb=LocalTime.parse(String.valueOf(list.get(3)));
            String t1 = String.valueOf(deb);
            LocalTime fin =LocalTime.parse(String.valueOf(list.get(4))); 
            String t2 = String.valueOf(fin);
            String p = String.valueOf(list.get(5));
            String t = String.valueOf(list.get(6));

            st=con.createStatement();
            String req="INSERT INTO edt(edt_de, jour, matiere, horaire_debut, horaire_fin, prof, type) values ('"+classrom+"', '"+jours+"', '"+mat+"', '"+t1+"', '"+t2+"', '"+p+"', '"+t+"')";
            st.executeUpdate(req);
            System.out.println("OKi");
            }
            }catch(SQLException e){
                    e.printStackTrace();
                    
            }
        
       
        
                
    }//GEN-LAST:event_SubEdtActionPerformed

    private void jourInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jourInfosActionPerformed
        
    }//GEN-LAST:event_jourInfosActionPerformed

    private void jourInfosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jourInfosItemStateChanged
        setSalle();
        setInfosSalle();
    }//GEN-LAST:event_jourInfosItemStateChanged

    private void SalleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SalleItemStateChanged
        setInfosSalle();
    }//GEN-LAST:event_SalleItemStateChanged

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       if(evt.getSource()==exit){
            this.setVisible(false);
        }
    }//GEN-LAST:event_exitActionPerformed

    public void setSalle() {
        Salle.removeAllItems();
        con = DbConnection.getConnection();
        String jr = String.valueOf(jourInfos.getSelectedItem());
        try {
            st = con.createStatement();
            String sql = "SELECT nomSalle FROM Salle WHERE jour = '"+jr+"' AND estAffecte_a IS NULL";
            rs = st.executeQuery(sql);
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
    
   public void setMatiere() {
        matiere.removeAllItems();
        String c = String.valueOf(classe.getSelectedItem());
        con = DbConnection.getConnection();
        try{
            st = con.createStatement();
            String sql = "SELECT nomMatiere FROM matiere WHERE classe = '"+c+"'";
            rs = st.executeQuery(sql);
            RowSetFactory factory = RowSetProvider.newFactory();
            CachedRowSet crs = factory.createCachedRowSet();
            crs.populate(rs);
            while(crs.next()){
                String mat = crs.getString("nomMatiere");
                int nbitem = matiere.getItemCount();
                for(int i=0;i<nbitem;i++) {
                    if(mat.equals(matiere.getItemAt(i)))
                        matiere.removeItemAt(i);
                }
                matiere.addItem(mat);
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        finally{
            try{
                if(con!=null)
                    con.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
   
    public void setProf() {
        professeur.removeAllItems();
        String p = String.valueOf(matiere.getSelectedItem());
        con = DbConnection.getConnection();
        try{
            st = con.createStatement();
            String sql = "SELECT nom, prenom FROM Enseignant WHERE matiere = '"+p+"'";
            rs = st.executeQuery(sql);
            RowSetFactory factory = RowSetProvider.newFactory();
            CachedRowSet crs = factory.createCachedRowSet();
            crs.populate(rs);
            while(crs.next()) {
                String nom = crs.getString("nom");
                String prenom = crs.getString("prenom");
                String prof = prenom+" "+nom;
                professeur.addItem(prof);
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
    
    public void setInfosSalle() {
        model1.setRowCount(0);
        con = DbConnection.getConnection();
        try {
            String sall = String.valueOf(Salle.getSelectedItem());
            String jr = String.valueOf(jourInfos.getSelectedItem());
            st = con.createStatement();
            String sql = "SELECT nomSalle, nbPlace, estAffecte_a, Disponible_a FROM Salle WHERE jour = '"+jr+"' AND nomSalle = '"+sall+"'";
            rs = st.executeQuery(sql);
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
    
    public void setClasse(ArrayList<String> nomClasse) {
        Iterator itr = nomClasse.iterator();
        while(itr.hasNext()) {
            classe.addItem(String.valueOf(itr.next()));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjEdt;
    private javax.swing.JTable EdtTable;
    private javax.swing.JTextField Fdeb;
    private javax.swing.JTextField Hdeb;
    private javax.swing.JComboBox<String> Salle;
    private javax.swing.JButton SubEdt;
    private javax.swing.JTable TableInfosSalle;
    private javax.swing.JComboBox<String> classe;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jour;
    private javax.swing.JComboBox<String> jourInfos;
    private javax.swing.JComboBox<String> matiere;
    private javax.swing.JComboBox<String> professeur;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
