/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;


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
import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Donation.DonationDirectory;
import Business.Donor.DonorDirectory;
import Business.NGO.NGODirectory;
import Business.NGOVolunteer.VolRequestsDirectory;
import Business.NGOVolunteer.VolunteerDirectory;
import Business.FCPantry.FCPantryDirectory;
import Business.FCPantry.FCPantryItemsDirectory;
import Business.FCWarehouse.FCWarehouseDirectory;
import Business.Reqorder.ReqorderDirectory;
import Business.Requestor.RequestorDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import userinterface.DonorRole.DonorAreaJPanel;
import userinterface.FCAdminRole.FCAdminWorkAreaPanel;
import userinterface.FCPManagerRole.FCPManagerWorkAreaPanel;
import userinterface.NGORole.NGOWorkAreaPanel;
import userinterface.SystemAdminWorkArea.AddWarehousePanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import userinterface.VolunteerRole.VolunteerWorkAreaPanel;
import userinterface.RequestorRole.RequestorAreaJPanel;
import userinterface.Signup.SignupWorkAreaJPanel;

/**
 *
 * @author dristidani
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    FCWarehouseDirectory fcd;
    UserAccount ua;
    RequestorDirectory rd;
    DonorDirectory dd;
    VolunteerDirectory vd;

    public MainJFrame() throws IOException {
        initComponents();

        this.setSize(1680, 1050);
        ecosystem = dB4OUtil.retrieveSystem();
        if (ecosystem == null) {
            ecosystem = new EcoSystem(new RequestorDirectory(), new DonorDirectory(), new FCWarehouseDirectory(), new NGODirectory(), new VolunteerDirectory(),
                                        new FCPantryDirectory(),new FCPantryItemsDirectory(), new DonationDirectory(), new ReqorderDirectory() 
                                        , new VolRequestsDirectory());
        }

        Image img = ImageIO.read(getClass().getResource("/Images/background.png"));
        Image newimg = img.getScaledInstance(lblBkg.getWidth(), lblBkg.getHeight(), java.awt.Image.SCALE_SMOOTH);
        lblBkg.setIcon(new ImageIcon(newimg));

        Image icon = ImageIO.read(getClass().getResource("/Images/logo.jpeg"));
        Image newIcon = icon.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        lblLogo.setIcon(new ImageIcon(newIcon));
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
        btnLogin = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        lblBkg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 93, 119));

        btnLogin.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtUserName.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N

        lblUserName.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        lblUserName.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        lblPassword.setText("Password:");

        btnLogout.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogout.setEnabled(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnRegister.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUserName)
                            .addComponent(lblPassword))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginJLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserName))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword))
                        .addGap(39, 39, 39)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(412, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setPreferredSize(new java.awt.Dimension(1100, 900));
        container.setLayout(new java.awt.CardLayout());

        lblBkg.setPreferredSize(new java.awt.Dimension(333, 400));
        container.add(lblBkg, "card2");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Get user name

        String username = txtUserName.getText();
        String password = txtPassword.getText();
        UserAccountDirectory userDirectory = ecosystem.getUserAccountDirectory();

        this.ua = userDirectory.authenticateUser(username, password);
        if (ua == null) {
            JOptionPane.showMessageDialog(this, "Credentials Invalid!!");
        } else {

            jSplitPane1.setOneTouchExpandable(true);
            jSplitPane1.setDividerLocation(0.0);

            if (ua.getRole().toString().equals("Business.Role.SystemAdminRole")) {

                txtUserName.setEnabled(false);
                txtPassword.setEnabled(false);
                btnLogin.setEnabled(false);
                btnLogout.setEnabled(true);

                SystemAdminWorkAreaJPanel sa = new SystemAdminWorkAreaJPanel(container, ecosystem, jPanel1, jSplitPane1);
                container.add("Sysadmin", sa);
                CardLayout crdLyt = (CardLayout) container.getLayout();
                crdLyt.next(container);
            } else if (ua.getRole().toString().equals("Business.Role.FCAdminRole")) {

                txtUserName.setEnabled(false);
                txtPassword.setEnabled(false);
                btnLogin.setEnabled(false);
                btnLogout.setEnabled(true);

                FCAdminWorkAreaPanel fca = new FCAdminWorkAreaPanel(container, ecosystem, ua, jPanel1, jSplitPane1);
                container.add("FCAdmin", fca);
                CardLayout crdLyt = (CardLayout) container.getLayout();
                crdLyt.next(container);
            } else if (ua.getRole().toString().equals("Business.Role.DonorRole")) {

                txtUserName.setEnabled(false);
                txtPassword.setEnabled(false);
                btnLogin.setEnabled(false);
                btnLogout.setEnabled(true);

                DonorAreaJPanel don = new DonorAreaJPanel(container, ecosystem, ua, jPanel1, jSplitPane1);
                container.add("Donor", don);
                CardLayout crdLyt = (CardLayout) container.getLayout();
                crdLyt.next(container);
            } else if (ua.getRole().toString().equals("Business.Role.RequestorRole")) {

                txtUserName.setEnabled(false);
                txtPassword.setEnabled(false);
                btnLogin.setEnabled(false);
                btnLogout.setEnabled(true);

                RequestorAreaJPanel req = new RequestorAreaJPanel(container, ecosystem, ua, jPanel1, jSplitPane1);
                container.add("Requestor", req);
                CardLayout crdLyt = (CardLayout) container.getLayout();
                crdLyt.next(container);
            }
            else if (ua.getRole().toString().equals("Business.Role.NgoRole")) {

                txtUserName.setEnabled(false);
                txtPassword.setEnabled(false);
                btnLogin.setEnabled(false);
                btnLogout.setEnabled(true);

                NGOWorkAreaPanel req = new NGOWorkAreaPanel(container, ecosystem, ua, jPanel1, jSplitPane1);
                container.add("NGOAgent", req);
                CardLayout crdLyt = (CardLayout) container.getLayout();
                crdLyt.next(container);
            }
            else if (ua.getRole().toString().equals("Business.Role.FCPManagerRole")) {

                txtUserName.setEnabled(false);
                txtPassword.setEnabled(false);
                btnLogin.setEnabled(false);
                btnLogout.setEnabled(true);

                FCPManagerWorkAreaPanel fcpm = new FCPManagerWorkAreaPanel(container, ecosystem, ua, jPanel1, jSplitPane1);
                container.add("FCPManager", fcpm);
                CardLayout crdLyt = (CardLayout) container.getLayout();
                crdLyt.next(container);
            }
            else if (ua.getRole().toString().equals("Business.Role.DeliveryVolunteer")) {

                txtUserName.setEnabled(false);
                txtPassword.setEnabled(false);
                btnLogin.setEnabled(false);
                btnLogout.setEnabled(true);

                VolunteerWorkAreaPanel vol = new VolunteerWorkAreaPanel(container, ecosystem, ua, jPanel1, jSplitPane1);
                container.add("Volunteer", vol);
                CardLayout crdLyt = (CardLayout) container.getLayout();
                crdLyt.next(container);
            }
        }


    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        logout(container, jPanel1, jSplitPane1);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        try {
            // TODO add your handling code here:
            SignupWorkAreaJPanel sp = new SignupWorkAreaJPanel(container, ecosystem);

            container.add("NewUser", sp);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container, "NewUser");

        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

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
        AddWarehousePanel panel = new AddWarehousePanel(
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
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegister;
    private javax.swing.JPanel container;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblBkg;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
