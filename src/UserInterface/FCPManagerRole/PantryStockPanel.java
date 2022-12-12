/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.FCPManagerRole;

import Business.EcoSystem;
import Business.FCPantry.FCPantryItems;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anujashinde
 */
public class PantryStockPanel extends javax.swing.JPanel {

    /**
     * Creates new form PantryStockPanel
     */
    JPanel userProcessContainer;
    UserAccount userAcc;
    EcoSystem ecosystem;
    public PantryStockPanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc = userAcc;
        populatePantryItemsTable();
         lblPantryReqQty.setVisible(false);
         lblPersons.setVisible(false);
         comboQty.setVisible(false);
         btnSubmitReq.setVisible(false);
         chkStockFromWarehouse.setVisible(false);
         setBG();
         makeTableTransparent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPantryStockTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPantryStockItems = new javax.swing.JTable();
        btnSubmitReq = new javax.swing.JButton();
        lblPantryReqQty = new javax.swing.JLabel();
        comboQty = new javax.swing.JComboBox<>();
        chkStockFromWarehouse = new javax.swing.JCheckBox();
        lblPersons = new javax.swing.JLabel();
        LabelImg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPantryStockTitle.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        lblPantryStockTitle.setForeground(new java.awt.Color(255, 93, 119));
        lblPantryStockTitle.setText("! Available Pantry Stock !");
        add(lblPantryStockTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        tblPantryStockItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Id", "Food Item", "Item Quantity"
            }
        ));
        tblPantryStockItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPantryStockItemsMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblPantryStockItems);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1008, 153));

        btnSubmitReq.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        btnSubmitReq.setText("Submit Request");
        btnSubmitReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitReqActionPerformed(evt);
            }
        });
        add(btnSubmitReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 150, 30));

        lblPantryReqQty.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        lblPantryReqQty.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPantryReqQty.setText("Quantity Required for:");
        add(lblPantryReqQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 190, 30));

        comboQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "50", "100", "150", "200", "250" }));
        add(comboQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 160, 30));

        chkStockFromWarehouse.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        chkStockFromWarehouse.setText("Request stock from Warehouse");
        chkStockFromWarehouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkStockFromWarehouseActionPerformed(evt);
            }
        });
        add(chkStockFromWarehouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        lblPersons.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        lblPersons.setText("Persons");
        add(lblPersons, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 60, 30));
        add(LabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 690));
    }// </editor-fold>//GEN-END:initComponents

    
       public void setBG() {
        try {
            LabelImg.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/blurbg.jpeg"));

            Image newimg = img.getScaledInstance(1500, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
            LabelImg.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {

        }
    }

    public void makeTableTransparent() {
        tblPantryStockItems.setOpaque(false);
        ((DefaultTableCellRenderer) tblPantryStockItems.getDefaultRenderer(Object.class)).setOpaque(false);
        tblPantryStockItems.setShowGrid(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);

        for (int i = 0; i < tblPantryStockItems.getModel().getColumnCount(); i++) {
            tblPantryStockItems.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }
    
    private void chkStockFromWarehouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkStockFromWarehouseActionPerformed
        // TODO add your handling code here:
        if(chkStockFromWarehouse.isSelected()){
            //setVisible(true)makes the frame appear on the screen
            
            lblPantryReqQty.setVisible(true);
            lblPersons.setVisible(true);
            comboQty.setVisible(true);
            btnSubmitReq.setVisible(true);
        }
        else{
            //setVisible(false)makes the frame invisible on the screen
            lblPantryReqQty.setVisible(false);
            lblPersons.setVisible(false);
            comboQty.setVisible(false);
            btnSubmitReq.setVisible(false);
        }
    }//GEN-LAST:event_chkStockFromWarehouseActionPerformed

    private void btnSubmitReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitReqActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "Your request has been sent to Warehouse");
    }//GEN-LAST:event_btnSubmitReqActionPerformed

    private void tblPantryStockItemsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPantryStockItemsMousePressed
        // TODO add your handling code here:
        tblPantryStockItems.setSelectionForeground(Color.BLUE);
    }//GEN-LAST:event_tblPantryStockItemsMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImg;
    private javax.swing.JButton btnSubmitReq;
    private javax.swing.JCheckBox chkStockFromWarehouse;
    private javax.swing.JComboBox<String> comboQty;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPantryReqQty;
    private javax.swing.JLabel lblPantryStockTitle;
    private javax.swing.JLabel lblPersons;
    private javax.swing.JTable tblPantryStockItems;
    // End of variables declaration//GEN-END:variables

    private void populatePantryItemsTable() {
        DefaultTableModel model = (DefaultTableModel) tblPantryStockItems.getModel();
        model.setRowCount(0);
        for(FCPantryItems fcpi: ecosystem.getFCPIDirectory().getFcpiList()){
            if(fcpi.getPantryManager().equals(userAcc.getEmployee().getName())){
           Object[] row = new Object[3];
           row[0] =fcpi;
           row[1] =fcpi.getFoodItem();
           row[2] =fcpi.getFoodQuan();
           model.addRow(row);
            }
        } 
    }
}
