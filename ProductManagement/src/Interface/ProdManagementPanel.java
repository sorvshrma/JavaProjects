
package Interface;
import Business.ProductDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author info
 */
public class ProdManagementPanel extends javax.swing.JPanel {

    /**
     * Creates new form AccountManagementPanel
     */
    private ProductDirectory accDir;
    private JPanel rightPanel;
    
    public ProdManagementPanel(JPanel rightPanel, ProductDirectory accDir) {
        initComponents();
        this.accDir = accDir;
        this.rightPanel = rightPanel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreate = new javax.swing.JButton();
        btnManage = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        btnCreate.setText("Create Product");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnManage.setText("Manage Products");
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManage)
                .addContainerGap(255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnManage))
                .addContainerGap(321, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateProductJPanel panel =new CreateProductJPanel(rightPanel, accDir);
        rightPanel.add("CreateProductJPanel", panel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        // TODO add your handling code here:
        ManageProdPanel panel =new ManageProdPanel(rightPanel , accDir);
        rightPanel.add("ManageProdPanel", panel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnManageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnManage;
    // End of variables declaration//GEN-END:variables
}
