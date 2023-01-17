/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package rmsmama;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wang
 */
public class ManageCategory extends javax.swing.JPanel {

    /**
     * Creates new form mngeCategory
     */
    public ManageCategory() {
        initComponents();
        tb_load();
        disableField();
    }

    public void tb_load(){
        try{
            DefaultTableModel dt = (DefaultTableModel) categoryTable.getModel();
            dt.setRowCount(0);
            
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM category");
            
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                
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
        jLabel4 = new javax.swing.JLabel();
        categorySearchTable = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        categName = new javax.swing.JTextField();
        saveBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        categID = new javax.swing.JTextField();
        clearBTN = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Category Info:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Search:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        categorySearchTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        categorySearchTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                categorySearchTableKeyReleased(evt);
            }
        });
        jPanel1.add(categorySearchTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 205, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 17, 330, 110));

        categoryTable.setBackground(new java.awt.Color(204, 204, 204));
        categoryTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        categoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, ""},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        categoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(categoryTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 74, 730, 450));

        jPanel2.setBackground(new java.awt.Color(255, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Name:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 67, -1, -1));
        jPanel2.add(categName, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 67, 190, -1));

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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("ID:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 27, -1, -1));
        jPanel2.add(categID, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 27, 190, -1));

        clearBTN.setBackground(new java.awt.Color(255, 102, 102));
        clearBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clearBTN.setForeground(new java.awt.Color(255, 255, 255));
        clearBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmsmama/icons/clear.png"))); // NOI18N
        clearBTN.setText("Reset");
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });
        jPanel2.add(clearBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 141, 330, 380));
    }// </editor-fold>//GEN-END:initComponents

    public void disableField() {
        categID.setEnabled(false);
    }
    
    
    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed
        
        String c_name = categName.getText();
        
        try{
        
            Statement s = db.mycon().createStatement();
            s.executeUpdate(" INSERT INTO category (category_name) VALUES ('"+c_name+"') ");
       
        }catch (Exception e){
            System.out.println(e);
        }
        
        JOptionPane.showMessageDialog(null, "Category Saved");
        categID.setText("");
        categName.setText("");
        categorySearchTable.setText("");
        tb_load();
    }//GEN-LAST:event_saveBTNActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        String c_id = categID.getText();
        String c_name = categName.getText();
        
        try{
            
        
            Statement s = db.mycon().createStatement();
            s.executeUpdate(" UPDATE category SET category_name = '"+c_name+"' WHERE category_id = '"+c_id+"' ");
       
        }catch (Exception e){
            System.out.println(e);
        
        }
        
        JOptionPane.showMessageDialog(null, "Category Updated");
        categID.setText("");
        categName.setText("");
        categorySearchTable.setText("");
        tb_load();
    }//GEN-LAST:event_updateBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        String c_id = categID.getText();
        
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Delete this Category?","Delete", JOptionPane.YES_NO_OPTION);
        if (a == 0){
            try{
        
            Statement s = db.mycon().createStatement();
            s.executeUpdate(" DELETE FROM category WHERE category_id = '"+c_id+"' ");
            JOptionPane.showMessageDialog(null, "Category Deleted");
       
        }catch (Exception e){
            System.out.println(e);
        }
        }
        
        categID.setText("");
        categName.setText("");
        categorySearchTable.setText("");
        tb_load();
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed
        
        categID.setText("");
        categName.setText("");
        categorySearchTable.setText("");
        tb_load();
    }//GEN-LAST:event_clearBTNActionPerformed

    private void categorySearchTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categorySearchTableKeyReleased
        String tableSearch = categorySearchTable.getText();

        try{
            DefaultTableModel dt = (DefaultTableModel) categoryTable.getModel();
            dt.setRowCount(0);
            Statement s = db.mycon().createStatement();

            ResultSet rs = s.executeQuery(" SELECT * FROM category WHERE category_name LIKE '%"+tableSearch+"%'");

            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));

                dt.addRow(v);

            }

        }catch  (SQLException e){
            tb_load();
        }
    }//GEN-LAST:event_categorySearchTableKeyReleased

    private void categoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryTableMouseClicked
        int r = categoryTable.getSelectedRow();
        
        String id = categoryTable.getValueAt(r, 0).toString();
        String name = categoryTable.getValueAt(r, 1).toString();
        
        categID.setText(id);
        categName.setText(name);
    }//GEN-LAST:event_categoryTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField categID;
    private javax.swing.JTextField categName;
    private javax.swing.JTextField categorySearchTable;
    private javax.swing.JTable categoryTable;
    private javax.swing.JButton clearBTN;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveBTN;
    private javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables
}
