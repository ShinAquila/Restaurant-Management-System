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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wang
 */
public class ManageProduct extends javax.swing.JPanel {

    /**
     * Creates new form mngeProduct
     */
    public ManageProduct() {
        initComponents();
        tb_load();
        disableField();
    }

    public void tb_load(){
        try{
            DefaultTableModel dt = (DefaultTableModel) productTable.getModel();
            dt.setRowCount(0);
            
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM product");
            
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                
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
        productSearchTable = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        product_Category = new javax.swing.JTextField();
        product_Name = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        saveBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        product_ID = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        product_Price = new javax.swing.JTextField();
        clearBTN = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Product Info:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));

        productSearchTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        productSearchTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productSearchTableKeyReleased(evt);
            }
        });
        jPanel1.add(productSearchTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 205, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Search:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 17, 330, 110));

        productTable.setBackground(new java.awt.Color(204, 204, 204));
        productTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null, ""},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Price", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 74, 730, 450));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Name:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 67, -1, -1));
        jPanel4.add(product_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 147, 190, -1));
        jPanel4.add(product_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 67, 190, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Category:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 147, -1, -1));

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
        jPanel4.add(saveBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 90, -1));

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
        jPanel4.add(deleteBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

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
        jPanel4.add(updateBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("ID:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 27, -1, -1));
        jPanel4.add(product_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 27, 190, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Price:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        jPanel4.add(product_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 107, 190, -1));

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
        jPanel4.add(clearBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, -1));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 141, 330, 380));
    }// </editor-fold>//GEN-END:initComponents

    public void disableField() {
        product_ID.setEnabled(false);
    }
    
    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed
        
        String p_name = product_Name.getText();
        String p_price = product_Price.getText();
        String p_categ = product_Category.getText();
        
        try{
        
            Statement s = db.mycon().createStatement();
            s.executeUpdate(" INSERT INTO product (product_name,price,category_fk) VALUES ('"+p_name+"','"+p_price+"','"+p_categ+"') ");
       
        }catch (Exception e){
            System.out.println(e);
        }
        
        JOptionPane.showMessageDialog(null, "Product Saved");
        product_ID.setText("");
        product_Name.setText("");
        product_Price.setText("");
        product_Category.setText("");
        productSearchTable.setText("");
        
        tb_load();
    }//GEN-LAST:event_saveBTNActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        
        String p_id = product_ID.getText();
        String p_name = product_Name.getText();
        String p_price = product_Price.getText();
        String p_categ = product_Category.getText();
        
        try{
            
        
            Statement s = db.mycon().createStatement();
            s.executeUpdate(" UPDATE product SET product_name = '"+p_name+"', price = '"+p_price+"', category_fk = '"+p_categ+"' WHERE product_id = '"+p_id+"' ");
       
        }catch (Exception e){
            System.out.println(e);
        
        }
        
        JOptionPane.showMessageDialog(null, "Product Updated");
        product_ID.setText("");
        product_Name.setText("");
        product_Price.setText("");
        product_Category.setText("");
        productSearchTable.setText("");
        tb_load();
    }//GEN-LAST:event_updateBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        String p_id = product_ID.getText();

            int a = JOptionPane.showConfirmDialog(null, "Do you really want to Delete this Product?","Delete", JOptionPane.YES_NO_OPTION);
            if (a == 0){

            try{

            Statement s = db.mycon().createStatement();
            s.executeUpdate(" DELETE FROM product WHERE product_id = '"+p_id+"' ");
            JOptionPane.showMessageDialog(null, "Product Deleted");

            }catch (Exception e){
                System.out.println(e);
                }       
            }
        
        product_ID.setText("");
        product_Name.setText("");
        product_Price.setText("");
        product_Category.setText("");
        productSearchTable.setText("");
        
        tb_load();
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed
        
        product_ID.setText("");
        product_Name.setText("");
        product_Price.setText("");
        product_Category.setText("");
        productSearchTable.setText("");
        tb_load();
    }//GEN-LAST:event_clearBTNActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        int r = productTable.getSelectedRow();
        
        String id = productTable.getValueAt(r, 0).toString();
        String name = productTable.getValueAt(r, 1).toString();
        String price = productTable.getValueAt(r, 2).toString();
        String category = productTable.getValueAt(r, 3).toString();
        
        product_ID.setText(id);
        product_Name.setText(name);
        product_Price.setText(price);
        product_Category.setText(category);
        
    }//GEN-LAST:event_productTableMouseClicked

    private void productSearchTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productSearchTableKeyReleased
    String tableSearch = productSearchTable.getText();
        
        try{
            DefaultTableModel dt = (DefaultTableModel) productTable.getModel();
            dt.setRowCount(0);
            Statement s = db.mycon().createStatement();
            
            ResultSet rs = s.executeQuery(" SELECT * FROM product WHERE product_name LIKE '%"+tableSearch+"%'");
            
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                
                dt.addRow(v);
                
            }
        
        
        }catch  (SQLException e){
            tb_load();
        }
    }//GEN-LAST:event_productSearchTableKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBTN;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField productSearchTable;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField product_Category;
    private javax.swing.JTextField product_ID;
    private javax.swing.JTextField product_Name;
    private javax.swing.JTextField product_Price;
    private javax.swing.JButton saveBTN;
    private javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables
}
