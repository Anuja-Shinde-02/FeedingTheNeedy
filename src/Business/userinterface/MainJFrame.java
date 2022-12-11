/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Donation.DonationDirectory;
import Business.Donor.DonorDirectory;
import Business.FCPantry.FCPantryDirectory;
import Business.FCPantry.FCPantryItemsDirectory;
import Business.FCWarehouse.FCWarehouseDirectory;
import Business.NGO.NGODirectory;
import Business.NGOVolunteer.VolRequestsDirectory;
import Business.NGOVolunteer.VolunteerDirectory;

import Business.Organization;
import Business.Reqorder.ReqorderDirectory;
import Business.Requester.RequesterDirectory;
import Business.Hotel.HotelDirectory;
import Business.AccountOfUser.AccountOfUser;
import Business.AccountOfUser.AccountOfUserDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import userinterface.DonorRole.DonorAreaJPanel;
import userinterface.FCAdminRole.FCAdminWorkAreaPanel;
import userinterface.FCPManagerRole.FCPManagerWorkAreaPanel;
import userinterface.NGORole.ManageVolunteerPanel;
import userinterface.NGORole.NGOWorkAreaPanel;
import userinterface.RoleRequestor.AreaRequestJPanel;
import userinterface.HotelAdminRole.AdminWorkAreaJPanel;
import userinterface.WorkSignup.WorkAreaSignupJPanel;
import userinterface.SysAdminWorkArea.AddingWarehousePanel;
import userinterface.SysAdminWorkArea.SysAdminWorkAreaJPanel;
import userinterface.VolunteerRole.VolunteeringAreaPanel;

