/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author harry
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    private VitalSignHistory vsh;

    public CreateJPanel(VitalSignHistory vsh) {
        initComponents();
        this.vsh = vsh;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        createLabel = new javax.swing.JLabel();
        tempLb = new javax.swing.JLabel();
        bpLb = new javax.swing.JLabel();
        pulseLb = new javax.swing.JLabel();
        dateLb = new javax.swing.JLabel();
        tempTF = new javax.swing.JTextField();
        bpTF = new javax.swing.JTextField();
        pulseTF = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        createLabel.setForeground(new java.awt.Color(255, 51, 51));
        createLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createLabel.setText("Create Vital Sign");
        add(createLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 21, -1, -1));

        tempLb.setText("Temperature");
        add(tempLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 66, -1, -1));

        bpLb.setText("Blood Pressure");
        add(bpLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 112, -1, -1));

        pulseLb.setText("Pulse");
        add(pulseLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 158, -1, -1));

        dateLb.setText("Date");
        add(dateLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 204, -1, -1));
        add(tempTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 60, 143, -1));
        add(bpTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 106, 143, -1));
        add(pulseTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 152, 143, -1));

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 244, -1, -1));
        add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        try {
            double temp = Double.parseDouble(tempTF.getText());
            double bp = Double.parseDouble(bpTF.getText());
            int pulse = Integer.parseInt(pulseTF.getText());
            Date date = dateChooser.getDate();
            if(date==null){
                throw new Exception();
            }

            VitalSigns vs = vsh.addVitalSign();
            vs.setBloodPressure(bp);
            vs.setTemperature(temp);
            vs.setPulse(pulse);
            vs.setDate(date);

            JOptionPane.showMessageDialog(null, "Vital Sign saved!");
            tempTF.setText("");
            bpTF.setText("");
            pulseTF.setText("");
            dateChooser.setDate(null);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Enter valid data", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter valid date", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bpLb;
    private javax.swing.JTextField bpTF;
    private javax.swing.JLabel createLabel;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel dateLb;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel pulseLb;
    private javax.swing.JTextField pulseTF;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel tempLb;
    private javax.swing.JTextField tempTF;
    // End of variables declaration//GEN-END:variables
}
