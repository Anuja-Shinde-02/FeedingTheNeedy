/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGORole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.NGOVolunteer.Volunteer;
import Business.NGOVolunteer.VolunteerDirectory;
import Business.Role.DeliveryVolunteer;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
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
public class AddVolunteerPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddVolunteerPanel
     */
    JPanel userProcessContainer;
    UserAccountDirectory uad;
    VolunteerDirectory vold;
    EcoSystem ecosystem;
    String ngoName;
    public AddVolunteerPanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        if(ecosystem.getVolDir() == null){
              ecosystem.setVolDir(new VolunteerDirectory());
          }
        setBG();
        ngoName=userAcc.getEmployee().getName();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddVolunteerTitle = new javax.swing.JLabel();
        lblVolunteerName = new javax.swing.JLabel();
        txtVolunteerName = new javax.swing.JTextField();
        lblVolunteerPhone = new javax.swing.JLabel();
        txtVolunteerPhone = new javax.swing.JTextField();
        lblVolunteerAddress = new javax.swing.JLabel();
        txtVolunteerAddress = new javax.swing.JTextField();
        lblVolunteerCity = new javax.swing.JLabel();
        txtVolunteerCity = new javax.swing.JTextField();
        lblVolunteerState = new javax.swing.JLabel();
        txtVolunteerState = new javax.swing.JTextField();
        lblVolunteerZip = new javax.swing.JLabel();
        txtVolunteerZip = new javax.swing.JTextField();
        lblVolunteerExp = new javax.swing.JLabel();
        txtVolunteerExp = new javax.swing.JTextField();
        lblVolunteerUserName = new javax.swing.JLabel();
        txtVolunteerUserName = new javax.swing.JTextField();
        lblVolunteerPassword = new javax.swing.JLabel();
        txtVolunteerPassword = new javax.swing.JTextField();
        lblVolunteerConfPassword = new javax.swing.JLabel();
        txtVolunteerConfPassword = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblVolunteerID = new javax.swing.JLabel();
        txtVolunteerID = new javax.swing.JTextField();
        lblVolunteerAge = new javax.swing.JLabel();
        txtVolunteerAge = new javax.swing.JTextField();
        lblVolunteerIDError = new javax.swing.JLabel();
        lblVolunteerNameError = new javax.swing.JLabel();
        lblVolunteerPhnoError = new javax.swing.JLabel();
        lblVolunteerZipError = new javax.swing.JLabel();
        lblVolPasswordError = new javax.swing.JLabel();
        lblVolAdminError = new javax.swing.JLabel();
        LabelImg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddVolunteerTitle.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        lblAddVolunteerTitle.setForeground(new java.awt.Color(255, 93, 119));
        lblAddVolunteerTitle.setText("! Add Volunteer !");
        add(lblAddVolunteerTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 310, -1));

        lblVolunteerName.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerName.setText("Volunteer Name");
        add(lblVolunteerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 130, -1));

        txtVolunteerName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolunteerName.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolunteerName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolunteerNameFocusLost(evt);
            }
        });
        txtVolunteerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolunteerNameActionPerformed(evt);
            }
        });
        add(txtVolunteerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 140, -1));

        lblVolunteerPhone.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerPhone.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerPhone.setText("Phone Number");
        add(lblVolunteerPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 130, 20));

        txtVolunteerPhone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolunteerPhone.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolunteerPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolunteerPhoneFocusLost(evt);
            }
        });
        add(txtVolunteerPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 140, -1));

        lblVolunteerAddress.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerAddress.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerAddress.setText("Address");
        add(lblVolunteerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 297, 100, 20));

        txtVolunteerAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolunteerAddress.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolunteerAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolunteerAddressActionPerformed(evt);
            }
        });
        add(txtVolunteerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 140, -1));

        lblVolunteerCity.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerCity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerCity.setText("City");
        add(lblVolunteerCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 60, 20));

        txtVolunteerCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolunteerCity.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtVolunteerCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 140, -1));

        lblVolunteerState.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerState.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerState.setText("State");
        add(lblVolunteerState, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 70, 20));

        txtVolunteerState.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolunteerState.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtVolunteerState, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 140, -1));

        lblVolunteerZip.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerZip.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerZip.setText("Zipcode");
        add(lblVolunteerZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 80, 30));

        txtVolunteerZip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolunteerZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolunteerZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolunteerZipFocusLost(evt);
            }
        });
        add(txtVolunteerZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 140, -1));

        lblVolunteerExp.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerExp.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerExp.setText("Volunteer Experience");
        add(lblVolunteerExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 170, 30));

        txtVolunteerExp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolunteerExp.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolunteerExp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolunteerExpFocusLost(evt);
            }
        });
        txtVolunteerExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolunteerExpActionPerformed(evt);
            }
        });
        add(txtVolunteerExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 140, -1));

        lblVolunteerUserName.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerUserName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerUserName.setText("Volunteer Username");
        add(lblVolunteerUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 160, 20));

        txtVolunteerUserName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolunteerUserName.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtVolunteerUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 140, -1));

        lblVolunteerPassword.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerPassword.setText("Password");
        add(lblVolunteerPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, 100, 20));

        txtVolunteerPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolunteerPassword.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtVolunteerPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, 140, -1));

        lblVolunteerConfPassword.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerConfPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerConfPassword.setText("Confirm Password");
        add(lblVolunteerConfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, -1, 30));

        txtVolunteerConfPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolunteerConfPassword.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolunteerConfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolunteerConfPasswordFocusLost(evt);
            }
        });
        add(txtVolunteerConfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 610, 140, -1));

        btnSubmit.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 690, 80, 40));

        lblVolunteerID.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerID.setText("Volunteer Id");
        add(lblVolunteerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 130, -1));

        txtVolunteerID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolunteerID.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolunteerID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolunteerIDFocusLost(evt);
            }
        });
        txtVolunteerID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVolunteerIDKeyReleased(evt);
            }
        });
        add(txtVolunteerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 140, -1));

        lblVolunteerAge.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerAge.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerAge.setText("Volunteer Age");
        add(lblVolunteerAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 130, -1));

        txtVolunteerAge.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolunteerAge.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolunteerAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolunteerAgeFocusLost(evt);
            }
        });
        add(txtVolunteerAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 140, -1));
        add(lblVolunteerIDError, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 200, 20));
        add(lblVolunteerNameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 190, 20));
        add(lblVolunteerPhnoError, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 200, 20));
        add(lblVolunteerZipError, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 200, 20));
        add(lblVolPasswordError, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 220, 20));
        add(lblVolAdminError, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 180, 20));

        LabelImg.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        LabelImg.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        add(LabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 800));
    }// </editor-fold>//GEN-END:initComponents

    public void setBG() {
        try {
            LabelImg.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/blurbg.jpeg"));

            Image newimg = img.getScaledInstance(1650, 850, java.awt.Image.SCALE_SMOOTH);
            LabelImg.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(AddVolunteerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void txtVolunteerNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolunteerNameFocusLost
        // TODO add your handling code here:
        if(!(txtVolunteerName.getText().matches("^[a-zA-Z]*$"))){
            lblVolunteerNameError.setText("Input invalid. Please enter only alphabets");
        }
        else{
            lblVolunteerNameError.setText("");
        }
    }//GEN-LAST:event_txtVolunteerNameFocusLost

    private void txtVolunteerPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolunteerPhoneFocusLost
        // TODO add your handling code here:
        if(!(txtVolunteerPhone.getText().matches("^[0-9]*$")) || !(txtVolunteerPhone.getText().length()==10)) {
            lblVolunteerPhnoError.setText("Please enter a valid phone number");
        }
        else{
            lblVolunteerPhnoError.setText("");

        }
    }//GEN-LAST:event_txtVolunteerPhoneFocusLost

    private void txtVolunteerAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolunteerAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolunteerAddressActionPerformed

    private void txtVolunteerZipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolunteerZipFocusLost
        // TODO add your handling code here:
        if((txtVolunteerZip.getText().matches("^[a-zA-Z]*$"))){
            lblVolunteerZipError.setText("Input invalid. Please enter only numbers");
        }
        else{
            lblVolunteerZipError.setText("");
        }
    }//GEN-LAST:event_txtVolunteerZipFocusLost

    private void txtVolunteerExpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolunteerExpFocusLost
        // TODO add your handling code here:
