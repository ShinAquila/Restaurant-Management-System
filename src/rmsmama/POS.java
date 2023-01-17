/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rmsmama;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Wang
 */
public class POS extends javax.swing.JFrame {

    /**
     * Creates new form POS
     */
    public POS() {
        initComponents();
        this.setExtendedState(POS.MAXIMIZED_BOTH);
        tb_load();
    }
    
    public void tb_load(){
        try{
            Statement s = db.mycon().createStatement();
            
            ResultSet rs = s.executeQuery(" SELECT * FROM product");
            Vector v = new Vector();
            
            while (rs.next()){
                v.add(rs.getString("product_name"));
                
                DefaultComboBoxModel com = new DefaultComboBoxModel(v);
                com_prod.setModel (com);
            }
        
        }catch  (SQLException e){
            System.out.println(e);
        }
        
        
        //load last inv num
        try{
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM extra WHERE exID = 1");
            
            if (rs.next()){
                invoiceNumber.setText(rs.getString("val"));
            
            }
            
            
        }catch  (SQLException e){
            System.out.println(e);
        }  
        
        int i = Integer.valueOf(invoiceNumber.getText());
        i++;
        invoiceNumber.setText(String.valueOf(i));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        prodPrice = new javax.swing.JTextField();
        toHome = new javax.swing.JButton();
        com_prod = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        invoiceNumber = new javax.swing.JLabel();
        spinQuan = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        buytable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        billField = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        receiptTotalField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        paymentField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        balanceField = new javax.swing.JTextField();
        billBTN = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        addItemBTN = new javax.swing.JButton();
        removeItem = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        totalQtyField = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        invField = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1360, 710));
        setSize(new java.awt.Dimension(1360, 710));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Quantity");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Total");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, 30));

        totalField.setBackground(new java.awt.Color(102, 255, 102));
        totalField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        totalField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        totalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFieldActionPerformed(evt);
            }
        });
        jPanel1.add(totalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 170, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Product");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Price");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, -1, -1));

        prodPrice.setBackground(new java.awt.Color(204, 204, 204));
        prodPrice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(prodPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 170, 50));

        toHome.setBackground(new java.awt.Color(0, 51, 255));
        toHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        toHome.setForeground(new java.awt.Color(255, 255, 255));
        toHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmsmama/icons/home1.png"))); // NOI18N
        toHome.setText("HOME");
        toHome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        toHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toHomeActionPerformed(evt);
            }
        });
        jPanel1.add(toHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 40));

        com_prod.setBackground(new java.awt.Color(0, 204, 102));
        com_prod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        com_prod.setForeground(new java.awt.Color(255, 255, 255));
        com_prod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        com_prod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        com_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_prodActionPerformed(evt);
            }
        });
        jPanel1.add(com_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 220, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("INVOICE NO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        invoiceNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        invoiceNumber.setText("1");
        jPanel1.add(invoiceNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 90, -1));

        spinQuan.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        spinQuan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        spinQuan.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinQuanStateChanged(evt);
            }
        });
        jPanel1.add(spinQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 120, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmsmama/pics/bg3.png"))); // NOI18N
        jLabel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 830, 220));

        buytable.setBackground(new java.awt.Color(204, 204, 204));
        buytable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        buytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IN ID", "Product Name", "Quantity", "Price", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(buytable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 830, 270));

        billField.setColumns(20);
        billField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        billField.setRows(5);
        billField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane2.setViewportView(billField);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 190, 350, 330));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Overall Total");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("₱");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, 10, 40));

        receiptTotalField.setBackground(new java.awt.Color(204, 204, 204));
        receiptTotalField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        receiptTotalField.setText("0");
        receiptTotalField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        receiptTotalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptTotalFieldActionPerformed(evt);
            }
        });
        getContentPane().add(receiptTotalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 620, 164, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Payment");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("₱");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 620, 10, 40));

        paymentField.setBackground(new java.awt.Color(0, 0, 0));
        paymentField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        paymentField.setForeground(new java.awt.Color(255, 153, 0));
        paymentField.setText("0");
        paymentField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paymentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentFieldActionPerformed(evt);
            }
        });
        paymentField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paymentFieldKeyReleased(evt);
            }
        });
        getContentPane().add(paymentField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, 164, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Balance");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 600, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("₱");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 620, 10, 40));

        balanceField.setBackground(new java.awt.Color(102, 255, 51));
        balanceField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        balanceField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        balanceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceFieldActionPerformed(evt);
            }
        });
        getContentPane().add(balanceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 620, 164, 40));

        billBTN.setBackground(new java.awt.Color(0, 204, 204));
        billBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        billBTN.setForeground(new java.awt.Color(255, 255, 255));
        billBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmsmama/icons/invoice.png"))); // NOI18N
        billBTN.setText("Bill");
        billBTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        billBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billBTNActionPerformed(evt);
            }
        });
        getContentPane().add(billBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 80, 130, 40));

        Reset.setBackground(new java.awt.Color(204, 0, 0));
        Reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 255, 255));
        Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmsmama/icons/reset.png"))); // NOI18N
        Reset.setText("Reset");
        Reset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 80, 130, 40));

        addItemBTN.setBackground(new java.awt.Color(0, 204, 0));
        addItemBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addItemBTN.setForeground(new java.awt.Color(255, 255, 255));
        addItemBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmsmama/icons/add.png"))); // NOI18N
        addItemBTN.setText("Add Item");
        addItemBTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addItemBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemBTNActionPerformed(evt);
            }
        });
        getContentPane().add(addItemBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, 130, 40));

        removeItem.setBackground(new java.awt.Color(255, 102, 102));
        removeItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        removeItem.setForeground(new java.awt.Color(255, 255, 255));
        removeItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmsmama/icons/delete.png"))); // NOI18N
        removeItem.setText("Remove Item");
        removeItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemActionPerformed(evt);
            }
        });
        getContentPane().add(removeItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, 130, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("TOTAL QTY:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, -1, -1));

        totalQtyField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalQtyField.setText("00");
        getContentPane().add(totalQtyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 90, -1));

        invField.setColumns(20);
        invField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        invField.setRows(5);
        invField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane3.setViewportView(invField);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(994, 546, 260, 140));

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmsmama/icons/print.png"))); // NOI18N
        jButton1.setText("Print");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 130, 130, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmsmama/pics/bg2.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toHomeActionPerformed
        AdminDashboard ad = new AdminDashboard();
                    ad.setVisible(true);
                    
                    this.setVisible(false);
    }//GEN-LAST:event_toHomeActionPerformed

    public void overallTotal(){
    
        int payment = Integer.valueOf(paymentField.getText());
        int tot = Integer.valueOf(receiptTotalField.getText());
        int bal;
        
        bal = payment - tot;
        
        balanceField.setText(String.valueOf(bal));
    
    
    }
    
    
    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        POS p = new POS();
                    p.setVisible(true);
                    
                    this.setVisible(false);
    }//GEN-LAST:event_ResetActionPerformed

    public void totalOrder(){
    
    //overall total
        int numofrow = buytable.getRowCount();

            int total = 0;

                for (int i = 0; i < numofrow; i++){

                    int value = Integer.valueOf(buytable.getValueAt(i, 4).toString());
                    total += value;
                }

                receiptTotalField.setText(Integer.toString(total));
        
                
    //total qty
        int numofrows = buytable.getRowCount();
    
        int totals = 0;
        
            for (int i = 0; i < numofrow; i++){
            
                int values = Integer.valueOf(buytable.getValueAt(i, 2).toString());
                totals += values;
            }
        
            totalQtyField.setText(Integer.toString(totals));
    
    
    
    
    }
    private void totalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalFieldActionPerformed

    public void Balance()
    {
        int RecTotal = Integer.parseInt(receiptTotalField.getText());
        int payMent = Integer.parseInt(paymentField.getText());
        
        int balAnce = payMent - RecTotal;
                
        balanceField.setText(String.valueOf(balAnce));
    }
    
    public void invoicePaper(){
    
        String invNum = invoiceNumber.getText();
        
        invField.setText(invField.getText() + "***********************************************" + "\n");
        invField.setText(invField.getText() + "*************INVOICE NUMBER*************" + "\n");
        invField.setText(invField.getText() + "***********************************************" + "\n");
        
        invField.setText(invField.getText() + "\n");
        invField.setText(invField.getText() + "INVOICE NO: " + invNum + "\n");
        invField.setText(invField.getText() + "\n");
        
        invField.setText(invField.getText() + "***********************************************" + "\n");
        invField.setText(invField.getText() + "***********************************************" + "\n");
    
    }
    
    public void Bill()
    {
        String RecTotal = receiptTotalField.getText();
        String payMent = paymentField.getText();
        String balAnce = balanceField.getText();
        String invNum = invoiceNumber.getText();
        
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel)buytable.getModel();
        
        
        
        billField.setText(billField.getText() + "*****************************************************************\n");
        billField.setText(billField.getText() + "**--------------------------RECEIPT--------------------------**\n");
        billField.setText(billField.getText() + "*****************************************************************\n");
        
        billField.setText(billField.getText() + "\n");
        billField.setText(billField.getText() + "\n");
        billField.setText(billField.getText() + "INVOICE NO: " + invNum + "\n");
        billField.setText(billField.getText() + "\n");
        billField.setText(billField.getText() + "\n");
        
        
        billField.setText(billField.getText() + "Product" + "\n");
        billField.setText(billField.getText() + "_______" + "\n");
    
        for(int i = 0; i < model.getRowCount(); i++)
        {
            String nameProd = (String)model.getValueAt(i, 1);
            
            billField.setText(billField.getText() + nameProd + "\n");
        }
        
        billField.setText(billField.getText() + "----------------------------------------");
        billField.setText(billField.getText() + "\n");
        billField.setText(billField.getText() + "Quantity" + "\t" + "Price" + "\t" + "Amount" + "\n");
        billField.setText(billField.getText() + "__________" + "\t" + "________" + "\t" + "__________" + "\n");
        
        for(int i = 0; i < model.getRowCount(); i++)
        {
            String quanProd = (String)model.getValueAt(i, 2);
            String priProd = (String)model.getValueAt(i, 3);
            String amountProd = (String)model.getValueAt(i, 4);
            
            billField.setText(billField.getText() + quanProd + "\t" + priProd + "\t" + amountProd + "\n");
        }
        
        
        billField.setText(billField.getText() + "\n");
        billField.setText(billField.getText() + "\n");
        
        billField.setText(billField.getText() + "\t" + "Overall Total: " + RecTotal + "\n");
        billField.setText(billField.getText() + "\t" + "Payment: " + payMent + "\n");
        billField.setText(billField.getText() + "\t" + "Balance: " + balAnce + "\n");
        
        billField.setText(billField.getText() + "\n");
        billField.setText(billField.getText() + "\n");
        billField.setText(billField.getText() + "*****************************************************************\n");
        billField.setText(billField.getText() + "*****************************************************************\n");
        
    }
    
    
  
    private void addItemBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemBTNActionPerformed
        DefaultTableModel dt = (DefaultTableModel) buytable.getModel();
        Vector v = new Vector ();
        
        v.add(invoiceNumber.getText());
        v.add(com_prod.getSelectedItem().toString());
        v.add(spinQuan.getValue().toString());
        v.add(prodPrice.getText());
        v.add(totalField.getText());
        
        dt.addRow(v);
        
        totalOrder();
        overallTotal();
        
    }//GEN-LAST:event_addItemBTNActionPerformed

    private void com_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_prodActionPerformed
        String name = com_prod.getSelectedItem().toString();
        
        try{
        
        Statement s = db.mycon().createStatement();
        ResultSet rs = s.executeQuery(" SELECT (price) FROM product WHERE product_name = '"+name+"' ");
        
        if (rs.next()){
            prodPrice.setText(rs.getString("price"));
        }
        
        int qty = Integer.valueOf(spinQuan.getValue().toString());
        int price = Integer.valueOf(prodPrice.getText());
        int tot;
        
        tot = qty * price;
        totalField.setText(String.valueOf(tot));
        
        }catch  (SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_com_prodActionPerformed

    private void billBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billBTNActionPerformed
        Balance();
        Bill();
        invoicePaper();
        
        try{
        
            //cart DB
        
            DefaultTableModel dt = (DefaultTableModel) buytable.getModel();
            int rc = dt.getRowCount();
            
                for (int i = 0; i < rc; i++) {
                
                    String inid = dt.getValueAt (i, 0).toString();
                    String prodname = dt.getValueAt (i, 1).toString();
                    String qty = dt.getValueAt (i, 2).toString();
                    String unitPrice = dt.getValueAt (i, 3).toString();
                    String amount = dt.getValueAt (i, 4).toString();
                    
                    //cart DB
                    Statement s = db.mycon().createStatement();
                    s.executeUpdate("INSERT INTO cart (INID, product_name, qty, unitPrice, amount) VALUES ('"+inid+"','"+prodname+"','"+qty+"','"+unitPrice+"','"+amount+"') ");
                    
                       
                }
            
                
        
        }catch (HeadlessException | SQLException e){
            System.out.println(e);
        }
        
        try{
        
        //sales DB
        
            String inv = invoiceNumber.getText();
            String totQTY = totalQtyField.getText();
            String totBill = receiptTotalField.getText();
            String bal = balanceField.getText();
            
            
                //paid check
                int tot = Integer.valueOf(receiptTotalField.getText());
                int payamnt = Integer.valueOf(paymentField.getText());
                String stat = null;
                if (payamnt == 0) {

                    stat = "Unpaid";

                }else if (tot > payamnt) {

                    stat = "Partial";

                }else if (tot <= payamnt) {

                    stat = "Paid";

                }

                Statement ss = db.mycon().createStatement();
                ss.executeUpdate("INSERT INTO sales (INID, totalQTY, totalBill, Status, balance) VALUES ('"+inv+"','"+totQTY+"','"+totBill+"','"+stat+"','"+bal+"') ");
             
        }catch (NumberFormatException | SQLException e){
            System.out.println(e);
        }
        
        
        try{
            String id = invoiceNumber.getText();
            
            Statement s = db.mycon().createStatement();
            s.executeUpdate("UPDATE extra SET val='"+id+"' WHERE exID = 1 ");
            
        
        }catch (SQLException e){
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_billBTNActionPerformed

    private void balanceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balanceFieldActionPerformed

    private void receiptTotalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptTotalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receiptTotalFieldActionPerformed

    private void paymentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentFieldActionPerformed

    private void removeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemActionPerformed
        try{
            
            DefaultTableModel dt = (DefaultTableModel) buytable.getModel();
            int rw = buytable.getSelectedRow();

            dt.removeRow(rw);
        
        }catch  (Exception e){
            System.out.println(e);
        }
        
        totalOrder();
        overallTotal();
    }//GEN-LAST:event_removeItemActionPerformed

    private void paymentFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paymentFieldKeyReleased
        overallTotal();
    }//GEN-LAST:event_paymentFieldKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            billField.print();
        } catch (PrinterException ex) {
            Logger.getLogger(POS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            invField.print();
        } catch (PrinterException ex) {
            Logger.getLogger(POS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void spinQuanStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinQuanStateChanged
        int qty = Integer.valueOf(spinQuan.getValue().toString());
        int price = Integer.valueOf(prodPrice.getText());
        int tot;
        
        tot = qty * price;
        totalField.setText(String.valueOf(tot));
    }//GEN-LAST:event_spinQuanStateChanged

    
    
    
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
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JButton addItemBTN;
    private javax.swing.JTextField balanceField;
    private javax.swing.JButton billBTN;
    private javax.swing.JTextArea billField;
    private javax.swing.JTable buytable;
    private javax.swing.JComboBox<String> com_prod;
    private javax.swing.JTextArea invField;
    private javax.swing.JLabel invoiceNumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField paymentField;
    private javax.swing.JTextField prodPrice;
    private javax.swing.JTextField receiptTotalField;
    private javax.swing.JButton removeItem;
    private javax.swing.JSpinner spinQuan;
    private javax.swing.JButton toHome;
    private javax.swing.JTextField totalField;
    private javax.swing.JLabel totalQtyField;
    // End of variables declaration//GEN-END:variables

    

}
