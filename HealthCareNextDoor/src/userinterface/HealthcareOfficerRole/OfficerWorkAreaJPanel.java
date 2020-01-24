/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthcareOfficerRole;

import Business.Enterprise.Enterprise;
import Business.Organization.HealthCareOfficerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GovernmentFundRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.DoctorRole.RequestLabTestJPanel;
import userinterface.GovernmentTreasurerRole.TreasurerProcessWorkRequestJPanel;
import userinterface.SystemAdminWorkArea.ManageNetworkJPanel;

/**
 *
 * @author ankit
 */
public class OfficerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private UserAccount userAccount;
    private HealthCareOfficerOrganization healthCareOfficerOrganization;
    private Enterprise enterprise;

    /**
     * Creates new form OfficerWorkAreaJPanel1
     */
    public OfficerWorkAreaJPanel(JPanel jpanel, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.jPanel = jpanel;
        this.healthCareOfficerOrganization = (HealthCareOfficerOrganization) organization;
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        processRequestBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Government Health Officer Work Area");

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Location", "Sender", "Receiver", "Status", "Amount", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true, true
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

        processRequestBtn.setText("Process Request");
        processRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processRequestBtnActionPerformed(evt);
            }
        });

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
                                .addGap(292, 292, 292)
                                .addComponent(processRequestBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
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
                    .addComponent(processRequestBtn)
                    .addComponent(btnAssign))
                .addContainerGap(156, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        WorkRequest request = (GovernmentFundRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (selectedRow < 0 || request.getStatus().equals("Approved")) {
            return;
        }

        else if (request.getStatus().equals("Sent")){
        request.setReceiver(userAccount);
        request.setStatus("Pending on " + request.getReceiver().getEmployee().getName() );
        populateTable();
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void processRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processRequestBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        GovernmentFundRequest request = (GovernmentFundRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if(selectedRow < 0 ) 
        {
            JOptionPane.showMessageDialog(null,"Please select a row first from the table to view details", "Warning!", JOptionPane.WARNING_MESSAGE);
        return;
        }
        if(request.getStatus().equals("Rejected"))
        {
             JOptionPane.showMessageDialog(null,"Cannot process a Rejected Request", "Warning!", JOptionPane.WARNING_MESSAGE);
        return;
        }

        if( request.getReceiver() == null)
        {
            JOptionPane.showMessageDialog(null,"Assign the request first", "Warning!", JOptionPane.WARNING_MESSAGE);
        return;
        }
        if( ! userAccount.getEmployee().equals(request.getReceiver().getEmployee()))
        {
            JOptionPane.showMessageDialog(null,"Request assigned to other Officer", "Warning!", JOptionPane.WARNING_MESSAGE);
        return;
        }
        
        else 
        {
       
//        CardLayout layout = (CardLayout) jPanel.getLayout();
//        jPanel.add("OfficerProcessWorkRequestJPanel", new OfficerProcessWorkRequestJPanel(jPanel, userAccount, fundRequest, enterprise));
//        layout.next(jPanel); 
        
        
           OfficerProcessWorkRequestJPanel panel = new OfficerProcessWorkRequestJPanel(jPanel , userAccount, request, enterprise);
            jPanel.add("OfficerProcessWorkRequestJPanel", panel);
            CardLayout layout = (CardLayout)jPanel.getLayout();
            layout.next(jPanel);
           
        }
    }//GEN-LAST:event_processRequestBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processRequestBtn;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : healthCareOfficerOrganization.getWorkQueue().getWorkRequests()) {
            Object[] row = new Object[6];
            row[0] = ((GovernmentFundRequest) request);
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            row[4] = ((GovernmentFundRequest) request).getRequestAmount();
            String result = ((GovernmentFundRequest) request).getResult();
            row[5] = result == null ? "Waiting" : result;

            model.addRow(row);
        }
    }
}
