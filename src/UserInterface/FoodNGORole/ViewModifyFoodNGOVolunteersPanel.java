/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FoodNGORole;

import Business.EcoSystem;
import Business.Employees.Employees;
import Business.FoodNGOVolunteers.FoodNGOVolunteers;
import Business.FoodNGOVolunteers.FoodNGOVolunteersDirectory;
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
import userinterface.DonorRole.DonorProfilePanel;

/**
 *
 * @author anujashinde
 */
public class ViewModifyFoodNGOVolunteersPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewModifyFoodNGOVolunteersPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    FoodNGOVolunteersDirectory vold;
    String ngoName;
    public ViewModifyFoodNGOVolunteersPanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        if(ecosystem.getVolDir() == null){
              ecosystem.setVolDir(new FoodNGOVolunteersDirectory());
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

        lblAddVolTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVolunteer = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblWHname1 = new javax.swing.JLabel();
        lblvolid = new javax.swing.JLabel();
        lblvolid1 = new javax.swing.JLabel();
        lblVolname = new javax.swing.JLabel();
        txtVolname = new javax.swing.JTextField();
        lblVolPhno = new javax.swing.JLabel();
        txtVolPhno = new javax.swing.JTextField();
        lblVolAdd = new javax.swing.JLabel();
        txtVolAdd = new javax.swing.JTextField();
        lblVolCity = new javax.swing.JLabel();
        txtVolCity = new javax.swing.JTextField();
        lblVolState = new javax.swing.JLabel();
        lblVolage = new javax.swing.JLabel();
        txtVolage = new javax.swing.JTextField();
        txtVolState = new javax.swing.JTextField();
        lblVolZip = new javax.swing.JLabel();
        txtVolZip = new javax.swing.JTextField();
        lblVolExp = new javax.swing.JLabel();
        txtVolExp = new javax.swing.JTextField();
        lblVoluname = new javax.swing.JLabel();
        txtVoluname = new javax.swing.JTextField();
        lblVolpwd = new javax.swing.JLabel();
        txtVolpwd = new javax.swing.JTextField();
        lblVolZip1 = new javax.swing.JLabel();
        lblVolPhno1 = new javax.swing.JLabel();
        lblVolpwd2 = new javax.swing.JLabel();
        LabelImg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddVolTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblAddVolTitle.setForeground(new java.awt.Color(51, 153, 255));
        lblAddVolTitle.setText("View/Modify Volunteer");
        add(lblAddVolTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 13, -1, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 972, 118));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 170, 92, -1));

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 170, 92, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 614, 92, -1));

        lblWHname1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblWHname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 73, -1, -1));

        lblvolid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblvolid.setText("Volunteer Id:");
        add(lblvolid, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 176, -1, -1));

        lblvolid1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add(lblvolid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 176, -1, -1));

        lblVolname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolname.setText("Volunteer Name");
        add(lblVolname, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 194, -1, -1));

        txtVolname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolnameFocusLost(evt);
            }
        });
        txtVolname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolnameActionPerformed(evt);
            }
        });
        add(txtVolname, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 190, 137, -1));

        lblVolPhno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolPhno.setText("Phone Number");
        add(lblVolPhno, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 280, -1, -1));

        txtVolPhno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolPhno.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolPhno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolPhnoFocusLost(evt);
            }
        });
        add(txtVolPhno, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 276, 137, -1));

        lblVolAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolAdd.setText("Address");
        add(lblVolAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 323, -1, -1));

        txtVolAdd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolAdd.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolAddActionPerformed(evt);
            }
        });
        add(txtVolAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 319, 137, -1));

        lblVolCity.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolCity.setText("City");
        add(lblVolCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 366, -1, -1));

        txtVolCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolCity.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtVolCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 362, 137, -1));

        lblVolState.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolState.setText("State");
        add(lblVolState, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 409, -1, -1));

        lblVolage.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolage.setText("Volunteer Age");
        add(lblVolage, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 237, -1, -1));

        txtVolage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolage.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolageFocusLost(evt);
            }
        });
        add(txtVolage, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 233, 137, -1));

        txtVolState.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolState.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolStateActionPerformed(evt);
            }
        });
        add(txtVolState, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 405, 137, -1));

        lblVolZip.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolZip.setText("Zipcode");
        add(lblVolZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 452, -1, -1));

        txtVolZip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolZipFocusLost(evt);
            }
        });
        add(txtVolZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 448, 137, -1));

        lblVolExp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolExp.setText("Volunteer Experience");
        add(lblVolExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 495, -1, -1));

        txtVolExp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolExp.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolExp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolExpFocusLost(evt);
            }
        });
        txtVolExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolExpActionPerformed(evt);
            }
        });
        add(txtVolExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 491, 137, -1));

        lblVoluname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVoluname.setText("Volunteer Username");
        add(lblVoluname, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 538, -1, -1));

        txtVoluname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVoluname.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtVoluname, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 534, 137, -1));

        lblVolpwd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolpwd.setText("Password");
        add(lblVolpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 581, -1, -1));

        txtVolpwd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolpwd.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtVolpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 577, 137, -1));
        add(lblVolZip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 457, -1, -1));
        add(lblVolPhno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 285, -1, -1));
        add(lblVolpwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 586, -1, -1));
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
        FoodNGOVolunteers selectedvol = (FoodNGOVolunteers)model.getValueAt(selectedRowIndex, 0);
        ecosystem.getUserAccountDirectory().deleteUserAccount(
                ecosystem.getVolDir().getVolunteerList().get(selectedRowIndex).getVolAccount());
        vold= ecosystem.getVolDir();
        vold.deleteVolunteer(selectedvol);
        ecosystem.setVolDir(vold);
        JOptionPane.showMessageDialog(this, "Volunteer deleted Successfully");
        populatevoltable();
        clearfields();
        lblvolid1.setText("");
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
            Logger.getLogger(ViewModifyFoodNGOVolunteersPanel.class.getName()).log(Level.SEVERE, null, ex);
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
            JOptionPane.showMessageDialog(this, "Please select a record to Edit");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblVolunteer.getModel();
        FoodNGOVolunteers selectedvol = (FoodNGOVolunteers)model.getValueAt(selectedRowIndex, 0);
        lblvolid1.setText(selectedvol.getVolId());
        txtVolname.setText(selectedvol.getVolName());
        txtVolage.setText(selectedvol.getVolAge());
        txtVolPhno.setText(selectedvol.getVolPhno());
        txtVolAdd.setText(selectedvol.getVolAddress());
        txtVolCity.setText(selectedvol.getVolCity());
        txtVolState.setText(selectedvol.getVolState());
        txtVolZip.setText(selectedvol.getVolZipcode());
        txtVolExp.setText(selectedvol.getVolExp());
        txtVoluname.setText(selectedvol.getVolAccount().getUsername());
        txtVolpwd.setText(selectedvol.getVolAccount().getPassword());
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblVolunteer.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a record to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblVolunteer.getModel();
        String volid = lblvolid1.getText();

        ArrayList<FoodNGOVolunteers> volList = ecosystem.getVolDir().getVolunteerList();
        for(FoodNGOVolunteers vol: volList)
        {
            if(vol.getVolId().equals(volid))
            {
                vol.setVolName(txtVolname.getText());
                vol.setVolAge(txtVolage.getText());
                vol.setVolPhno(txtVolPhno.getText());
                vol.setVolAddress(txtVolAdd.getText());
                vol.setVolCity(txtVolCity.getText());
                vol.setVolState(txtVolState.getText());
                vol.setVolZipcode(txtVolZip.getText());
                vol.setVolExp(txtVolExp.getText());
//                UserAccount volua=new UserAccount();
//                volua.setUsername(txtVoluname.getText());
//                volua.setPassword(txtVolpwd.getText());
//                if(vol.getVolAccount().getUsername().equals(txtVoluname.getText())){
//                    Employees emp=new Employees();
//                    emp.setName(txtvolAdmin.getText());
//                    vol.getVolAccount().setPassword(txtVolpwd.getText());
//                    vol.getVolAccount().setEmployee(emp);
//                }
                if(vol.getVolAccount().getUsername().equals(txtVoluname.getText())){
                    vol.getVolAccount().setPassword(txtVolpwd.getText());
                    vol.getVolAccount().getEmployee().setName(txtVolname.getText());
                }
                //vol.setVolAccount(volua);
                break;
            }

        }
        // ecosystem.setFCWDirectory(fcwList);
        vold = ecosystem.getVolDir();
        ecosystem.setVolDir(vold);
        JOptionPane.showMessageDialog(this, "Volunteer details updated successfully");
        clearfields();
        populatevoltable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtVolnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolnameFocusLost
        // TODO add your handling code here:
