/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RequestorRole;

import Business.EcoSystem;
import Business.FCPantry.FCPantry;
import Business.Reqorder.Reqorder;
import Business.Reqorder.ReqorderDirectory;
import Business.Requestor.Requestor;
import Business.UserAccount.UserAccount;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author anujashinde
 */
public class RequestFoodPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestFoodPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    String reqUName;
    String reqName;
    String reqState;
    ReqorderDirectory rqorD;
    public RequestFoodPanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAcc) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.ecosystem =ecosystem;
        this.userAcc = userAcc;
        reqUName = userAcc.getUsername();
        reqName  = userAcc.getEmployee().getName();
        if(ecosystem.getReqorderDirectory()== null){
         ecosystem.setReqorderDirectory(new ReqorderDirectory());
        }
        String reqState = ecosystem.getReqDir().getreqState(reqUName);
         ArrayList<String> CityList = new ArrayList<String>();
        for (FCPantry fcp : ecosystem.getFCPDirectory().getFcpList()){
            if(fcp.getFcpState().equals(reqState)){
                CityList.add(fcp.getFcpCity());
            }
        }         
        comboCity.setModel(new DefaultComboBoxModel<String>(CityList.toArray(new String[0])));
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

        lblReqFoodTitle = new javax.swing.JLabel();
        lblReqFood = new javax.swing.JLabel();
        sliderQty = new javax.swing.JSlider();
        lblDeliveryAddress = new javax.swing.JLabel();
        chkDeliveryAddress = new javax.swing.JCheckBox();
        lblDeliveryAdd = new javax.swing.JLabel();
        txtDeliveryAdd = new javax.swing.JTextField();
        lblDeliveryCity = new javax.swing.JLabel();
        txtDeliveryCity = new javax.swing.JTextField();
        lblDeliveryState = new javax.swing.JLabel();
        txtDeliveryState = new javax.swing.JTextField();
        lblDeliveryZip = new javax.swing.JLabel();
        txtDeliveryzip = new javax.swing.JTextField();
        lblDonateFoodCity = new javax.swing.JLabel();
        comboCity = new javax.swing.JComboBox<>();
        lblNearestPantry = new javax.swing.JLabel();
        comboPantry = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        lblMin = new javax.swing.JLabel();
        lblMax = new javax.swing.JLabel();
        lblPersons = new javax.swing.JLabel();
        lblDeliveryType = new javax.swing.JLabel();
        comboDelvieryType = new javax.swing.JComboBox<>();
        LabelImg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblReqFoodTitle.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        lblReqFoodTitle.setForeground(new java.awt.Color(255, 93, 119));
        lblReqFoodTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReqFoodTitle.setText("! Request Food !");
        add(lblReqFoodTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        lblReqFood.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblReqFood.setText("Request for");
        add(lblReqFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        sliderQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sliderQty.setMajorTickSpacing(10);
        sliderQty.setMinimum(10);
        sliderQty.setPaintTicks(true);
        sliderQty.setAutoscrolls(true);
        add(sliderQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        lblDeliveryAddress.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        lblDeliveryAddress.setForeground(new java.awt.Color(255, 93, 119));
        lblDeliveryAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeliveryAddress.setText("Delivery Address");
        add(lblDeliveryAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, -1, -1));

        chkDeliveryAddress.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        chkDeliveryAddress.setText("Same Address as in Profile");
        chkDeliveryAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDeliveryAddressActionPerformed(evt);
            }
        });
        add(chkDeliveryAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, -1, -1));

        lblDeliveryAdd.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblDeliveryAdd.setText("Address");
        add(lblDeliveryAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, -1, -1));

        txtDeliveryAdd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDeliveryAdd.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDeliveryAdd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDeliveryAddFocusLost(evt);
            }
        });
        add(txtDeliveryAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 230, 137, -1));

        lblDeliveryCity.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblDeliveryCity.setText("City");
        add(lblDeliveryCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 290, -1, -1));

        txtDeliveryCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDeliveryCity.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDeliveryCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDeliveryCityFocusLost(evt);
            }
        });
        add(txtDeliveryCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, 137, -1));

        lblDeliveryState.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblDeliveryState.setText("State");
        add(lblDeliveryState, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 330, -1, -1));

        txtDeliveryState.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDeliveryState.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDeliveryState.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDeliveryStateFocusLost(evt);
            }
        });
        add(txtDeliveryState, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 330, 137, -1));

        lblDeliveryZip.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblDeliveryZip.setText("Zipcode");
        add(lblDeliveryZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, -1, -1));

        txtDeliveryzip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDeliveryzip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDeliveryzip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDeliveryzipFocusLost(evt);
            }
        });
        add(txtDeliveryzip, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, 137, -1));

        lblDonateFoodCity.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblDonateFoodCity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDonateFoodCity.setText("Select city");
        add(lblDonateFoodCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        comboCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCityActionPerformed(evt);
            }
        });
        add(comboCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 180, -1));

        lblNearestPantry.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblNearestPantry.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNearestPantry.setText("Select a nearest pantry");
        add(lblNearestPantry, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        comboPantry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(comboPantry, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 180, -1));

        btnSubmit.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        btnSubmit.setText("Submit Request");
        btnSubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, -1, 30));

        lblMin.setFont(new java.awt.Font("Lucida Sans", 1, 10)); // NOI18N
        lblMin.setText("Min 10");
        add(lblMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        lblMax.setFont(new java.awt.Font("Lucida Sans", 1, 10)); // NOI18N
        lblMax.setText("Max 100");
        add(lblMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        lblPersons.setFont(new java.awt.Font("Lucida Sans", 1, 10)); // NOI18N
        lblPersons.setText("persons");
        add(lblPersons, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        lblDeliveryType.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblDeliveryType.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDeliveryType.setText("Select delivery type");
        add(lblDeliveryType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        comboDelvieryType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboDelvieryType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "Take Out", "Delivery" }));
        comboDelvieryType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDelvieryTypeActionPerformed(evt);
            }
        });
        add(comboDelvieryType, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 180, -1));
        add(LabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 1600, 850));
    }// </editor-fold>//GEN-END:initComponents

    private void chkDeliveryAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDeliveryAddressActionPerformed
        // TODO add your handling code here:
        if(chkDeliveryAddress.isSelected()){
            for(Requestor r: ecosystem.getReqDir().getReqAccList()){
                if(r.getReqUserName().equals(reqUName)){
                    txtDeliveryAdd.setText(r.getReqAddres());
                    txtDeliveryCity.setText(r.getReqCity());
                    txtDeliveryState.setText(r.getReqState());
                    txtDeliveryzip.setText(r.getReqZipcode());
                }
            }
        }
        else{
            txtDeliveryAdd.setText("");
            txtDeliveryCity.setText("");
            txtDeliveryState.setText("");
            txtDeliveryzip.setText("");
        }
    }//GEN-LAST:event_chkDeliveryAddressActionPerformed

    public void setBG() {
        try {
            LabelImg.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/blurbg.jpeg"));

            Image newimg = img.getScaledInstance(1650, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
            LabelImg.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(RequestFoodPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void txtDeliveryAddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDeliveryAddFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDeliveryAddFocusLost

    private void txtDeliveryCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDeliveryCityFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDeliveryCityFocusLost

    private void txtDeliveryStateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDeliveryStateFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDeliveryStateFocusLost

    private void txtDeliveryzipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDeliveryzipFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDeliveryzipFocusLost

    private void comboCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCityActionPerformed
        // TODO add your handling code here:
        String city=comboCity.getSelectedItem().toString();
        ArrayList<String> ptList = new ArrayList<String>();
        for (FCPantry fcp : ecosystem.getFCPDirectory().getFcpList()){
            if(fcp.getFcpCity().equals(city)){
                ptList.add(fcp.getFcpName());
            }
        }
        comboPantry.setModel(new DefaultComboBoxModel<String>(ptList.toArray(new String[0])));
    }//GEN-LAST:event_comboCityActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        //if(!nullCheck()){
            Reqorder rq= new Reqorder();
            rq.setReqOrderId("1");
            rq.setReqName(reqName);
            rq.setReqOrderQuant(String.valueOf(sliderQty.getValue()));
            rq.setReqOrderType(comboDelvieryType.getSelectedItem().toString());
            rq.setReqOrderStatus("Requested");
            rq.setReqPantryName(comboPantry.getSelectedItem().toString());
            UserAccount ua=new UserAccount();
            ua.setUsername(userAcc.getUsername());
            ua.setPassword(userAcc.getPassword());
            rq.setReqRequestorAcc(ua);
            
            //getText() will help to retrieve the text
            
            rq.setReqAdd(txtDeliveryAdd.getText());
            rq.setReqCity(txtDeliveryCity.getText());
            rq.setReqZip(txtDeliveryzip.getText());
            rqorD = ecosystem.getReqorderDirectory();
            rqorD.addNewReqorder(rq);
            ecosystem.setReqorderDirectory(rqorD);
            
            //after doing the donation and submitting the request you will get the message below 
            JOptionPane.showMessageDialog(this, "Your request has been placed. We love to serve you soon!");
            clearfields();
//        }
//        else{
         //   JOptionPane.showMessageDialog(this, "Please make sure that you have filled all mandatory fields");
        //}
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void comboDelvieryTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDelvieryTypeActionPerformed
        // TODO add your handling code here:
        if(comboDelvieryType.getSelectedIndex()==2){
            
            //The setVisible(true) method makes the frame appear on the screen
            
            lblDeliveryAddress.setVisible(true);
            chkDeliveryAddress.setVisible(true);
            lblDeliveryAdd.setVisible(true);
            txtDeliveryAdd.setVisible(true);
            lblDeliveryCity.setVisible(true);
            txtDeliveryCity.setVisible(true);
            lblDeliveryState.setVisible(true);
            txtDeliveryState.setVisible(true);
            lblDeliveryZip.setVisible(true);
            txtDeliveryzip.setVisible(true);
        }
        else{
            //The setVisible(false) method makes the frame invisible on the screen
           
            lblDeliveryAddress.setVisible(false);
            chkDeliveryAddress.setVisible(false);
            lblDeliveryAdd.setVisible(false);
            txtDeliveryAdd.setVisible(false);
            lblDeliveryCity.setVisible(false);
            txtDeliveryCity.setVisible(false);
            lblDeliveryState.setVisible(false);
            txtDeliveryState.setVisible(false);
            lblDeliveryZip.setVisible(false);
            txtDeliveryzip.setVisible(false);
        }
    }//GEN-LAST:event_comboDelvieryTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImg;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox chkDeliveryAddress;
    private javax.swing.JComboBox<String> comboCity;
    private javax.swing.JComboBox<String> comboDelvieryType;
    private javax.swing.JComboBox<String> comboPantry;
    private javax.swing.JLabel lblDeliveryAdd;
    private javax.swing.JLabel lblDeliveryAddress;
    private javax.swing.JLabel lblDeliveryCity;
    private javax.swing.JLabel lblDeliveryState;
    private javax.swing.JLabel lblDeliveryType;
    private javax.swing.JLabel lblDeliveryZip;
    private javax.swing.JLabel lblDonateFoodCity;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblNearestPantry;
    private javax.swing.JLabel lblPersons;
    private javax.swing.JLabel lblReqFood;
    private javax.swing.JLabel lblReqFoodTitle;
    private javax.swing.JSlider sliderQty;
    private javax.swing.JTextField txtDeliveryAdd;
    private javax.swing.JTextField txtDeliveryCity;
    private javax.swing.JTextField txtDeliveryState;
    private javax.swing.JTextField txtDeliveryzip;
    // End of variables declaration//GEN-END:variables

    private void clearfields() {
        txtDeliveryAdd.setText("");
        txtDeliveryCity.setText("");
        txtDeliveryState.setText("");
        txtDeliveryzip.setText("");
        comboCity.setSelectedIndex(0);
        comboPantry.setSelectedIndex(0);
        sliderQty.setExtent(0);
        chkDeliveryAddress.setSelected(false);
        comboCity.setSelectedIndex(0);
        comboPantry.setSelectedIndex(0);
        comboDelvieryType.setSelectedIndex(0);
    }
}
