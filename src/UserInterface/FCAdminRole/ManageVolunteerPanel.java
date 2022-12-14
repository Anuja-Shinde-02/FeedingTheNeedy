/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.FCAdminRole;

import Business.EcoSystem;
import Business.FCWarehouse.FCWarehouse;
import Business.NGO.NGO;
import Business.NGOVolunteer.VolRequests;
import Business.NGOVolunteer.VolRequestsDirectory;
import Business.NGOVolunteer.Volunteer;
import Business.NGOVolunteer.VolunteerDirectory;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anujashinde
 */
public class ManageVolunteerPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageVolunteerPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    VolunteerDirectory vold;
    VolRequestsDirectory vrD;
    String WHname;
    String city;
    public ManageVolunteerPanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc = userAcc;
        populateTable();
         if(ecosystem.getVRDirectory() == null){
         ecosystem.setVRDirectory(new VolRequestsDirectory());
        }
        for(FCWarehouse fcw:ecosystem.getFCWDirectory().getFcwList()){
            if(fcw.getFcwAdmin().equals(userAcc.getEmployee().getName())){
              city=fcw.getFcwCity();
            }
        }
        ArrayList<String> ngoList = new ArrayList();
        for (NGO ng : ecosystem.getNgoDir().getNgoList()){
            if(ng.getNgoCity().equals(city)){
            ngoList.add(ng.getNgoName());
            }
        }
        comboVolunteers.setModel(new DefaultComboBoxModel<String>(ngoList.toArray(new String[0])));
        for(FCWarehouse fcw: ecosystem.getFCWDirectory().getFcwList()){
            if(fcw.getFcwAdmin().equals(userAcc.getEmployee().getName())){
                WHname=fcw.getFcwName();
            }
        }

        lblNoVolunteersReq.setVisible(false);
        comboQty.setVisible(false);

        setBG();
        makeTableTransparent();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVolunteerProfileTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVolunteers = new javax.swing.JTable();
        lblRequestVolunteer = new javax.swing.JLabel();
        lblNoVolunteersReq = new javax.swing.JLabel();
        comboQty = new javax.swing.JComboBox<>();
        btnRequest = new javax.swing.JButton();
        lblSelectNGO = new javax.swing.JLabel();
        comboVolunteers = new javax.swing.JComboBox<>();
        LabelImg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblVolunteerProfileTitle.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        lblVolunteerProfileTitle.setForeground(new java.awt.Color(255, 93, 119));
        lblVolunteerProfileTitle.setText("! Manage Volunteers !");

        tblVolunteers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Volunteer Id", "Name", "Phone Number", "Address", "City", "Zipcode", "Available?"
            }
        ));
        tblVolunteers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblVolunteersMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblVolunteers);

        lblRequestVolunteer.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        lblRequestVolunteer.setForeground(new java.awt.Color(255, 93, 119));
        lblRequestVolunteer.setText("Request Volunteers");

        lblNoVolunteersReq.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblNoVolunteersReq.setText("Number of Volunteers Required :");

        comboQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "1", "2", "3", "4", "5" }));

        btnRequest.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        btnRequest.setText("Submit Request");
        btnRequest.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        lblSelectNGO.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblSelectNGO.setText("Select a NGO :");

        comboVolunteers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1427, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(lblRequestVolunteer, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(492, 492, 492)
                .addComponent(comboVolunteers, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(lblSelectNGO))
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(lblNoVolunteersReq))
            .addComponent(LabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 1430, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(492, 492, 492)
                .addComponent(comboQty, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(lblVolunteerProfileTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(btnRequest))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblVolunteerProfileTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblRequestVolunteer)
                        .addGap(31, 31, 31)
                        .addComponent(comboVolunteers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(lblSelectNGO))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(comboQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(lblNoVolunteersReq)))
                .addGap(18, 18, 18)
                .addComponent(btnRequest, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

        public void setBG() {
        try {
            LabelImg.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/blurbg.jpeg"));

            Image newimg = img.getScaledInstance(1500, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
            LabelImg.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {

        }
    }

    public void makeTableTransparent() {
        tblVolunteers.setOpaque(false);
        ((DefaultTableCellRenderer) tblVolunteers.getDefaultRenderer(Object.class)).setOpaque(false);
        tblVolunteers.setShowGrid(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);

        for (int i = 0; i < tblVolunteers.getModel().getColumnCount(); i++) {
            tblVolunteers.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }
    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        VolRequests vr = new VolRequests();
        vr.setVolreqId("1");
        vr.setVolreqName(comboVolunteers.getSelectedItem().toString());
        vr.setVolreqNum("1");
        vr.setVolreqWH(WHname);
        vr.setVolreqStatus("Requested");
        vrD = ecosystem.getVRDirectory();
        vrD.addVR(vr);
       ecosystem.setVRDirectory(vrD);
       
        //JOptionPane.showMessageDialog is used to create an information-message dialog titled "Message"
        //request send toi NGO successfully 
        JOptionPane.showMessageDialog(this, "Your request has been sent to NGO");
    }//GEN-LAST:event_btnRequestActionPerformed

    private void tblVolunteersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVolunteersMousePressed
        // TODO add your handling code here:
        tblVolunteers.setSelectionForeground(Color.BLUE);
    }//GEN-LAST:event_tblVolunteersMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImg;
    private javax.swing.JButton btnRequest;
    private javax.swing.JComboBox<String> comboQty;
    private javax.swing.JComboBox<String> comboVolunteers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNoVolunteersReq;
    private javax.swing.JLabel lblRequestVolunteer;
    private javax.swing.JLabel lblSelectNGO;
    private javax.swing.JLabel lblVolunteerProfileTitle;
    private javax.swing.JTable tblVolunteers;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblVolunteers.getModel();
        model.setRowCount(0);
        for(Volunteer vol: ecosystem.getVolDir().getVolunteerList()){
            if(vol.getVolAvail().equals("Yes")){
           Object[] row = new Object[7];
           row[0] =vol;
           row[1] =vol.getVolName();
           row[2] =vol.getVolPhno();
           row[3] =vol.getVolAddress();
           row[4] =vol.getVolCity();
           row[5] =vol.getVolZipcode();
           row[6] =vol.getVolAvail();
           model.addRow(row);
            }
        } 
    }
}
