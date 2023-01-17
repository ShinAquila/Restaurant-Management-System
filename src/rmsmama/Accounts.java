/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package rmsmama;

import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wang
 */
public class Accounts extends javax.swing.JPanel {

    /**
     * Creates new form acc
     */
    public Accounts() {
        initComponents();
        tb_load();
        disableField();
        
    }

    public void tb_load(){
        try{
            DefaultTableModel dt = (DefaultTableModel) accTable.getModel();
            dt.setRowCount(0);
            
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM accounts");
            
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                
                dt.addRow(v);
                
            
            }
        
        
        }catch  (SQLException e){
            System.out.println(e);
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        accSearchTable = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        accPass = new javax.swing.JTextField();
        accCont = new javax.swing.JTextField();
        accName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        saveBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        accAdd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        accID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        accUser = new javax.swing.JTextField();
        clearBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        accTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Account Info:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Search:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        accSearchTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        accSearchTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                accSearchTableKeyReleased(evt);
            }
        });
        jPanel1.add(accSearchTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 205, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 17, 330, 110));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Name:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 67, -1, -1));
        jPanel2.add(accPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 147, 190, -1));
        jPanel2.add(accCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 227, 190, -1));
        jPanel2.add(accName, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 67, 190, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Password:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 147, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Contact:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 227, -1, -1));

        saveBTN.setBackground(new java.awt.Color(0, 0, 255));
        saveBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveBTN.setForeground(new java.awt.Color(255, 255, 255));
        saveBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmsmama/icons/save.png"))); // NOI18N
        saveBTN.setText("Add");
        saveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTNActionPerformed(evt);
            }
        });
        jPanel2.add(saveBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 90, -1));

        deleteBTN.setBackground(new java.awt.Color(204, 0, 0));
        deleteBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBTN.setForeground(new java.awt.Color(255, 255, 255));
        deleteBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmsmama/icons/delete.png"))); // NOI18N
        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });
        jPanel2.add(deleteBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        updateBTN.setBackground(new java.awt.Color(0, 153, 153));
        updateBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateBTN.setForeground(new java.awt.Color(255, 255, 255));
        updateBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmsmama/icons/update.png"))); // NOI18N
        updateBTN.setText("Update");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });
        jPanel2.add(updateBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));
        jPanel2.add(accAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 187, 190, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Address:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 187, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("ID:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 27, -1, -1));
        jPanel2.add(accID, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 27, 190, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Username:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 107, -1, -1));
        jPanel2.add(accUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 107, 190, -1));

        clearBTN.setBackground(new java.awt.Color(255, 102, 102));
        clearBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clearBTN.setForeground(new java.awt.Color(255, 255, 255));
        clearBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmsmama/icons/clear.png"))); // NOI18N
        clearBTN.setText("Clear");
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });
        jPanel2.add(clearBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 141, 330, 380));

        accTable.setBackground(new java.awt.Color(204, 204, 204));
        accTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        accTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", "", "", "", ""},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Username", "Password", "Address", "Contact"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        accTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(accTable);
        if (accTable.getColumnModel().getColumnCount() > 0) {
            accTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            accTable.getColumnModel().getColumn(1).setPreferredWidth(70);
            accTable.getColumnModel().getColumn(2).setPreferredWidth(30);
            accTable.getColumnModel().getColumn(3).setPreferredWidth(30);
            accTable.getColumnModel().getColumn(4).setPreferredWidth(80);
            accTable.getColumnModel().getColumn(5).setPreferredWidth(60);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 74, 730, 450));
    }// </editor-fold>//GEN-END:initComponents

    public void disableField() {
        accID.setEnabled(false);
    }
    
    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed
        
        String a_name = accName.getText();
        String a_user = accUser.getText();
        String a_pass = accPass.getText();
        String a_add = accAdd.getText();
        String a_cont = accCont.getText();
        
        try{
        
            Statement s = db.mycon().createStatement();
            s.executeUpdate(" INSERT INTO accounts (acc_name,username,password,address,contact) VALUES ('"+a_name+"','"+a_user+"','"+a_pass+"','"+a_add+"','"+a_cont+"') ");
       
        }catch (Exception e){
            System.out.println(e);
        }
        
        JOptionPane.showMessageDialog(null, "Account Saved");
        accID.setText("");
        accName.setText("");
        accUser.setText("");
        accPass.setText("");
        accAdd.setText("");
        accCont.setText("");
        accSearchTable.setText("");
        tb_load();
    }//GEN-LAST:event_saveBTNActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        String a_id = accID.getText();
        String a_name = accName.getText();
        String a_user = accUser.getText();
        String a_pass = accPass.getText();
        String a_add = accAdd.getText();
        String a_cont = accCont.getText();
        
        try{
            
        
            Statement s = db.mycon().createStatement();
            s.executeUpdate(" UPDATE accounts SET acc_name = '"+a_name+"',username = '"+a_user+"',password = '"+a_pass+"', address = '"+a_add+"', contact = '"+a_cont+"' WHERE acc_id = '"+a_id+"' ");
       
        }catch (Exception e){
            System.out.println(e);
        
        }
        
        JOptionPane.showMessageDialog(null, "Account Updated");
        accID.setText("");
        accName.setText("");
        accUser.setText("");
        accPass.setText("");
        accAdd.setText("");
        accCont.setText("");
        accSearchTable.setText("");
        tb_load();
    }//GEN-LAST:event_updateBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        String a_id = accID.getText();
        
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Delete this Account?","Delete", JOptionPane.YES_NO_OPTION);
        if (a == 0){
            try{
        
            Statement s = db.mycon().createStatement();
            s.executeUpdate(" DELETE FROM accounts WHERE acc_id = '"+a_id+"' ");
            JOptionPane.showMessageDialog(null, "Account Deleted");
       
        }catch (Exception e){
            System.out.println(e);
        }
        }
        
        accID.setText("");
        accName.setText("");
        accUser.setText("");
        accPass.setText("");
        accAdd.setText("");
        accCont.setText("");
        accSearchTable.setText("");
        tb_load();
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed
        
        accID.setText("");
        accName.setText("");
        accUser.setText("");
        accPass.setText("");
        accAdd.setText("");
        accCont.setText("");
        accSearchTable.setText("");
        tb_load();
    }//GEN-LAST:event_clearBTNActionPerformed

    private void accSearchTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accSearchTableKeyReleased
        String tableSearch = accSearchTable.getText();

        try{
            DefaultTableModel dt = (DefaultTableModel) accTable.getModel();
            dt.setRowCount(0);
            Statement s = db.mycon().createStatement();

            ResultSet rs = s.executeQuery(" SELECT * FROM accounts WHERE acc_name LIKE '%"+tableSearch+"%'");

            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));

                dt.addRow(v);

            }

        }catch  (SQLException e){
            tb_load();
        }
    }//GEN-LAST:event_accSearchTableKeyReleased

    private void accTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accTableMouseClicked
        int r = accTable.getSelectedRow();
        
        String id = accTable.getValueAt(r, 0).toString();
        String name = accTable.getValueAt(r, 1).toString();
        String user = accTable.getValueAt(r, 2).toString();
        String pass = accTable.getValueAt(r, 3).toString();
        String addr = accTable.getValueAt(r, 4).toString();
        String cont = accTable.getValueAt(r, 5).toString();
        
        accID.setText(id);
        accName.setText(name);
        accUser.setText(user);
        accPass.setText(pass);
        accAdd.setText(addr);
        accCont.setText(cont);
    }//GEN-LAST:event_accTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accAdd;
    private javax.swing.JTextField accCont;
    private javax.swing.JTextField accID;
    private javax.swing.JTextField accName;
    private javax.swing.JTextField accPass;
    private javax.swing.JTextField accSearchTable;
    private javax.swing.JTable accTable;
    private javax.swing.JTextField accUser;
    private javax.swing.JButton clearBTN;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveBTN;
    private javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables
}
