/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author dristidani
 */

//JPanel - container that can store a group of components.
public class RequestLabTestJPanel extends javax.swing.JPanel {

    private UserAccount userAccount;
    private JPanel userProcessContainer;
    
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestLabTestJPanel(JPanel userProcessContainer, UserAccount account) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRequestTest = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblValue = new javax.swing.JLabel();
        lblEnterprise = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRequestTest.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        btnRequestTest.setText("Request Test");
        btnRequestTest.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRequestTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestTestActionPerformed(evt);
            }
        });
        add(btnRequestTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        lblMessage.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblMessage.setText("Message:");
        add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));
        add(txtMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 89, -1));

        btnBack.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblValue.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblValue.setText("<value>");
        add(lblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 130, -1));

        lblEnterprise.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        lblEnterprise.setText("Enterprise :");
        add(lblEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestTestActionPerformed
        
    }//GEN-LAST:event_btnRequestTestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaJPanel dwjp = (CustomerAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequestTest;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblValue;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
