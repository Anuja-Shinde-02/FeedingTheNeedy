/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package userinterface.FoodAdminRole;

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
import userinterface.SystemAdminWorkArea.ViewModifyPantryPanel;

/**
 *
 * @author anujashinde
 */
public class ManageFoodPantryItemsPanel extends javax.swing.JPanel {

    /** Creates new form ManageWHitemsPanel */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    public ManageFoodPantryItemsPanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAcc) {
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
        btnAddItems = new javax.swing.JButton();
        btnViewItems = new javax.swing.JButton();
        FCWorkareaPanel = new javax.swing.JPanel();
        LabelImg = new javax.swing.JLabel();

        FCControlPanel.setBackground(new java.awt.Color(255, 255, 255));
        FCControlPanel.setPreferredSize(new java.awt.Dimension(150, 600));

        btnAddItems.setBackground(new java.awt.Color(105, 158, 208));
        btnAddItems.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAddItems.setText("Add Items");
        btnAddItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemsActionPerformed(evt);
            }
        });

        btnViewItems.setBackground(new java.awt.Color(105, 158, 208));
        btnViewItems.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnViewItems.setText("View/Update Items");
        btnViewItems.setToolTipText("");
        btnViewItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewItemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FCControlPanelLayout = new javax.swing.GroupLayout(FCControlPanel);
        FCControlPanel.setLayout(FCControlPanelLayout);
        FCControlPanelLayout.setHorizontalGroup(
            FCControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FCControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FCControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewItems, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddItems, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FCControlPanelLayout.setVerticalGroup(
            FCControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FCControlPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnAddItems)
                .addGap(26, 26, 26)
                .addComponent(btnViewItems)
                .addContainerGap(649, Short.MAX_VALUE))
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
            .addComponent(SplitPaneFCP, javax.swing.GroupLayout.DEFAULT_SIZE, 1646, Short.MAX_VALUE)
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
        } catch (IOException ex) {
            Logger.getLogger(ManageFoodPantryItemsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btnAddItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemsActionPerformed
        // TODO add your handling code here:
       AddFoodPantryItemsPanel objAddPI = new AddFoodPantryItemsPanel(userProcessContainer, ecosystem,userAcc);
       SplitPaneFCP.setRightComponent(objAddPI);
    }//GEN-LAST:event_btnAddItemsActionPerformed

    private void btnViewItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewItemsActionPerformed
        // TODO add your handling code here:
       ViewFoodPantryItemsPanel objViewPI = new ViewFoodPantryItemsPanel(userProcessContainer, ecosystem,userAcc);
       SplitPaneFCP.setRightComponent(objViewPI);
    }//GEN-LAST:event_btnViewItemsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FCControlPanel;
    private javax.swing.JPanel FCWorkareaPanel;
    private javax.swing.JLabel LabelImg;
    private javax.swing.JSplitPane SplitPaneFCP;
    private javax.swing.JButton btnAddItems;
    private javax.swing.JButton btnViewItems;
    // End of variables declaration//GEN-END:variables

}
