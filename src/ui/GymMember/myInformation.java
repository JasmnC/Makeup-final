/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.GymMember;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author yuujadz
 */
public class MyInformation extends javax.swing.JPanel {

    /**
     * Creates new form requestManager
     */
    public MyInformation() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        lblImage = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMobile1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtMobile2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblImage1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("<<back");
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Email:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 100, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Photo:");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("User Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Area:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 100, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Age:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Gender:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 100, -1));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Mobile:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, -1));

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Name:");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, -1));

        txtArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaActionPerformed(evt);
            }
        });
        txtArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAreaKeyPressed(evt);
            }
        });
        add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 190, 30));

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeKeyPressed(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 190, 30));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 190, 30));
        add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 190, 30));

        jRadioButton1.setText("N");
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 60, -1));

        jRadioButton2.setText("M");
        add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 50, -1));

        jRadioButton3.setText("F");
        add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 50, -1));
        add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 160, 190));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 190, 30));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 190, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel2.setText("My Information");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });
        txtWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtWeightKeyPressed(evt);
            }
        });
        add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 190, 30));
        add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 190, 30));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Height:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 100, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Weight:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 100, -1));
        add(txtMobile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 290, 70));

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Comment from personal trainer:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 270, 20));
        add(txtMobile2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 290, 70));

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Comment from fittness consultant:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 270, 20));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Inbody:");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));
        add(lblImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 160, 190));
    }// </editor-fold>//GEN-END:initComponents

    private void txtAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaActionPerformed

    private void txtAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaKeyPressed
        // TODO add your handling code here:
        char c  = evt.getKeyChar();
        if(Character.isDigit(c)||c==KeyEvent.VK_BACK_SPACE){
            txtArea.setEditable(true);
        }else{
            txtArea.setEditable(false);
        }
    }//GEN-LAST:event_txtAreaKeyPressed

    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyPressed
        // TODO add your handling code here:
        char c  = evt.getKeyChar();
        if(Character.isDigit(c)||c==KeyEvent.VK_BACK_SPACE){
            txtAge.setEditable(true);
        }else{
            txtAge.setEditable(false);
        }
    }//GEN-LAST:event_txtAgeKeyPressed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtWeightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWeightKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblImage1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtMobile1;
    private javax.swing.JTextField txtMobile2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
