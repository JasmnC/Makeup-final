/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.GymManager;

/**
 *
 * @author yuujadz
 */
public class ViewAllMember extends javax.swing.JPanel {

    /**
     * Creates new form managmentRequest
     */
    public ViewAllMember() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblManagerRequests = new javax.swing.JTable();
        btnRequestFittnessConsult = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRequestFittnessConsult1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblManagerRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblManagerRequests);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, 320));

        btnRequestFittnessConsult.setText("Delete");
        btnRequestFittnessConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestFittnessConsultActionPerformed(evt);
            }
        });
        add(btnRequestFittnessConsult, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 100, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("View Members");
        jLabel1.setToolTipText("");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 40, -1, -1));

        btnRequestFittnessConsult1.setText("View");
        btnRequestFittnessConsult1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestFittnessConsult1ActionPerformed(evt);
            }
        });
        add(btnRequestFittnessConsult1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 100, -1));

        btnBack.setText("<<back");
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestFittnessConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestFittnessConsultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRequestFittnessConsultActionPerformed

    private void btnRequestFittnessConsult1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestFittnessConsult1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRequestFittnessConsult1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequestFittnessConsult;
    private javax.swing.JButton btnRequestFittnessConsult1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManagerRequests;
    // End of variables declaration//GEN-END:variables
}
