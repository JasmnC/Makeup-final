/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.GymManager;

import javax.swing.JPanel;
import model.Enterprise.MemberEnterprise;
import model.Network.Network;
import model.Organization.WelcomingOrganization;
import model.System.EcoSystem;
import model.UserAccount.UserAccount;
import ui.GymMember.*;

/**
 *
 * @author yuujadz
 */
public class GymManagerPanel extends javax.swing.JPanel {

    /**
     * Creates new form memberPanel
     */
    public GymManagerPanel() {
        initComponents();
    }

    public GymManagerPanel(JPanel userProcessContainer, UserAccount account, WelcomingOrganization welcomingOrganization, MemberEnterprise memberEnterprise, Network network, EcoSystem ecosystem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddNewMember = new javax.swing.JButton();
        btnViewMemeber = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddNewMember.setText("Add New Member");
        btnAddNewMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewMemberActionPerformed(evt);
            }
        });
        add(btnAddNewMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 200, 40));

        btnViewMemeber.setText("View Member");
        btnViewMemeber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMemeberActionPerformed(evt);
            }
        });
        add(btnViewMemeber, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 200, 40));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Gym Manager Work Panel");
        jLabel3.setToolTipText("");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNewMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNewMemberActionPerformed

    private void btnViewMemeberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMemeberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewMemeberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewMember;
    private javax.swing.JButton btnViewMemeber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
