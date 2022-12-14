/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGORole;

import Business.EcoSystem;
import Business.NGOVolunteer.Volunteer;
import Business.NGOVolunteer.VolunteerDirectory;
import Business.UserAccount.UserAccount;
import java.awt.Color;
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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anujashinde
 */
public class ViewModifyVolunteerPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewModifyVolunteerPanel
     */
    JPanel userProcessContainer;
    VolunteerDirectory vold;
    EcoSystem ecosystem;
    String ngoName;
    public ViewModifyVolunteerPanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        if(ecosystem.getVolDir() == null){
              ecosystem.setVolDir(new VolunteerDirectory());
          }
        ngoName = userAcc.getEmployee().getName();
        populatevoltable();
        setBG();
        makeTableTransparent1();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVolunteerModifyTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVolunteer = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblWHname1 = new javax.swing.JLabel();
        lblVolunteerID = new javax.swing.JLabel();
        lblVolunteerID1 = new javax.swing.JLabel();
        lblVolunteerName = new javax.swing.JLabel();
        txtVolunteerName = new javax.swing.JTextField();
        lblVolunteerPhone = new javax.swing.JLabel();
        txtVolunteerPhone = new javax.swing.JTextField();
        lblVolunteerAddress = new javax.swing.JLabel();
        txtVolunteerAddress = new javax.swing.JTextField();
        lblVolunteerCity = new javax.swing.JLabel();
        txtVolunteerCity = new javax.swing.JTextField();
        lblVolunteerState = new javax.swing.JLabel();
        lblVolunteerAge = new javax.swing.JLabel();
        txtVolunteerAge = new javax.swing.JTextField();
        txtVolunteerState = new javax.swing.JTextField();
        lblVolunteerZip = new javax.swing.JLabel();
        txtVolunteerZip = new javax.swing.JTextField();
        lblVolunteerExp = new javax.swing.JLabel();
        txtVolunteerExp = new javax.swing.JTextField();
        lblVolunteerUsername = new javax.swing.JLabel();
        txtVolunteerUsername = new javax.swing.JTextField();
        lblVolunteerPassword = new javax.swing.JLabel();
        txtVolunteerConfPassword = new javax.swing.JTextField();
        lblVolZipError = new javax.swing.JLabel();
        lblVolPhnoError = new javax.swing.JLabel();
        lblVolPasswordError = new javax.swing.JLabel();
        LabelImg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVolunteerModifyTitle.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        lblVolunteerModifyTitle.setForeground(new java.awt.Color(255, 93, 119));
        lblVolunteerModifyTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVolunteerModifyTitle.setText("! View/Modify Volunteer !");
        add(lblVolunteerModifyTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        tblVolunteer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Volunteer Id", "Name", "Age", "Phone Number", "Address", "City", "State", "Zipcode", "Experience"
            }
        ));
        jScrollPane1.setViewportView(tblVolunteer);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 972, 118));

        btnDelete.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 92, -1));

        btnEdit.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 92, -1));

        btnUpdate.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 650, 90, 30));

        lblWHname1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblWHname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 73, -1, -1));

        lblVolunteerID.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerID.setText("Volunteer Id:");
        add(lblVolunteerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 176, -1, -1));

        lblVolunteerID1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblVolunteerID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 176, 90, 20));

        lblVolunteerName.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerName.setText("Volunteer Name");
        add(lblVolunteerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 194, -1, -1));

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
        add(txtVolunteerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 190, 137, -1));

        lblVolunteerPhone.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerPhone.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerPhone.setText("Phone Number");
        add(lblVolunteerPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 280, -1, -1));

        txtVolunteerPhone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolunteerPhone.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolunteerPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolunteerPhoneFocusLost(evt);
            }
        });
        add(txtVolunteerPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 276, 137, -1));

        lblVolunteerAddress.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerAddress.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerAddress.setText("Address");
        add(lblVolunteerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        txtVolunteerAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolunteerAddress.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolunteerAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolunteerAddressActionPerformed(evt);
            }
        });
        add(txtVolunteerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 319, 137, -1));

        lblVolunteerCity.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerCity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerCity.setText("City");
        add(lblVolunteerCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        txtVolunteerCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolunteerCity.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtVolunteerCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 362, 137, -1));

        lblVolunteerState.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerState.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerState.setText("State");
        add(lblVolunteerState, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        lblVolunteerAge.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerAge.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerAge.setText("Volunteer Age");
        add(lblVolunteerAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 237, -1, -1));

        txtVolunteerAge.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolunteerAge.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolunteerAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolunteerAgeFocusLost(evt);
            }
        });
        add(txtVolunteerAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 233, 137, -1));

        txtVolunteerState.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolunteerState.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolunteerState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolunteerStateActionPerformed(evt);
            }
        });
        add(txtVolunteerState, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 405, 137, -1));

        lblVolunteerZip.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerZip.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerZip.setText("Zipcode");
        add(lblVolunteerZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));

        txtVolunteerZip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolunteerZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolunteerZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolunteerZipFocusLost(evt);
            }
        });
        add(txtVolunteerZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 137, -1));

        lblVolunteerExp.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerExp.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerExp.setText("Volunteer Experience");
        add(lblVolunteerExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 497, -1, 20));

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
        add(txtVolunteerExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 491, 137, -1));

        lblVolunteerUsername.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerUsername.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerUsername.setText("Volunteer Username");
        add(lblVolunteerUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 538, -1, -1));

        txtVolunteerUsername.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolunteerUsername.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtVolunteerUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 534, 137, -1));

        lblVolunteerPassword.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblVolunteerPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVolunteerPassword.setText("Password");
        add(lblVolunteerPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 581, -1, -1));

        txtVolunteerConfPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolunteerConfPassword.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtVolunteerConfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 577, 137, -1));
        add(lblVolZipError, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 140, 20));
        add(lblVolPhnoError, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 140, 20));
        add(lblVolPasswordError, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 580, 140, 20));

        LabelImg.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        add(LabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 1500, 990));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblVolunteer.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a record to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblVolunteer.getModel();
        Volunteer selectedvol = (Volunteer)model.getValueAt(selectedRowIndex, 0);
        ecosystem.getUserAccountDirectory().deleteUserAccount(
                ecosystem.getVolDir().getVolunteerList().get(selectedRowIndex).getVolAccount());
        vold= ecosystem.getVolDir();
        vold.deleteVolunteer(selectedvol);
        ecosystem.setVolDir(vold);
        
         //JOptionPane.showMessageDialog is used to create an information-message dialog titled "Message"
        //volunteer is deleted in the process successfully 
        
        JOptionPane.showMessageDialog(this, "Volunteer deleted successfully");
        populatevoltable();
        clearfields();
        lblVolunteerID1.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed

    public void setBG() {
        try {
            LabelImg.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/blurbg.jpeg"));

            Image newimg = img.getScaledInstance(1650, 900, java.awt.Image.SCALE_SMOOTH);
            LabelImg.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(ViewModifyVolunteerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public void makeTableTransparent1() {
        tblVolunteer.setOpaque(false);
        ((DefaultTableCellRenderer) tblVolunteer.getDefaultRenderer(Object.class)).setOpaque(false);
        tblVolunteer.setShowGrid(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);

        for (int i = 0; i < tblVolunteer.getModel().getColumnCount(); i++) {
            tblVolunteer.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }
    
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblVolunteer.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a record to edit");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblVolunteer.getModel();
        Volunteer selectedvol = (Volunteer)model.getValueAt(selectedRowIndex, 0);
        
        //setText is used to set the current text to be read from this StringCharacterIterator
        lblVolunteerID1.setText(selectedvol.getVolId());
        txtVolunteerName.setText(selectedvol.getVolName());
        txtVolunteerAge.setText(selectedvol.getVolAge());
        txtVolunteerPhone.setText(selectedvol.getVolPhno());
        txtVolunteerAddress.setText(selectedvol.getVolAddress());
        txtVolunteerCity.setText(selectedvol.getVolCity());
        txtVolunteerState.setText(selectedvol.getVolState());
        txtVolunteerZip.setText(selectedvol.getVolZipcode());
        txtVolunteerExp.setText(selectedvol.getVolExp());
        txtVolunteerUsername.setText(selectedvol.getVolAccount().getUsername());
        txtVolunteerConfPassword.setText(selectedvol.getVolAccount().getPassword());
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblVolunteer.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a record to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblVolunteer.getModel();
        String volid = lblVolunteerID1.getText();

        ArrayList<Volunteer> volList = ecosystem.getVolDir().getVolunteerList();
        for(Volunteer vol: volList)
        {
            if(vol.getVolId().equals(volid))
            {
                  //The get method returns the variable name's value.
                 //The name variable is given a parameter (newName), which is assigned via the set method.
                vol.setVolName(txtVolunteerName.getText());
                vol.setVolAge(txtVolunteerAge.getText());
                vol.setVolPhno(txtVolunteerPhone.getText());
                vol.setVolAddress(txtVolunteerAddress.getText());
                vol.setVolCity(txtVolunteerCity.getText());
                vol.setVolState(txtVolunteerState.getText());
                vol.setVolZipcode(txtVolunteerZip.getText());
                vol.setVolExp(txtVolunteerExp.getText());
//                UserAccount volua=new UserAccount();
//                volua.setUsername(txtVoluname.getText());
//                volua.setPassword(txtVolpwd.getText());
//                if(vol.getVolAccount().getUsername().equals(txtVoluname.getText())){
//                    Employee emp=new Employee();
//                    emp.setName(txtvolAdmin.getText());
//                    vol.getVolAccount().setPassword(txtVolpwd.getText());
//                    vol.getVolAccount().setEmployee(emp);
//                }
                if(vol.getVolAccount().getUsername().equals(txtVolunteerUsername.getText())){
                    vol.getVolAccount().setPassword(txtVolunteerConfPassword.getText());
                    vol.getVolAccount().getEmployee().setName(txtVolunteerName.getText());
                }
                //vol.setVolAccount(volua);
                break;
            }

        }
        // ecosystem.setFCWDirectory(fcwList);
        vold = ecosystem.getVolDir();
        ecosystem.setVolDir(vold);
        
        //with update button volunteer details are updated
        JOptionPane.showMessageDialog(this, "Volunteer details updated successfully");
        clearfields();
        populatevoltable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtVolunteerNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolunteerNameFocusLost
        // TODO add your handling code here:
//        if(!(txtVolname.getText().matches("^[a-zA-Z]*$"))){
//            lblVolname1.setText("Invalid input. Please enter only alphabets");
//        }
//        else{
//            lblVolname1.setText("");
//        }
    }//GEN-LAST:event_txtVolunteerNameFocusLost

    private void txtVolunteerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolunteerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolunteerNameActionPerformed

    private void txtVolunteerPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolunteerPhoneFocusLost
        // TODO add your handling code here:
        if(!(txtVolunteerPhone.getText().matches("^[0-9]*$")) || !(txtVolunteerPhone.getText().length()==10)) {
            lblVolPhnoError.setText("Please enter a valid phone number");
        }
        else{
            lblVolPhnoError.setText("");

        }
    }//GEN-LAST:event_txtVolunteerPhoneFocusLost

    private void txtVolunteerAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolunteerAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolunteerAddressActionPerformed

    private void txtVolunteerAgeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolunteerAgeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolunteerAgeFocusLost

    private void txtVolunteerZipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolunteerZipFocusLost
        // TODO add your handling code here:
        if((txtVolunteerZip.getText().matches("^[a-zA-Z]*$"))){
            lblVolZipError.setText("Input invalid. Please enter only numbers");
        }
        else{
            lblVolZipError.setText("");
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

    private void txtVolunteerExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolunteerExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolunteerExpActionPerformed

    private void txtVolunteerStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolunteerStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolunteerStateActionPerformed

    private void clearfields() {
        
        //setText is used to set the current text to be read from this StringCharacterIterator
        txtVolunteerName.setText("");
        txtVolunteerPhone.setText("");
        txtVolunteerAddress.setText("");
        txtVolunteerCity.setText("");
        txtVolunteerState.setText("");
        txtVolunteerZip.setText("");
        txtVolunteerExp.setText("");
        txtVolunteerUsername.setText("");
        txtVolunteerConfPassword.setText("");
        txtVolunteerAge.setText("");
        lblVolunteerID1.setText("");
    }
    
    private void populatevoltable() {
        DefaultTableModel model = (DefaultTableModel) tblVolunteer.getModel();
        model.setRowCount(0);
        for(Volunteer vol: ecosystem.getVolDir().getVolunteerList()){
           if(vol.getVolNGO().equals(ngoName)){
           Object[] row = new Object[9];
           row[0] =vol;
           row[1] =vol.getVolName();
           row[2] =vol.getVolAge();
           row[3] =vol.getVolPhno();
           row[4] =vol.getVolAddress();
           row[5] =vol.getVolCity();
           row[6] =vol.getVolState();
           row[7] =vol.getVolZipcode();
           row[8] =vol.getVolExp();
           model.addRow(row);
           }
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImg;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblVolPasswordError;
    private javax.swing.JLabel lblVolPhnoError;
    private javax.swing.JLabel lblVolZipError;
    private javax.swing.JLabel lblVolunteerAddress;
    private javax.swing.JLabel lblVolunteerAge;
    private javax.swing.JLabel lblVolunteerCity;
    private javax.swing.JLabel lblVolunteerExp;
    private javax.swing.JLabel lblVolunteerID;
    private javax.swing.JLabel lblVolunteerID1;
    private javax.swing.JLabel lblVolunteerModifyTitle;
    private javax.swing.JLabel lblVolunteerName;
    private javax.swing.JLabel lblVolunteerPassword;
    private javax.swing.JLabel lblVolunteerPhone;
    private javax.swing.JLabel lblVolunteerState;
    private javax.swing.JLabel lblVolunteerUsername;
    private javax.swing.JLabel lblVolunteerZip;
    private javax.swing.JLabel lblWHname1;
    private javax.swing.JTable tblVolunteer;
    private javax.swing.JTextField txtVolunteerAddress;
    private javax.swing.JTextField txtVolunteerAge;
    private javax.swing.JTextField txtVolunteerCity;
    private javax.swing.JTextField txtVolunteerConfPassword;
    private javax.swing.JTextField txtVolunteerExp;
    private javax.swing.JTextField txtVolunteerName;
    private javax.swing.JTextField txtVolunteerPhone;
    private javax.swing.JTextField txtVolunteerState;
    private javax.swing.JTextField txtVolunteerUsername;
    private javax.swing.JTextField txtVolunteerZip;
    // End of variables declaration//GEN-END:variables
}