/**
 *
 * @author Lingfeng
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    AccountOfUser ua;
    RequesterDirectory rd;
    DonorDirectory dd;
    FCWarehouseDirectory fcd;

    public MainJFrame() throws IOException {
        initComponents();

        this.setSize(1680, 1050);
        ecosystem = dB4OUtil.retrieveSystem();
        if (ecosystem == null) {
            ecosystem = new EcoSystem(new RequesterDirectory(), new DonorDirectory(), new FCWarehouseDirectory(), new NGODirectory(), new VolunteerDirectory(),
                                        new FCPantryDirectory(),new FCPantryItemsDirectory(), new DonationDirectory(), new ReqorderDirectory() 
                                        , new VolRequestsDirectory());
        }

        Image img = ImageIO.read(getClass().getResource("/Images/background.png"));
        Image newimg = img.getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), java.awt.Image.SCALE_SMOOTH);
        jLabel3.setIcon(new ImageIcon(newimg));

        Image icon = ImageIO.read(getClass().getResource("/Images/logo.jpeg"));
        Image newIcon = icon.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        jLabel4.setIcon(new ImageIcon(newIcon));
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        userNameJTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        btnNewUser = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(105, 158, 208));

        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("User Name");

        jLabel2.setText("Password");

        logoutJButton.setText("Logout");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        btnNewUser.setText("Register");
        btnNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(loginJLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(logoutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(56, 56, 56))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(50, 50, 50)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginJLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loginJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoutJButton)
                        .addGap(27, 27, 27)
                        .addComponent(btnNewUser)))
                .addContainerGap(513, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setPreferredSize(new java.awt.Dimension(1100, 900));
        container.setLayout(new java.awt.CardLayout());

        jLabel3.setPreferredSize(new java.awt.Dimension(333, 400));
        container.add(jLabel3, "card2");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Get user name

        String username = userNameJTextField.getText();
        String password = passwordField.getText();
        AccountOfUserDirectory userDirectory = ecosystem.getUserAccountDirectory();

        this.ua = userDirectory.authenticateUser(username, password);
        if (ua == null) {
            JOptionPane.showMessageDialog(this, "Invalid credentials!!");
        } else {

            jSplitPane1.setOneTouchExpandable(true);
            jSplitPane1.setDividerLocation(0.0);

            if (ua.getRole().toString().equals("Business.Role.SystemAdminRole")) {

                userNameJTextField.setEnabled(false);
                passwordField.setEnabled(false);
                loginJButton.setEnabled(false);
                logoutJButton.setEnabled(true);

                SysAdminWorkAreaJPanel sa = new SysAdminWorkAreaJPanel(container, ecosystem, jPanel1, jSplitPane1);
                container.add("Sysadmin", sa);
                CardLayout crdLyt = (CardLayout) container.getLayout();
                crdLyt.next(container);
            } else if (ua.getRole().toString().equals("Business.Role.FCAdminRole")) {

                userNameJTextField.setEnabled(false);
                passwordField.setEnabled(false);
                loginJButton.setEnabled(false);
                logoutJButton.setEnabled(true);

                FCAdminWorkAreaPanel fca = new FCAdminWorkAreaPanel(container, ecosystem, ua, jPanel1, jSplitPane1);
                container.add("FCAdmin", fca);
                CardLayout crdLyt = (CardLayout) container.getLayout();
                crdLyt.next(container);
            } else if (ua.getRole().toString().equals("Business.Role.DonorRole")) {

                userNameJTextField.setEnabled(false);
                passwordField.setEnabled(false);
                loginJButton.setEnabled(false);
                logoutJButton.setEnabled(true);

                DonorAreaJPanel don = new DonorAreaJPanel(container, ecosystem, ua, jPanel1, jSplitPane1);
                container.add("Donor", don);
                CardLayout crdLyt = (CardLayout) container.getLayout();
                crdLyt.next(container);
            } else if (ua.getRole().toString().equals("Business.Role.RequestorRole")) {

                userNameJTextField.setEnabled(false);
                passwordField.setEnabled(false);
                loginJButton.setEnabled(false);
                logoutJButton.setEnabled(true);

                AreaRequestJPanel req = new AreaRequestJPanel(container, ecosystem, ua, jPanel1, jSplitPane1);
                container.add("Requestor", req);
                CardLayout crdLyt = (CardLayout) container.getLayout();
                crdLyt.next(container);
            }
            else if (ua.getRole().toString().equals("Business.Role.NgoRole")) {

                userNameJTextField.setEnabled(false);
                passwordField.setEnabled(false);
                loginJButton.setEnabled(false);
                logoutJButton.setEnabled(true);

                NGOWorkAreaPanel req = new NGOWorkAreaPanel(container, ecosystem, ua, jPanel1, jSplitPane1);
                container.add("NGOAgent", req);
                CardLayout crdLyt = (CardLayout) container.getLayout();
                crdLyt.next(container);
            }
            else if (ua.getRole().toString().equals("Business.Role.FCPManagerRole")) {

                userNameJTextField.setEnabled(false);
                passwordField.setEnabled(false);
                loginJButton.setEnabled(false);
                logoutJButton.setEnabled(true);

                FCPManagerWorkAreaPanel fcpm = new FCPManagerWorkAreaPanel(container, ecosystem, ua, jPanel1, jSplitPane1);
                container.add("FCPManager", fcpm);
                CardLayout crdLyt = (CardLayout) container.getLayout();
                crdLyt.next(container);
            }
            else if (ua.getRole().toString().equals("Business.Role.DeliveryVolunteer")) {

                userNameJTextField.setEnabled(false);
                passwordField.setEnabled(false);
                loginJButton.setEnabled(false);
                logoutJButton.setEnabled(true);

                VolunteeringAreaPanel vol = new VolunteeringAreaPanel(container, ecosystem, ua, jPanel1, jSplitPane1);
                container.add("Volunteer", vol);
                CardLayout crdLyt = (CardLayout) container.getLayout();
                crdLyt.next(container);
            }
        }


    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        logout(container, jPanel1, jSplitPane1);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void btnNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUserActionPerformed
        try {
            // TODO add your handling code here:
            WorkAreaSignupJPanel sp = new WorkAreaSignupJPanel(container, ecosystem);

            container.add("NewUser", sp);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container, "NewUser");

        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNewUserActionPerformed

    public void logout(JPanel container, JPanel jp, JSplitPane jsp) {
        try {

            Component[] component = jp.getComponents();

            for (int i = 0; i < component.length; i++) {
                if (component[i] instanceof JTextField) {
                    JTextField jt = (JTextField) component[i];
                    jt.setEnabled(true);
                    jt.setText("");
                }

                if (component[i] instanceof JButton) {
                    JButton jb = (JButton) component[i];
                    if (jb.getText() == "Login") {
                        jb.setEnabled(true);
                    }
                    if (jb.getText() == "Logout") {
                        jb.setEnabled(false);
                    }

                }

            }
            
            jsp.setOneTouchExpandable(true);
            jsp.setDividerLocation(0.2);

            container.removeAll();
            HomeJPanel hmJP = new HomeJPanel(container);
            container.add("Home", hmJP);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.next(container);
            dB4OUtil.storeSystem(ecosystem);
        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        AddingWarehousePanel panel = new AddingWarehousePanel(
                new ImageIcon("images/blurbg.png").getImage());
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainJFrame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewUser;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
