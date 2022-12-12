/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RequestorRole;

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
import javax.swing.JSplitPane;
import userinterface.DonorRole.DonorProfilePanel;
import userinterface.MainJFrame;

/**
 *
 * @author anujashinde
 */
public class RequestorAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestorAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    EcoSystem ecosystem;
    JPanel jp;
    JSplitPane jsp ;
    
    public RequestorAreaJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount account,JPanel jp, JSplitPane jsp) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;    
        this.userAccount = account;
        this.ecosystem = ecosystem;
        this.jp = jp;
        this.jsp = jsp;
        setBG();
        setLogo();
        logoutlogo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPaneReq = new javax.swing.JSplitPane();
        MenubarPanel = new javax.swing.JPanel();
        btnReq = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnStatus = new javax.swing.JButton();
        lblWelcomemsg = new javax.swing.JLabel();
        lbllogout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logoImage = new javax.swing.JLabel();
        WorkAreaPanel = new javax.swing.JPanel();
        LabelImg = new javax.swing.JLabel();

        SplitPaneReq.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        MenubarPanel.setBackground(new java.awt.Color(255, 255, 255));
        MenubarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReq.setBackground(new java.awt.Color(255, 93, 119));
        btnReq.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnReq.setText("Request Food");
        btnReq.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqActionPerformed(evt);
            }
        });
        MenubarPanel.add(btnReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 120, 30));

        btnProfile.setBackground(new java.awt.Color(255, 93, 119));
        btnProfile.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnProfile.setText("My Profile");
        btnProfile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        MenubarPanel.add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 100, 30));

        btnStatus.setBackground(new java.awt.Color(255, 93, 119));
        btnStatus.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnStatus.setText("Check Status");
        btnStatus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusActionPerformed(evt);
            }
        });
        MenubarPanel.add(btnStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 110, 30));

        lblWelcomemsg.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        lblWelcomemsg.setForeground(new java.awt.Color(255, 93, 119));
        lblWelcomemsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcomemsg.setText("! Welcome Requestor !");
        MenubarPanel.add(lblWelcomemsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        lbllogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbllogoutMousePressed(evt);
            }
        });
        MenubarPanel.add(lbllogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 40, 43, 41));
        MenubarPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(819, 46, -1, 57));
        MenubarPanel.add(logoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 80, 60));

        SplitPaneReq.setLeftComponent(MenubarPanel);

        WorkAreaPanel.setPreferredSize(new java.awt.Dimension(1000, 700));

        javax.swing.GroupLayout WorkAreaPanelLayout = new javax.swing.GroupLayout(WorkAreaPanel);
        WorkAreaPanel.setLayout(WorkAreaPanelLayout);
        WorkAreaPanelLayout.setHorizontalGroup(
            WorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelImg, javax.swing.GroupLayout.DEFAULT_SIZE, 1604, Short.MAX_VALUE)
        );
        WorkAreaPanelLayout.setVerticalGroup(
            WorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelImg, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
        );

        SplitPaneReq.setRightComponent(WorkAreaPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneReq, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneReq, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

      public void setLogo() {
        try {
            logoImage.setMinimumSize(new Dimension(100, 100));
            logoImage.setPreferredSize(new Dimension(100, 100));
            logoImage.setMaximumSize(new Dimension(100, 100));

            Image img = ImageIO.read(getClass().getResource("/Images/cmnlogo.jpeg"));

            Image newimg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
            logoImage.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(DonorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setBG() {
        try {
            LabelImg.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/blurbg.jpeg"));

            Image newimg = img.getScaledInstance(1650, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
            LabelImg.setIcon(new ImageIcon(newimg));
            
             //The foundation class for all thrown exceptions is IOException. 
        } catch (IOException ex) {
            Logger.getLogger(RequestorAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public void logoutlogo() {

        try {
           
            lbllogout.setMinimumSize(new Dimension(50,60));
            lbllogout.setPreferredSize(new Dimension(50,60));
            lbllogout.setMaximumSize(new Dimension(50,60));
            
            Image img1 = ImageIO.read(getClass().getResource("/Images/Logout.png"));
            Image newimg1 = img1.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);

            lbllogout.setIcon(new ImageIcon(newimg1));
            
             //The foundation class for all thrown exceptions is IOException. 
            
        } catch (IOException ex) {
            Logger.getLogger(RequestorAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private void btnReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqActionPerformed
        // TODO add your handling code here:
        RequestFoodPanel objReq = new RequestFoodPanel(userProcessContainer,ecosystem,userAccount);
        //SplitPane is used to divide two Component's
        SplitPaneReq.setRightComponent(objReq);
    }//GEN-LAST:event_btnReqActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        RequestorProfilePanel objReqProf = new RequestorProfilePanel(userProcessContainer,ecosystem,userAccount);
        SplitPaneReq.setRightComponent(objReqProf);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed
        // TODO add your handling code here:
        ReqorderStatusPanel objReqstatus = new ReqorderStatusPanel(userProcessContainer,ecosystem,userAccount);
        SplitPaneReq.setRightComponent(objReqstatus);
    }//GEN-LAST:event_btnStatusActionPerformed

    private void lbllogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMousePressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            MainJFrame mjf = new MainJFrame();
            mjf.logout(userProcessContainer, jp, jsp);
        } catch (IOException ex) {
            Logger.getLogger(RequestorAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbllogoutMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImg;
    private javax.swing.JPanel MenubarPanel;
    private javax.swing.JSplitPane SplitPaneReq;
    private javax.swing.JPanel WorkAreaPanel;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnReq;
    private javax.swing.JButton btnStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblWelcomemsg;
    private javax.swing.JLabel lbllogout;
    private javax.swing.JLabel logoImage;
    // End of variables declaration//GEN-END:variables
}