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
public class ProcessPayment extends javax.swing.JPanel {

    /**
     * Creates new form requestManager
     */
    public ProcessPayment() {
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
        jLabel2 = new javax.swing.JLabel();
        txtMobile2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnRequestFittnessConsult1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("<<back");
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel2.setText("Process Payment");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));
        add(txtMobile2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 420, 120));

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Recipt No.:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 90, 20));

        btnRequestFittnessConsult1.setText("comfirm");
        btnRequestFittnessConsult1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestFittnessConsult1ActionPerformed(evt);
            }
        });
        add(btnRequestFittnessConsult1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestFittnessConsult1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestFittnessConsult1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRequestFittnessConsult1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequestFittnessConsult1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtMobile2;
    // End of variables declaration//GEN-END:variables
}
