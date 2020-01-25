/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.ReportPOJO;
import javax.swing.JOptionPane;

/**
 *
 * @author harry
 */
public class SavingsPanel extends javax.swing.JPanel {

    /**
     * Creates new form SavingsPanel
     */
    
    private ReportPOJO reportPOJO;
    
    public SavingsPanel(ReportPOJO reportPOJO) {
        initComponents();
        this.reportPOJO = reportPOJO;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        savingsDetails = new javax.swing.JLabel();
        sbankName = new javax.swing.JLabel();
        sbankNameTf = new javax.swing.JTextField();
        sroutingNum = new javax.swing.JLabel();
        saccountNum = new javax.swing.JLabel();
        saccountBalance = new javax.swing.JLabel();
        saccountBalanceTf = new javax.swing.JTextField();
        saccountNumTf = new javax.swing.JTextField();
        sroutingNumTf = new javax.swing.JTextField();
        saccountType = new javax.swing.JLabel();
        saccountTypeTf = new javax.swing.JTextField();
        save = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        savingsDetails.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        savingsDetails.setText("Savings Bank Account Details");

        sbankName.setText("Bank Name");

        sbankNameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbankNameTfActionPerformed(evt);
            }
        });

        sroutingNum.setText("Routing Number");

        saccountNum.setText("Account Number");

        saccountBalance.setText("Account Balance");

        saccountNumTf.setText(" ");
        saccountNumTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saccountNumTfActionPerformed(evt);
            }
        });

        saccountType.setText("Account Type");

        saccountTypeTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saccountTypeTfActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(savingsDetails)
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(save)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sbankName)
                                        .addComponent(saccountBalance)
                                        .addComponent(saccountType))
                                    .addGap(21, 21, 21))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(saccountNum)
                                        .addComponent(sroutingNum))
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sbankNameTf)
                                .addComponent(sroutingNumTf)
                                .addComponent(saccountNumTf)
                                .addComponent(saccountBalanceTf)
                                .addComponent(saccountTypeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(39, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(savingsDetails)
                .addContainerGap(296, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sbankName)
                        .addComponent(sbankNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sroutingNumTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sroutingNum))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saccountNumTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(saccountNum))
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saccountBalance)
                        .addComponent(saccountBalanceTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(saccountTypeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(save)
                    .addContainerGap(44, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sbankNameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbankNameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sbankNameTfActionPerformed

    private void saccountNumTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saccountNumTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saccountNumTfActionPerformed

    private void saccountTypeTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saccountTypeTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saccountTypeTfActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        reportPOJO.setBankNameSavings(sbankNameTf.getText());
        reportPOJO.setRoutingNumberSavings(sroutingNumTf.getText());
        reportPOJO.setAccountNumberSavings(saccountNumTf.getText());
        reportPOJO.setBalanceSavings(saccountBalanceTf.getText());
        reportPOJO.setAccountTypeSavings(saccountTypeTf.getText());
        
        //promt user for saved data
        JOptionPane.showMessageDialog(null, "Data Saved");
    }//GEN-LAST:event_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel saccountBalance;
    private javax.swing.JTextField saccountBalanceTf;
    private javax.swing.JLabel saccountNum;
    private javax.swing.JTextField saccountNumTf;
    private javax.swing.JLabel saccountType;
    private javax.swing.JTextField saccountTypeTf;
    private javax.swing.JButton save;
    private javax.swing.JLabel savingsDetails;
    private javax.swing.JLabel sbankName;
    private javax.swing.JTextField sbankNameTf;
    private javax.swing.JLabel sroutingNum;
    private javax.swing.JTextField sroutingNumTf;
    // End of variables declaration//GEN-END:variables
}
