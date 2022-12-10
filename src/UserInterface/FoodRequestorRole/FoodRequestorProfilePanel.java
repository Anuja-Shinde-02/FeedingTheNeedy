/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.FoodRequestorRole;

import Business.EcoSystem;
import Business.Requestor.Requestor;
import Business.Requestor.RequestorDirectory;
import Business.UserAccount.UserAccount;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author anujashinde
 */
public class FoodRequestorProfilePanel extends javax.swing.JPanel {

    /**
     * Creates new form FoodRequestorProfilePanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    String reqUname;
    String reqName;
    RequestorDirectory reqDir;
    public FoodRequestorProfilePanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc = userAcc;
        btnSubmit.setVisible(false);
        btnCancel.setVisible(false);
        lblDpwd1.setVisible(false);
        txtDpwd1.setVisible(false);
        reqUname = userAcc.getUsername();
        reqName = userAcc.getEmployee().getName();
        populateFields();
        setBG();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDadd = new javax.swing.JTextField();
        lblDadd = new javax.swing.JLabel();
        lblDphno = new javax.swing.JLabel();
        txtDname = new javax.swing.JTextField();
        lblDName = new javax.swing.JLabel();
        lblDonProfileTitle = new javax.swing.JLabel();
        txtDpwd1 = new javax.swing.JTextField();
        lblDpwd1 = new javax.swing.JLabel();
        txtDpwd = new javax.swing.JTextField();
        lblDpwd = new javax.swing.JLabel();
        txtDuname = new javax.swing.JTextField();
        txtDphno = new javax.swing.JTextField();
        lblUname = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        txtDemail = new javax.swing.JTextField();
        lblDemail = new javax.swing.JLabel();
        txtDzip = new javax.swing.JTextField();
        lblDzip = new javax.swing.JLabel();
        txtDstate = new javax.swing.JTextField();
        lblDstate = new javax.swing.JLabel();
        txtDcity = new javax.swing.JTextField();
        lblDcity = new javax.swing.JLabel();
        lblDName1 = new javax.swing.JLabel();
        lblDphno1 = new javax.swing.JLabel();
        lblDadd1 = new javax.swing.JLabel();
        lblDcity1 = new javax.swing.JLabel();
        lblDstate1 = new javax.swing.JLabel();
        lblDzip1 = new javax.swing.JLabel();
        lblDemail1 = new javax.swing.JLabel();
        lblUname1 = new javax.swing.JLabel();
        lblDpwd2 = new javax.swing.JLabel();
        lblDpwd3 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        LabelImg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDadd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDadd.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDadd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDaddFocusLost(evt);
            }
        });
        add(txtDadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 180, 137, -1));

        lblDadd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDadd.setText("Address");
        add(lblDadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 184, -1, -1));

        lblDphno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDphno.setText("Phone Number");
        add(lblDphno, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 141, -1, -1));

        txtDname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDnameFocusLost(evt);
            }
        });
        add(txtDname, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 91, 137, -1));

        lblDName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDName.setText("Name");
        add(lblDName, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 95, -1, -1));

        lblDonProfileTitle.setFont(new java.awt.Font("Georgia", 1, 29)); // NOI18N
        lblDonProfileTitle.setForeground(new java.awt.Color(51, 153, 255));
        lblDonProfileTitle.setText("My Food Cloud Profile");
        add(lblDonProfileTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        txtDpwd1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDpwd1.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDpwd1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDpwd1FocusLost(evt);
            }
        });
        add(txtDpwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 481, 137, -1));

        lblDpwd1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDpwd1.setText("Confirm Password");
        add(lblDpwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 485, -1, -1));

        txtDpwd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDpwd.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDpwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDpwdFocusLost(evt);
            }
        });
        add(txtDpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 438, 137, -1));

        lblDpwd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDpwd.setText("Password");
        add(lblDpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 442, -1, -1));

        txtDuname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDuname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDuname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDunameFocusLost(evt);
            }
        });
        add(txtDuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 395, 137, -1));

        txtDphno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDphno.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDphno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDphnoFocusLost(evt);
            }
        });
        add(txtDphno, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 137, 137, -1));

        lblUname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblUname.setText("Username");
        add(lblUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 399, -1, -1));

        btnEdit.setText("Edit Profile");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, -1, -1));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, -1, -1));

        txtDemail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDemail.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDemailFocusLost(evt);
            }
        });
        add(txtDemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 352, 137, -1));

        lblDemail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDemail.setText("Email Id");
        add(lblDemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 356, -1, -1));

        txtDzip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDzip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDzip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDzipFocusLost(evt);
            }
        });
        add(txtDzip, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 309, 137, -1));

        lblDzip.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDzip.setText("Zipcode");
        add(lblDzip, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 313, -1, -1));

        txtDstate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDstate.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDstate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDstateFocusLost(evt);
            }
        });
        add(txtDstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 266, 137, -1));

        lblDstate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDstate.setText("State");
        add(lblDstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 270, -1, -1));

        txtDcity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDcity.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDcity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDcityFocusLost(evt);
            }
        });
        add(txtDcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 223, 137, -1));

        lblDcity.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDcity.setText("City");
        add(lblDcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 227, -1, -1));

        lblDName1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblDName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 90, -1, -1));

        lblDphno1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblDphno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 137, -1, -1));

        lblDadd1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblDadd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 180, -1, -1));

        lblDcity1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblDcity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 223, -1, -1));

        lblDstate1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblDstate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 266, -1, -1));

        lblDzip1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblDzip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 309, -1, -1));

        lblDemail1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblDemail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 352, -1, -1));

        lblUname1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblUname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 395, -1, -1));

        lblDpwd2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblDpwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 438, -1, -1));

        lblDpwd3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblDpwd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 481, -1, -1));

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, -1));
        add(LabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1590, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void txtDaddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDaddFocusLost
        // TODO add your handling code here:
        if(!(txtDadd.getText().matches("^[a-zA-Z]*$"))){
            lblDadd1.setText("Invalid input. Please enter only alphabets");
        }
        else{
            lblDadd1.setText("");
        }
    }//GEN-LAST:event_txtDaddFocusLost

    private void txtDnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDnameFocusLost
        // TODO add your handling code here:
        if(!(txtDname.getText().matches("^[a-zA-Z]*$"))){
            lblDName1.setText("Invalid input. Please enter only alphabets");
        }
        else{
            lblDName1.setText("");
        }
    }//GEN-LAST:event_txtDnameFocusLost

    public void setBG() {
        try {
            LabelImg.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/blurbg.jpeg"));

            Image newimg = img.getScaledInstance(1650, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
            LabelImg.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(FoodRequestorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void txtDpwd1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDpwd1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDpwd1FocusLost

    private void txtDpwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDpwdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDpwdFocusLost

    private void txtDunameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDunameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDunameFocusLost

    private void txtDphnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDphnoFocusLost
        // TODO add your handling code here:
        if(!(txtDphno.getText().matches("^[0-9]*$")) || !(txtDphno.getText().length()==10)) {
            lblDphno1.setText("Please enter a valid phone number");
        }
        else{
            lblDphno1.setText("");

        }
    }//GEN-LAST:event_txtDphnoFocusLost

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        enablefields();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(!nullCheck()){
            ArrayList<Requestor> reqList = ecosystem.getReqDir().getReqAccList();
            for(Requestor r: reqList)
            {
                if(r.getReqAccount().getUsername().equals(reqUname))
                {
                    r.setReqName(txtDname.getText());
                    r.setReqPhno(txtDphno.getText());
                    r.setReqEmail(txtDemail.getText());
                    r.setReqAddres(txtDadd.getText());
                    r.setReqCity(txtDcity.getText());
                    r.setReqState(txtDstate.getText());
                    r.setReqZipcode(txtDzip.getText());
                    r.setReqUserName(txtDuname.getText());
                    r.setReqPwd(txtDpwd.getText());
                }
            }
            // ecosystem.setFCWDirectory(fcwList);
            reqDir = ecosystem.getReqDir();
            ecosystem.setReqDir(reqDir);
            JOptionPane.showMessageDialog(this, "Profile updated successfully");
            disableFields();
        }
        else{
            JOptionPane.showMessageDialog(this, "All fields are mandatory!");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtDemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDemailFocusLost
        // TODO add your handling code here:
        if ((!txtDemail.getText().isEmpty()) && !txtDemail.getText().matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")) {
            lblDemail1.setText( "Please Provide Valid Email Address !!");
        }
        else{
            lblDemail1.setText("");
        }
    }//GEN-LAST:event_txtDemailFocusLost

    private void txtDzipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDzipFocusLost
        // TODO add your handling code here:
        if((txtDzip.getText().matches("^[a-zA-Z]*$"))){
            lblDzip1.setText("Invalid input. Please enter only numbers");
        }
        else{
            lblDzip1.setText("");
        }
    }//GEN-LAST:event_txtDzipFocusLost

    private void txtDstateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDstateFocusLost
        // TODO add your handling code here:
        if(!(txtDstate.getText().matches("^[a-zA-Z]*$"))){
            lblDstate1.setText("Invalid input. Please enter only alphabets");
        }
        else{
            lblDstate1.setText("");
        }
    }//GEN-LAST:event_txtDstateFocusLost

    private void txtDcityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDcityFocusLost
        // TODO add your handling code here:
        if(!(txtDcity.getText().matches("^[a-zA-Z]*$"))){
            lblDcity1.setText("Invalid input. Please enter only alphabets");
        }
        else{
            lblDcity1.setText("");
        }
    }//GEN-LAST:event_txtDcityFocusLost

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        disableFields();
        
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImg;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblDName;
    private javax.swing.JLabel lblDName1;
    private javax.swing.JLabel lblDadd;
    private javax.swing.JLabel lblDadd1;
    private javax.swing.JLabel lblDcity;
    private javax.swing.JLabel lblDcity1;
    private javax.swing.JLabel lblDemail;
    private javax.swing.JLabel lblDemail1;
    private javax.swing.JLabel lblDonProfileTitle;
    private javax.swing.JLabel lblDphno;
    private javax.swing.JLabel lblDphno1;
    private javax.swing.JLabel lblDpwd;
    private javax.swing.JLabel lblDpwd1;
    private javax.swing.JLabel lblDpwd2;
    private javax.swing.JLabel lblDpwd3;
    private javax.swing.JLabel lblDstate;
    private javax.swing.JLabel lblDstate1;
    private javax.swing.JLabel lblDzip;
    private javax.swing.JLabel lblDzip1;
    private javax.swing.JLabel lblUname;
    private javax.swing.JLabel lblUname1;
    private javax.swing.JTextField txtDadd;
    private javax.swing.JTextField txtDcity;
    private javax.swing.JTextField txtDemail;
    private javax.swing.JTextField txtDname;
    private javax.swing.JTextField txtDphno;
    private javax.swing.JTextField txtDpwd;
    private javax.swing.JTextField txtDpwd1;
    private javax.swing.JTextField txtDstate;
    private javax.swing.JTextField txtDuname;
    private javax.swing.JTextField txtDzip;
    // End of variables declaration//GEN-END:variables

    private void populateFields() {
        for(Requestor r: ecosystem.getReqDir().getReqAccList()){
            if(r.getReqName().equals(reqName)){
            txtDname.setText(r.getReqName());
            txtDname.setEnabled(false);
            txtDphno.setText(r.getReqPhno());
            txtDphno.setEnabled(false);
            txtDemail.setText(r.getReqEmail());
            txtDemail.setEnabled(false);
            txtDadd.setText(r.getReqAddres());
            txtDadd.setEnabled(false);
            txtDcity.setText(r.getReqCity());
            txtDcity.setEnabled(false);
            txtDstate.setText(r.getReqState());
            txtDstate.setEnabled(false);
            txtDzip.setText(r.getReqZipcode());
            txtDzip.setEnabled(false);
            txtDuname.setText(r.getReqAccount().getUsername());
            txtDuname.setEnabled(false);
            txtDpwd.setText(r.getReqAccount().getUsername());
            txtDpwd.setEnabled(false);
            }
        } 
    } 

    private void enablefields() {
        txtDname.setEnabled(true);
        txtDphno.setEnabled(true);
        txtDemail.setEnabled(true);
        txtDadd.setEnabled(true);
        txtDcity.setEnabled(true);
        txtDstate.setEnabled(true);
        txtDzip.setEnabled(true);
        txtDuname.setEnabled(true);
        txtDpwd.setEnabled(true);
        btnSubmit.setVisible(true);
        btnCancel.setVisible(true);
        lblDpwd1.setVisible(true);
        txtDpwd1.setVisible(true);
    }

    private boolean nullCheck() {
        if(txtDname.getText().length()!=0 && txtDphno.getText().length()!=0 && txtDemail.getText().length()!=0 
                && txtDadd.getText().length()!=0 && txtDcity.getText().length()!=0 && txtDstate.getText().length()!=0
                && txtDzip.getText().length()!=0 && txtDuname.getText().length()!=0 && txtDpwd.getText().length()!=0
                && txtDpwd1.getText().length()!=0 )
        {
            return false;
        }
        else return true;
    }

    private void disableFields() {
        txtDname.setEnabled(false);
        txtDphno.setEnabled(false);
        txtDemail.setEnabled(false);
        txtDadd.setEnabled(false);
        txtDcity.setEnabled(false);
        txtDstate.setEnabled(false);
        txtDzip.setEnabled(false);
        txtDuname.setEnabled(false);
        txtDpwd.setEnabled(false);
        btnSubmit.setVisible(false);
        btnCancel.setVisible(false);
        lblDpwd1.setVisible(false);
        txtDpwd1.setVisible(false);
        lblDName1.setText("");
        lblDphno1.setText("");
        lblDemail1.setText("");
        lblDadd1.setText("");
        lblDcity1.setText("");
        lblDstate1.setText("");
        lblDzip1.setText("");
        lblUname1.setText("");
        lblDpwd2.setText("");
        lblDpwd3.setText("");
    }
    
}
