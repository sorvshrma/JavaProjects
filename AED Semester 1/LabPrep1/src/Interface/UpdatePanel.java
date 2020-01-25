/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;
import Business.Supplier;
import javax.swing.JOptionPane;

/**
 *
 * @author harry
 */
public class UpdatePanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdatePanel
     */
    private Product product;
    private Supplier supplier;
    public UpdatePanel(Product product) {
        initComponents();
        this.product = product;
        display(product);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        availNumTextField = new javax.swing.JTextField();
        descriptionTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        supplierAddressTextField = new javax.swing.JTextField();
        supplierNameTextField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(420, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("Update Your Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 6, -1, -1));

        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setText("Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 116, -1, -1));

        jLabel4.setText("Availability Number:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 162, -1, -1));

        jLabel5.setText("Description:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 208, -1, -1));

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 64, 213, -1));

        priceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTextFieldActionPerformed(evt);
            }
        });
        add(priceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 110, 213, -1));

        availNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availNumTextFieldActionPerformed(evt);
            }
        });
        add(availNumTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 156, 213, -1));

        descriptionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionTextFieldActionPerformed(evt);
            }
        });
        add(descriptionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 202, 213, -1));

        jLabel6.setText("Supplier Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 254, -1, -1));

        jLabel7.setText("Supplier Address");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 300, -1, -1));
        add(supplierAddressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 294, 213, -1));
        add(supplierNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 248, 213, -1));

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 340, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void priceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTextFieldActionPerformed

    private void availNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availNumTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availNumTextFieldActionPerformed

    private void descriptionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionTextFieldActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        product.setName(nameTextField.getText());
        product.setPrice(priceTextField.getText());
        product.setAvailNum(availNumTextField.getText());
        product.setDescription(descriptionTextField.getText());
        supplier.setSupplierName(supplierNameTextField.getText());
        supplier.setSupplierAddress(supplierAddressTextField.getText());
        product.setSupplier(supplier);
        // prompt user that product was successfully updated
        JOptionPane.showMessageDialog(null, "product successfully updated");
    }//GEN-LAST:event_saveBtnActionPerformed

    private void display(Product product){
       String productName = product.getName();
       nameTextField.setText(productName);
       
       String productPrice = product.getPrice();
       priceTextField.setText(productPrice);
       
       String productAvailNum = product.getAvailNum();
       availNumTextField.setText(productAvailNum);
       
       String productDescription = product.getDescription();
       descriptionTextField.setText(productDescription);
       
       supplier = product.getSupplier();
       supplierNameTextField.setText(supplier.getSupplierName());
       supplierAddressTextField.setText(supplier.getSupplierAddress());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availNumTextField;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField supplierAddressTextField;
    private javax.swing.JTextField supplierNameTextField;
    // End of variables declaration//GEN-END:variables
}
