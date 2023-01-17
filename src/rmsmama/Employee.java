/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package rmsmama;


import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wang
 */
public class Employee extends javax.swing.JPanel {

    /**
     * Creates new form 
     */
    public Employee() {
        initComponents();
        tb_load();
        disableField();
        
    }

    public void tb_load(){
        try{
            DefaultTableModel dt = (DefaultTableModel) employeeTable.getModel();
            dt.setRowCount(0);
            
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM employee");
            
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                
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
        jLabel5 = new javax.swing.JLabel();
        employeeSearchTable = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        employee_Contact = new javax.swing.JTextField();
        employee_Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        saveBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        employee_Position = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        employee_ID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        employee_Address = new javax.swing.JTextField();
        clearBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Employee Info:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Search:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        employeeSearchTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        employeeSearchTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                employeeSearchTableKeyReleased(evt);
            }
        });
        jPanel1.add(employeeSearchTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 205, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 17, 330, 110));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Name:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 67, -1, -1));
        jPanel2.add(employee_Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 147, 190, -1));
        jPanel2.add(employee_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 67, 190, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Contact:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

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
        jPanel2.add(employee_Position, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 187, 190, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Position:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("ID:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 27, -1, -1));
        jPanel2.add(employee_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 27, 190, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Address:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jPanel2.add(employee_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 107, 190, -1));

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

        employeeTable.setBackground(new java.awt.Color(204, 204, 204));
        employeeTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", "", "", null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Address", "Contact", "Position"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeeTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 74, 730, 450));
    }// </editor-fold>//GEN-END:initComponents

    public void disableField() {
        employee_ID.setEnabled(false);
    }
    
    
    
    
    
    
    
    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed
        String e_name = employee_Name.getText();
        String e_Add = employee_Address.getText();
        String e_Cont = employee_Contact.getText();
        String e_Posi = employee_Position.getText();
        
        try{
            Statement s = db.mycon().createStatement();
            s.executeUpdate(" INSERT INTO employee (employee_name,employee_address,employee_contact,position_fk) VALUES ('"+e_name+"','"+e_Add+"','"+e_Cont+"','"+e_Posi+"') ");
        }catch (Exception e){
            System.out.println(e);
        }
        
        JOptionPane.showMessageDialog(null, "Employee Saved");
        employee_ID.setText("");
        employee_Name.setText("");
        employee_Address.setText("");
        employee_Contact.setText("");
        employee_Position.setText("");
        employeeSearchTable.setText("");
        tb_load();
    }//GEN-LAST:event_saveBTNActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        String e_id = employee_ID.getText();
        String e_name = employee_Name.getText();
        String e_Add = employee_Address.getText();
        String e_Cont = employee_Contact.getText();
        String e_Posi = employee_Position.getText();
        
        try{
            
        
            Statement s = db.mycon().createStatement();
            s.executeUpdate(" UPDATE employee SET employee_name = '"+e_name+"', employee_address = '"+e_Add+"', employee_contact = '"+e_Cont+"', position_fk = '"+e_Posi+"' WHERE employee_id = '"+e_id+"' ");
       
        }catch (Exception e){
            System.out.println(e);
        
        }
        
        JOptionPane.showMessageDialog(null, "Employee Updated");
        employee_ID.setText("");
        employee_Name.setText("");
        employee_Address.setText("");
        employee_Contact.setText("");
        employee_Position.setText("");
        employeeSearchTable.setText("");
        tb_load();
        
        
    }//GEN-LAST:event_updateBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        String e_id = employee_ID.getText();
        
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Delete this Employee?","Delete", JOptionPane.YES_NO_OPTION);
        if (a == 0){
            try{
        
            Statement s = db.mycon().createStatement();
            s.executeUpdate(" DELETE FROM employee WHERE employee_id = '"+e_id+"' ");
            JOptionPane.showMessageDialog(null, "Employee Deleted");
       
        }catch (Exception e){
            System.out.println(e);
        }
        }
        
        employee_ID.setText("");
        employee_Name.setText("");
        employee_Address.setText("");
        employee_Contact.setText("");
        employee_Position.setText("");
        employeeSearchTable.setText("");
        tb_load();
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed
        
        employee_ID.setText("");
        employee_Name.setText("");
        employee_Address.setText("");
        employee_Contact.setText("");
        employee_Position.setText("");
        employeeSearchTable.setText("");
        tb_load();
    }//GEN-LAST:event_clearBTNActionPerformed

    private void employeeSearchTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeeSearchTableKeyReleased
        String tableSearch = employeeSearchTable.getText();

        try{
            DefaultTableModel dt = (DefaultTableModel) employeeTable.getModel();
            dt.setRowCount(0);
            Statement s = db.mycon().createStatement();

            ResultSet rs = s.executeQuery(" SELECT * FROM employee WHERE employee_name LIKE '%"+tableSearch+"%'");

            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));

                dt.addRow(v);

            }

        }catch  (SQLException e){
            tb_load();
        }
    }//GEN-LAST:event_employeeSearchTableKeyReleased

    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
        int r = employeeTable.getSelectedRow();
        
        String id = employeeTable.getValueAt(r, 0).toString();
        String name = employeeTable.getValueAt(r, 1).toString();
        String addr = employeeTable.getValueAt(r, 2).toString();
        String cont = employeeTable.getValueAt(r, 3).toString();
        String posit = employeeTable.getValueAt(r, 4).toString();
        
        employee_ID.setText(id);
        employee_Name.setText(name);
        employee_Address.setText(addr);
        employee_Contact.setText(cont);
        employee_Position.setText(posit);
    }//GEN-LAST:event_employeeTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBTN;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JTextField employeeSearchTable;
    private javax.swing.JTable employeeTable;
    private javax.swing.JTextField employee_Address;
    private javax.swing.JTextField employee_Contact;
    private javax.swing.JTextField employee_ID;
    private javax.swing.JTextField employee_Name;
    private javax.swing.JTextField employee_Position;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveBTN;
    private javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables
}
