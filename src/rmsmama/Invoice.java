/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package rmsmama;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wang
 */
public class Invoice extends javax.swing.JPanel {

    /**
     * Creates new form Invoice
     */
    public Invoice() {
        initComponents();
        tb_load();
        totalInv();
        disableField();
    }
    
    public void tb_load(){
        try{
            DefaultTableModel dt = (DefaultTableModel) invTable.getModel();
            dt.setRowCount(0);
            
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM sales");
            
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
    
    public void searchINV(){
        String invID = invNum.getText();
        String stat = comStat.getSelectedItem().toString();
        
        try{
            DefaultTableModel dt = (DefaultTableModel) invTable.getModel();
            dt.setRowCount(0);
            
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM sales WHERE INID LIKE '%"+invID+"%' AND Status = '"+stat+"'");
            
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
        
        }catch(SQLException e){
            System.out.println(e);
            tb_load();
        }
        
}
    
    public void totalInv(){
    
    //overall total
        int numofrow = invTable.getRowCount();

            int total = 0;

                for (int i = 0; i < numofrow; i++){

                    int value = Integer.valueOf(invTable.getValueAt(i, 3).toString());
                    total += value;
                }

                totalSalesField.setText(Integer.toString(total));
    }
    
    public void disableField() {
        totalSalesField.setEnabled(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        invNum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comStat = new javax.swing.JComboBox<>();
        refreshBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        totalSalesField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        invTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 255, 204));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("INVOICE NO:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        invNum.setBackground(new java.awt.Color(204, 204, 204));
        invNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                invNumKeyReleased(evt);
            }
        });
        jPanel1.add(invNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 110, 32));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Status:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        comStat.setBackground(new java.awt.Color(204, 204, 204));
        comStat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unpaid", "Partial", "Paid", " " }));
        comStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comStatActionPerformed(evt);
            }
        });
        comStat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comStatKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comStatKeyReleased(evt);
            }
        });
        jPanel1.add(comStat, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 120, 32));

        refreshBTN.setBackground(new java.awt.Color(0, 204, 51));
        refreshBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        refreshBTN.setForeground(new java.awt.Color(255, 255, 255));
        refreshBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmsmama/icons/reset.png"))); // NOI18N
        refreshBTN.setText("Refresh");
        refreshBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBTNActionPerformed(evt);
            }
        });
        jPanel1.add(refreshBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 110, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Sales");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, -1));

        totalSalesField.setBackground(new java.awt.Color(0, 102, 102));
        totalSalesField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalSalesField.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(totalSalesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 150, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("???");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 150));

        invTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sales ID", "Invoice NO.", "Total QTY", "Total Bill", "Status", "Balance"
            }
        ));
        jScrollPane1.setViewportView(invTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1090, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void invNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_invNumKeyReleased
        searchINV();
    }//GEN-LAST:event_invNumKeyReleased

    private void comStatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comStatKeyReleased
        
    }//GEN-LAST:event_comStatKeyReleased

    private void comStatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comStatKeyPressed
        
    }//GEN-LAST:event_comStatKeyPressed

    private void comStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comStatActionPerformed
        searchINV();
    }//GEN-LAST:event_comStatActionPerformed

    private void refreshBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBTNActionPerformed
        tb_load();
    }//GEN-LAST:event_refreshBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comStat;
    private javax.swing.JTextField invNum;
    private javax.swing.JTable invTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshBTN;
    private javax.swing.JTextField totalSalesField;
    // End of variables declaration//GEN-END:variables
}
