/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdmin;

import javax.swing.JPanel;
import model.System.EcoSystem;
import model.UserAccount.UserAccount;

/**
 *
 * @author yuujadz
 */
public class ManageEnterprise extends javax.swing.JPanel {

    /**
     * Creates new form manageOrganization
     */
    public ManageEnterprise() {
        initComponents();
    }

    ManageEnterprise(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecoSystem) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnCreateOrg = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        menuNetwork = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network", "Enterprise", "Organization"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 600, 230));

        jLabel1.setText("Select Network: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, 20));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 210, 40));

        btnCreateOrg.setText("Add");
        add(btnCreateOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        jLabel2.setText("New Enterprise Name: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        menuNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        menuNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNetworkActionPerformed(evt);
            }
        });
        add(menuNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 210, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void menuNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNetworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuNetworkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateOrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> menuNetwork;
    // End of variables declaration//GEN-END:variables
}
