/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManagerInterface;

import Business.AirlinerDetails;
import Business.AirlinerDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author harry
 */
public class CreateAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagerPanel
     */
    private JPanel cardSequencePanel;
    private AirlinerDirectory airDir;
    private ManageAirlinersJPanel prevJpanel;

    public CreateAirlinerJPanel(JPanel cardSequencePanel, AirlinerDirectory airDir) {
        initComponents();
        this.cardSequencePanel = cardSequencePanel;
        this.airDir = airDir;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createAirlinerLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createAirlinerLbl.setText("Create Airliner");
        add(createAirlinerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel1.setText("Name*");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));
        add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 120, -1));

        jLabel2.setText("Address");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));
        add(addressTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 120, -1));

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        if (nameTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Name", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (addressTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Address", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            int test = 0;
            for (AirlinerDetails ad : airDir.getAirliner()) {
                if (nameTF.getText().equalsIgnoreCase(ad.getName())) {
                    ++test;
                    JOptionPane.showMessageDialog(null, "Airliner already exist");
                    return;
                }
            }
            if (test == 0) {
                AirlinerDetails air = airDir.addAirliner();
                air.setName(nameTF.getText());
                air.setAddress(addressTF.getText());

                JOptionPane.showMessageDialog(null, "Airliner Created Successfully");

                nameTF.setText("");
                addressTF.setText("");
            }
        }

    }//GEN-LAST:event_createBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        cardSequencePanel.remove(this);
        CardLayout layout = (CardLayout) cardSequencePanel.getLayout();
        layout.previous(cardSequencePanel);

        Component[] components = cardSequencePanel.getComponents();
        for (Component c : components) {
            if (c instanceof ManageAirlinersJPanel) {
                prevJpanel = (ManageAirlinersJPanel) c;
                prevJpanel.populate();
            }
        }
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTF;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel createAirlinerLbl;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nameTF;
    // End of variables declaration//GEN-END:variables
}
