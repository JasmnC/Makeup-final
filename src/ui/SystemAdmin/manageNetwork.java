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
public class ManageNetwork extends javax.swing.JPanel {

    ManageNetwork(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecoSystem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form manageNetwork
     */


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
        btnCreateNetwork = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Network"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 600, 230));

        jLabel1.setText("New Network Name: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 240, 40));

        btnCreateNetwork.setText("Add");
        add(btnCreateNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
