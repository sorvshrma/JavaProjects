/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GovernmentSecretaryRole;

import Business.Enterprise.Enterprise;
import Business.Organization.HealthCareOfficerOrganization;
import Business.Organization.Organization;
import Business.Organization.SecretaryOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GovernmentFundRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sourav
 */
public class SecretaryWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SecretaryWorkAreaJPanel
     */
    
    private JPanel jPanel;
    private UserAccount userAccount;
    private SecretaryOrganization secretaryOrganization;
    private Enterprise enterprise;
    
    public SecretaryWorkAreaJPanel(JPanel jpanel, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.jPanel = jpanel;
        this.secretaryOrganization = (SecretaryOrganization) organization;
        this.userAccount = userAccount;

        populateTable();
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
        workRequestJTable = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        processRequestBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Location", "Sender", "Receiver", "Status", "Amount", "Message", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        btnAssign.setText("Assign To Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        processRequestBtn.setText("Process Request");
        processRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processRequestBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Secretary Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAssign)
                                .addGap(27, 27, 27)
                                .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(processRequestBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAccept)
                        .addComponent(btnReject)
                        .addComponent(processRequestBtn))
                    .addComponent(btnAssign))
                .addContainerGap(142, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        WorkRequest request = (GovernmentFundRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        } else {
            WorkRequest request = (GovernmentFundRequest) workRequestJTable.getValueAt(selectedRow, 0);
            if (userAccount.equals(request.getReceiver()) && !(request.getStatus().equals("Approved"))) {
                request.setStatus("Approved");
                populateTable();
            }

        }

    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        } else {
            WorkRequest request = (GovernmentFundRequest) workRequestJTable.getValueAt(selectedRow, 0);
            if (userAccount.equals(request.getReceiver()) && !(request.getStatus().equals("Rejected"))) {
                request.setStatus("Rejected");
                populateTable();

            }
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void processRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processRequestBtnActionPerformed
        // TODO add your handling code here:

        int selectedRow = workRequestJTable.getSelectedRow();
        if(selectedRow <0)
        {
            JOptionPane.showMessageDialog(null,"Please select a row first from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            GovernmentFundRequest fundRequest = (GovernmentFundRequest) workRequestJTable.getValueAt(selectedRow, 0);
            //        CardLayout layout = (CardLayout) jPanel.getLayout();
            //        jPanel.add("OfficerProcessWorkRequestJPanel", new OfficerProcessWorkRequestJPanel(jPanel, userAccount, fundRequest, enterprise));
            //        layout.next(jPanel);

            SecretaryProcessWorkRequestJPanel panel = new SecretaryProcessWorkRequestJPanel(jPanel , userAccount, fundRequest, enterprise);
            jPanel.add("secretaryProcessWorkRequestJPanel", panel);
            CardLayout layout = (CardLayout)jPanel.getLayout();
            layout.next(jPanel);

        }
    }//GEN-LAST:event_processRequestBtnActionPerformed

private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : secretaryOrganization.getWorkQueue().getWorkRequests()) {
            Object[] row = new Object[7];
            row[0] = ((GovernmentFundRequest) request);
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            row[4] = ((GovernmentFundRequest) request).getRequestAmount();
            row[5] = ((GovernmentFundRequest) request).getMessage();
            String result = ((GovernmentFundRequest) request).getResult();
            row[6] = result == null ? "Waiting" : result;
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processRequestBtn;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}