//        if(!(txtVolname.getText().matches("^[a-zA-Z]*$"))){
//            lblVolname1.setText("Invalid input. Please enter only alphabets");
//        }
//        else{
//            lblVolname1.setText("");
//        }
    }//GEN-LAST:event_txtVolnameFocusLost

    private void txtVolnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolnameActionPerformed

    private void txtVolPhnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolPhnoFocusLost
        // TODO add your handling code here:
        if(!(txtVolPhno.getText().matches("^[0-9]*$")) || !(txtVolPhno.getText().length()==10)) {
            lblVolPhno1.setText("Please enter a valid phone number");
        }
        else{
            lblVolPhno1.setText("");

        }
    }//GEN-LAST:event_txtVolPhnoFocusLost

    private void txtVolAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolAddActionPerformed

    private void txtVolageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolageFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolageFocusLost

    private void txtVolZipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolZipFocusLost
        // TODO add your handling code here:
        if((txtVolZip.getText().matches("^[a-zA-Z]*$"))){
            lblVolZip1.setText("Invalid input. Please enter only numbers");
        }
        else{
            lblVolZip1.setText("");
        }
    }//GEN-LAST:event_txtVolZipFocusLost

    private void txtVolExpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolExpFocusLost
        // TODO add your handling code here:
        //        if(!(txtVolExp.getText().matches("^[a-zA-Z]*$"))){
            //            lblVolAdmin1.setText("Invalid input. Please enter only alphabets.");
            //        }
        //        else{
            //            lblVolAdmin1.setText("");
            //        }
    }//GEN-LAST:event_txtVolExpFocusLost

    private void txtVolExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolExpActionPerformed

    private void txtVolStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolStateActionPerformed

    private void clearfields() {
        txtVolname.setText("");
        txtVolPhno.setText("");
        txtVolAdd.setText("");
        txtVolCity.setText("");
        txtVolState.setText("");
        txtVolZip.setText("");
        txtVolExp.setText("");
        txtVoluname.setText("");
        txtVolpwd.setText("");
        txtVolage.setText("");
        lblvolid1.setText("");
    }
    
    private void populatevoltable() {
        DefaultTableModel model = (DefaultTableModel) tblVolunteer.getModel();
        model.setRowCount(0);
        for(FoodNGOVolunteers vol: ecosystem.getVolDir().getVolunteerList()){
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
    private javax.swing.JLabel lblAddVolTitle;
    private javax.swing.JLabel lblVolAdd;
    private javax.swing.JLabel lblVolCity;
    private javax.swing.JLabel lblVolExp;
    private javax.swing.JLabel lblVolPhno;
    private javax.swing.JLabel lblVolPhno1;
    private javax.swing.JLabel lblVolState;
    private javax.swing.JLabel lblVolZip;
    private javax.swing.JLabel lblVolZip1;
    private javax.swing.JLabel lblVolage;
    private javax.swing.JLabel lblVolname;
    private javax.swing.JLabel lblVolpwd;
    private javax.swing.JLabel lblVolpwd2;
    private javax.swing.JLabel lblVoluname;
    private javax.swing.JLabel lblWHname1;
    private javax.swing.JLabel lblvolid;
    private javax.swing.JLabel lblvolid1;
    private javax.swing.JTable tblVolunteer;
    private javax.swing.JTextField txtVolAdd;
    private javax.swing.JTextField txtVolCity;
    private javax.swing.JTextField txtVolExp;
    private javax.swing.JTextField txtVolPhno;
    private javax.swing.JTextField txtVolState;
    private javax.swing.JTextField txtVolZip;
    private javax.swing.JTextField txtVolage;
    private javax.swing.JTextField txtVolname;
    private javax.swing.JTextField txtVolpwd;
    private javax.swing.JTextField txtVoluname;
    // End of variables declaration//GEN-END:variables
}
