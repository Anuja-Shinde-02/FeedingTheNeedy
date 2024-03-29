/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package userinterface.FCAdminRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author anujashinde
 */
public class ManagePantryItemsPanel extends javax.swing.JPanel {

    /** Creates new form ManageWHitemsPanel */
    JPanel userProcessContainer;
    UserAccount userAcc;
    EcoSystem ecosystem;
    public ManagePantryItemsPanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc =userAcc;
        setBG();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPaneFCP = new javax.swing.JSplitPane();
        FCControlPanel = new javax.swing.JPanel();
        btnAddPantryItems = new javax.swing.JButton();
        btnViewPantryItems = new javax.swing.JButton();
        FCWorkareaPanel = new javax.swing.JPanel();
        LabelImg = new javax.swing.JLabel();

        FCControlPanel.setBackground(new java.awt.Color(255, 255, 255));
        FCControlPanel.setPreferredSize(new java.awt.Dimension(150, 600));

        btnAddPantryItems.setBackground(new java.awt.Color(255, 93, 119));
        btnAddPantryItems.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnAddPantryItems.setText("Add Items");
        btnAddPantryItems.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddPantryItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPantryItemsActionPerformed(evt);
            }
        });

        btnViewPantryItems.setBackground(new java.awt.Color(255, 93, 119));
        btnViewPantryItems.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnViewPantryItems.setText("View & Update Items");
        btnViewPantryItems.setToolTipText("");
        btnViewPantryItems.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewPantryItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPantryItemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FCControlPanelLayout = new javax.swing.GroupLayout(FCControlPanel);
        FCControlPanel.setLayout(FCControlPanelLayout);
        FCControlPanelLayout.setHorizontalGroup(
            FCControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FCControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FCControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddPantryItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewPantryItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FCControlPanelLayout.setVerticalGroup(
            FCControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FCControlPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnAddPantryItems)
                .addGap(26, 26, 26)
                .addComponent(btnViewPantryItems, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(655, Short.MAX_VALUE))
        );

        SplitPaneFCP.setLeftComponent(FCControlPanel);

        FCWorkareaPanel.setPreferredSize(new java.awt.Dimension(840, 600));

        LabelImg.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout FCWorkareaPanelLayout = new javax.swing.GroupLayout(FCWorkareaPanel);
        FCWorkareaPanel.setLayout(FCWorkareaPanelLayout);
        FCWorkareaPanelLayout.setHorizontalGroup(
            FCWorkareaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FCWorkareaPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 1470, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        FCWorkareaPanelLayout.setVerticalGroup(
            FCWorkareaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        );

        SplitPaneFCP.setRightComponent(FCWorkareaPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneFCP, javax.swing.GroupLayout.DEFAULT_SIZE, 1651, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneFCP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setBG() {
        try {
            LabelImg.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/blurbg.jpeg"));

            Image newimg = img.getScaledInstance(1650, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
            LabelImg.setIcon(new ImageIcon(newimg));
            //IOException is the base class for thrown exceptions
        } catch (IOException ex) {
            Logger.getLogger(ManagePantryItemsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btnAddPantryItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPantryItemsActionPerformed
        // TODO add your handling code here:
       AddPantryItemsPanel objAddPI = new AddPantryItemsPanel(userProcessContainer, ecosystem,userAcc);
       //SplitPane is used to divide two components
       SplitPaneFCP.setRightComponent(objAddPI);
    }//GEN-LAST:event_btnAddPantryItemsActionPerformed

    private void btnViewPantryItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPantryItemsActionPerformed
        // TODO add your handling code here:
       ViewPantryItemsPanel objViewPI = new ViewPantryItemsPanel(userProcessContainer, ecosystem,userAcc);
       //SplitPane is used to divide two components
       SplitPaneFCP.setRightComponent(objViewPI);
    }//GEN-LAST:event_btnViewPantryItemsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FCControlPanel;
    private javax.swing.JPanel FCWorkareaPanel;
    private javax.swing.JLabel LabelImg;
    private javax.swing.JSplitPane SplitPaneFCP;
    private javax.swing.JButton btnAddPantryItems;
    private javax.swing.JButton btnViewPantryItems;
    // End of variables declaration//GEN-END:variables

}