//        if(!(txtVolExp.getText().matches("^[a-zA-Z]*$"))){
//            lblVolAdmin1.setText("Invalid input. Please enter only alphabets.");
//        }
//        else{
//            lblVolAdmin1.setText("");
//        }
    }//GEN-LAST:event_txtVolunteerExpFocusLost

    private void txtVolunteerConfPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolunteerConfPasswordFocusLost
        // TODO add your handling code here:
//        if(!(txtVolpwd.getText().equals(txtVolcopwd1.getText()))){
//            lblVolpwd2.setText("Password Mismatch. Please verify the password entered.");
//        }
//        else{
//            lblVolpwd2.setText("");
//        }
    }//GEN-LAST:event_txtVolunteerConfPasswordFocusLost

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(!nullCheck()){
            if(chkpwd()){
            UserAccountDirectory uaList = ecosystem.getUserAccountDirectory();
            Employee employee = new Employee();
            employee.setName(txtVolunteerName.getText());
            String role = "Volunteer";
            Volunteer vol = new Volunteer();
            
              //The get method returns the variable name's value.
             //The name variable is given a parameter (newName), which is assigned via the set method.
            vol.setVolId("volunteer"+txtVolunteerID.getText());
            vol.setVolName(txtVolunteerName.getText());
            vol.setVolAge(txtVolunteerAge.getText());
            vol.setVolPhno(txtVolunteerPhone.getText());
            vol.setVolAddress(txtVolunteerAddress.getText());
            vol.setVolCity(txtVolunteerCity.getText());
            vol.setVolState(txtVolunteerState.getText());
            vol.setVolZipcode(txtVolunteerZip.getText());
            vol.setVolExp(txtVolunteerExp.getText());
            UserAccount volAccount=new UserAccount();
            volAccount.setUsername(txtVolunteerUserName.getText());
            volAccount.setPassword(txtVolunteerPassword.getText());
            // uaList.createUserAccount(txtFCAuname.getText(), txtFCApwd.getText(), employee, new FCAdminRole());
            //                ua = usersList.getUserAccount(txtUserName.getText());

            volAccount.setRole(new DeliveryVolunteer());
            volAccount.setEmployee(employee);
            vol.setVolAvail("New");
            vol.setVolNGO(ngoName);
            uad=ecosystem.getUserAccountDirectory();
            uad.createUserAccount(txtVolunteerUserName.getText(), txtVolunteerPassword.getText(), employee, new DeliveryVolunteer());
            ecosystem.setUserAccountDirectory(uad);
            vol.setVolAccount(volAccount);
            vold = ecosystem.getVolDir();
            vold.addNewVolunteer(vol);
            ecosystem.setVolDir(vold);
            
             //JOptionPane.showMessageDialog is used to create an information-message dialog titled "Message"
             //after clicking on submit the volunteer will be added successfully 
            JOptionPane.showMessageDialog(this, "Volunteer added successfully!");
            clearfields();
            }
            
            else{
                
                //password mismatch is not allowed 
                JOptionPane.showMessageDialog(this, "Password Mismatch. Please verify the password entered.");  
              txtVolunteerConfPassword.setText("");
            }
        }
        else{
            //fill all the fields
            JOptionPane.showMessageDialog(this, "Please make sure that you have filled all mandatory fields");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtVolunteerIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolunteerIDFocusLost
        // TODO add your handling code here:
        if((txtVolunteerID.getText().matches("^[a-zA-Z]*$"))){
            lblVolunteerIDError.setText("Input invalid. Please enter only numbers");
        }
        else{
            lblVolunteerIDError.setText("");
        }
    }//GEN-LAST:event_txtVolunteerIDFocusLost

    private void txtVolunteerIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVolunteerIDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolunteerIDKeyReleased

    private void txtVolunteerAgeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolunteerAgeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolunteerAgeFocusLost

    private void txtVolunteerExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolunteerExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolunteerExpActionPerformed

    private void txtVolunteerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolunteerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolunteerNameActionPerformed
 
    private boolean nullCheck() {
        if(txtVolunteerID.getText().length()!=0 && txtVolunteerName.getText().length()!=0 && 
                txtVolunteerPhone.getText().length()!=0 && txtVolunteerAddress.getText().length()!=0 && txtVolunteerCity.getText().length()!=0 && 
                txtVolunteerState.getText().length()!=0 && txtVolunteerZip.getText().length()!=0 && txtVolunteerExp.getText().length()!=0 && 
                txtVolunteerUserName.getText().length()!=0 && txtVolunteerPassword.getText().length()!=0 && txtVolunteerConfPassword.getText().length()!=0)
            {
                return false;
            }
            else return true;
     }
    
    private void clearfields() {
        
        //setText is used to set the current text to be read from this StringCharacterIterator
        txtVolunteerName.setText("");
        txtVolunteerPhone.setText("");
        txtVolunteerAddress.setText("");
        txtVolunteerCity.setText("");
        txtVolunteerState.setText("");
        txtVolunteerZip.setText("");
        txtVolunteerExp.setText("");
        txtVolunteerUserName.setText("");
        txtVolunteerAge.setText("");
        txtVolunteerPassword.setText("");
        txtVolunteerConfPassword.setText("");
        txtVolunteerID.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImg;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblAddVolunteerTitle;
    private javax.swing.JLabel lblVolAdminError;
    private javax.swing.JLabel lblVolPasswordError;
    private javax.swing.JLabel lblVolunteerAddress;
    private javax.swing.JLabel lblVolunteerAge;
    private javax.swing.JLabel lblVolunteerCity;
    private javax.swing.JLabel lblVolunteerConfPassword;
    private javax.swing.JLabel lblVolunteerExp;
    private javax.swing.JLabel lblVolunteerID;
    private javax.swing.JLabel lblVolunteerIDError;
    private javax.swing.JLabel lblVolunteerName;
    private javax.swing.JLabel lblVolunteerNameError;
    private javax.swing.JLabel lblVolunteerPassword;
    private javax.swing.JLabel lblVolunteerPhnoError;
    private javax.swing.JLabel lblVolunteerPhone;
    private javax.swing.JLabel lblVolunteerState;
    private javax.swing.JLabel lblVolunteerUserName;
    private javax.swing.JLabel lblVolunteerZip;
    private javax.swing.JLabel lblVolunteerZipError;
    private javax.swing.JTextField txtVolunteerAddress;
    private javax.swing.JTextField txtVolunteerAge;
    private javax.swing.JTextField txtVolunteerCity;
    private javax.swing.JTextField txtVolunteerConfPassword;
    private javax.swing.JTextField txtVolunteerExp;
    private javax.swing.JTextField txtVolunteerID;
    private javax.swing.JTextField txtVolunteerName;
    private javax.swing.JTextField txtVolunteerPassword;
    private javax.swing.JTextField txtVolunteerPhone;
    private javax.swing.JTextField txtVolunteerState;
    private javax.swing.JTextField txtVolunteerUserName;
    private javax.swing.JTextField txtVolunteerZip;
    // End of variables declaration//GEN-END:variables

    private boolean chkpwd() {
        if(txtVolunteerPassword.getText().equals(txtVolunteerConfPassword.getText())){
            return true;
        }
        else{
            return false;
        }
    }
}
