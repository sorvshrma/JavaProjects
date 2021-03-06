/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ScheduleInterface;

import Business.FlightDetails;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author harry
 */
public class ViewFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewFlightJPanel
     */
    private JPanel cardSequencePanel;
    private FlightDetails fdet;
    private FlightDetailsJPanel prevJpanel;

    ViewFlightJPanel(JPanel cardSequencePanel, FlightDetails fdet) {
        initComponents();
        this.cardSequencePanel = cardSequencePanel;
        this.fdet = fdet;

        fromTF.setText(fdet.getFrom());
        toTF.setText(fdet.getTo());
        priceTF.setText(String.valueOf(fdet.getPrice()));
        typeTF.setText(fdet.getType());
        aisleTF.setText(String.valueOf(fdet.getAisle()));
        middleTF.setText(String.valueOf(fdet.getMiddle()));
        windowTF.setText(String.valueOf(fdet.getWindow()));
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
        fromLbl = new javax.swing.JLabel();
        fromTF = new javax.swing.JTextField();
        toLbl = new javax.swing.JLabel();
        toTF = new javax.swing.JTextField();
        priceTF = new javax.swing.JTextField();
        priceLbl = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        typeTF = new javax.swing.JTextField();
        typeLbl = new javax.swing.JLabel();
        typeHintLbl = new javax.swing.JLabel();
        aisleTF = new javax.swing.JTextField();
        aisleLbl = new javax.swing.JLabel();
        middleTF = new javax.swing.JTextField();
        middleLbl = new javax.swing.JLabel();
        windowLbl = new javax.swing.JLabel();
        windowTF = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Flight Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        fromLbl.setText("From");
        add(fromLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        fromTF.setEditable(false);
        add(fromTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 120, -1));

        toLbl.setText("To");
        add(toLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        toTF.setEditable(false);
        add(toTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 120, -1));

        priceTF.setEditable(false);
        priceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTFActionPerformed(evt);
            }
        });
        add(priceTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 120, -1));

        priceLbl.setText("Price");
        add(priceLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        saveBtn.setText("Save");
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        typeTF.setEditable(false);
        typeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeTFActionPerformed(evt);
            }
        });
        add(typeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 120, -1));

        typeLbl.setText("Type");
        add(typeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        typeHintLbl.setText("Ex: Morning/Evening/Night");
        add(typeHintLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        aisleTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aisleTFActionPerformed(evt);
            }
        });
        add(aisleTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 120, -1));

        aisleLbl.setText("Aisle Seat");
        add(aisleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        middleTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleTFActionPerformed(evt);
            }
        });
        add(middleTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 120, -1));

        middleLbl.setText("Middle Seat");
        add(middleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        windowLbl.setText("Window Seat");
        add(windowLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        windowTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                windowTFActionPerformed(evt);
            }
        });
        add(windowTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 120, -1));

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void priceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTFActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        fromTF.setEditable(true);
        toTF.setEditable(true);
        priceTF.setEditable(true);
        aisleTF.setEditable(true);
        middleTF.setEditable(true);
        windowTF.setEditable(true);
        saveBtn.setEnabled(true);
        updateBtn.setEnabled(false);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        fromTF.setEditable(false);
        toTF.setEditable(false);
        priceTF.setEditable(false);
        aisleTF.setEditable(false);
        middleTF.setEditable(false);
        windowTF.setEditable(false);
        saveBtn.setEnabled(false);
        updateBtn.setEnabled(true);

        if (fromTF.getText().isEmpty() || toTF.getText().isEmpty() || priceTF.getText().isEmpty() || typeTF.getText().isEmpty() || aisleTF.getText().isEmpty() || middleTF.getText().isEmpty() || windowTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields required", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (typeTF.getText().equalsIgnoreCase("morning") || typeTF.getText().equalsIgnoreCase("evening") || typeTF.getText().equalsIgnoreCase("night")) {
            try {
                fdet.setFrom(fromTF.getText());
                fdet.setTo(toTF.getText());
                fdet.setPrice(Double.parseDouble(priceTF.getText()));
                fdet.setType(typeTF.getText());
                fdet.setAisle(Integer.parseInt(aisleTF.getText()));
                fdet.setMiddle(Integer.parseInt(middleTF.getText()));
                fdet.setWindow(Integer.parseInt(windowTF.getText()));

                JOptionPane.showMessageDialog(null, "Flight details updated successfully");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Enter valid data", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Enter correct type as given example", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void typeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeTFActionPerformed

    private void aisleTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aisleTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aisleTFActionPerformed

    private void middleTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middleTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middleTFActionPerformed

    private void windowTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_windowTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_windowTFActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        cardSequencePanel.remove(this);
        CardLayout layout = (CardLayout) cardSequencePanel.getLayout();
        layout.previous(cardSequencePanel);

        Component[] components = cardSequencePanel.getComponents();
        for (Component c : components) {
            if (c instanceof FlightDetailsJPanel) {
                prevJpanel = (FlightDetailsJPanel) c;
                prevJpanel.populate();
            }
        }
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aisleLbl;
    private javax.swing.JTextField aisleTF;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel fromLbl;
    private javax.swing.JTextField fromTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel middleLbl;
    private javax.swing.JTextField middleTF;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JTextField priceTF;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel toLbl;
    private javax.swing.JTextField toTF;
    private javax.swing.JLabel typeHintLbl;
    private javax.swing.JLabel typeLbl;
    private javax.swing.JTextField typeTF;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel windowLbl;
    private javax.swing.JTextField windowTF;
    // End of variables declaration//GEN-END:variables
}
