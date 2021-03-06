/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.ReportPOJO;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author harry
 */
public class LicensePanel extends javax.swing.JPanel {

    /**
     * Creates new form LicensePanel
     */
    
    private ReportPOJO reportPOJO;
    
    public LicensePanel(ReportPOJO reportPOJO) {
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

        licenseDetails = new javax.swing.JLabel();
        licenseNum = new javax.swing.JLabel();
        licenseNumTf = new javax.swing.JTextField();
        doiTf = new javax.swing.JTextField();
        doi = new javax.swing.JLabel();
        doe = new javax.swing.JLabel();
        doeTf = new javax.swing.JTextField();
        bloodTypeTf = new javax.swing.JTextField();
        bloodType = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        upload = new javax.swing.JButton();
        pic = new javax.swing.JLabel();
        resourcePath = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        licenseDetails.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        licenseDetails.setText("Driving License Details");
        add(licenseDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        licenseNum.setText("License Number");
        add(licenseNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 58, -1, -1));

        licenseNumTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseNumTfActionPerformed(evt);
            }
        });
        add(licenseNumTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 52, 123, -1));
        add(doiTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 92, 123, -1));

        doi.setText("Date of Issue");
        add(doi, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 98, -1, -1));

        doe.setText("Date of Expiry");
        add(doe, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 138, -1, -1));

        doeTf.setText(" ");
        doeTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doeTfActionPerformed(evt);
            }
        });
        add(doeTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 132, 123, -1));
        add(bloodTypeTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 169, 123, -1));

        bloodType.setText("Blood Type");
        add(bloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 175, -1, -1));

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        upload.setText("Upload");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        add(upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 203, -1, -1));

        pic.setText("Picture");
        add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 208, -1, -1));
        add(resourcePath, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void licenseNumTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseNumTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licenseNumTfActionPerformed

    private void doeTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doeTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doeTfActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        // TODO add your handling code here:
        JFileChooser imageChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Pictures", "jpg", "gif", "jpeg");
        imageChooser.setFileFilter(filter);
        int result = imageChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION){
            File file = imageChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            reportPOJO.setPath(path);
            resourcePath.setText(path);
        }
    }//GEN-LAST:event_uploadActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        reportPOJO.setLicenseNum(licenseNumTf.getText());
        reportPOJO.setIssueDate(doiTf.getText());
        reportPOJO.setExpiryDate(doeTf.getText());
        reportPOJO.setBloodType(bloodTypeTf.getText());

        //promt user for saved data
        JOptionPane.showMessageDialog(null, "Data Saved");
    }//GEN-LAST:event_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bloodType;
    private javax.swing.JTextField bloodTypeTf;
    private javax.swing.JLabel doe;
    private javax.swing.JTextField doeTf;
    private javax.swing.JLabel doi;
    private javax.swing.JTextField doiTf;
    private javax.swing.JLabel licenseDetails;
    private javax.swing.JLabel licenseNum;
    private javax.swing.JTextField licenseNumTf;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel resourcePath;
    private javax.swing.JButton save;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}
