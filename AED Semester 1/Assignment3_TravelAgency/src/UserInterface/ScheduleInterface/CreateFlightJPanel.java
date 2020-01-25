/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ScheduleInterface;

import Business.AirlinerDetails;
import Business.FlightDetails;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author harry
 */
public class CreateFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateFlightJPanel
     */
    private JPanel cardSequencePanel;
    private AirlinerDetails airDet;
    private FlightDetailsJPanel prevJpanel;
    /*  private ArrayList<String> aisleArray;
     private ArrayList<String> middleArray;
     private ArrayList<String> windowArray;*/

    public CreateFlightJPanel(JPanel cardSequencePanel, AirlinerDetails airDet) {
        initComponents();
        this.cardSequencePanel = cardSequencePanel;
        this.airDet = airDet;

        /*aisleArray = new ArrayList<>();
         middleArray = new ArrayList<>();
         windowArray = new ArrayList<>();*/
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
        createBtn = new javax.swing.JButton();
        fromLbl = new javax.swing.JLabel();
        fromTF = new javax.swing.JTextField();
        toLbl = new javax.swing.JLabel();
        toTF = new javax.swing.JTextField();
        priceTF = new javax.swing.JTextField();
        priceLbl = new javax.swing.JLabel();
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

        createAirlinerLbl.setText("Create Flight");
        add(createAirlinerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        fromLbl.setText("From");
        add(fromLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));
        add(fromTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 120, -1));

        toLbl.setText("To");
        add(toLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));
        add(toTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 120, -1));

        priceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTFActionPerformed(evt);
            }
        });
        add(priceTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 120, -1));

        priceLbl.setText("Price");
        add(priceLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

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
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        if (fromTF.getText().isEmpty() || toTF.getText().isEmpty() || priceTF.getText().isEmpty() || typeTF.getText().isEmpty() || aisleTF.getText().isEmpty() || middleTF.getText().isEmpty() || windowTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields required", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            int test = 0;
            for (FlightDetails fd : airDet.getFlightDirectory().getFlightDetails()) {
                if (fd.getFrom().equalsIgnoreCase(fromTF.getText()) && fd.getTo().equalsIgnoreCase(toTF.getText()) && fd.getType().equalsIgnoreCase(typeTF.getText())) {
                    ++test;
                    JOptionPane.showMessageDialog(null, "Flight already exist");
                    return;
                }
            }
            if (test == 0) {
                if (typeTF.getText().equalsIgnoreCase("morning") || typeTF.getText().equalsIgnoreCase("evening") || typeTF.getText().equalsIgnoreCase("night")) {
                    try {

                        double p = Double.parseDouble(priceTF.getText());
                        int a = Integer.parseInt(aisleTF.getText());
                        int m = Integer.parseInt(middleTF.getText());
                        int w = Integer.parseInt(windowTF.getText());
                        FlightDetails fdet = airDet.getFlightDirectory().addFlight();
                        fdet.setFrom(fromTF.getText());
                        fdet.setTo(toTF.getText());
                        fdet.setPrice(p);
                        fdet.setType(typeTF.getText());
                        fdet.setAisle(a);
                        fdet.setMiddle(m);
                        fdet.setWindow(w);

                        JOptionPane.showMessageDialog(null, "Flight details Created Successfully");

                        fromTF.setText("");
                        toTF.setText("");
                        priceTF.setText("");
                        typeTF.setText("");
                        aisleTF.setText("");
                        middleTF.setText("");
                        windowTF.setText("");

                        /*for(int i=0;i<50;i++){
                         aisleArray.add("A"+i);
                         }
                         fdet.setAisleArray(aisleArray);
                
                         for(int i=0;i<50;i++){
                         middleArray.add("B"+i);
                         }
                         fdet.setMiddleArray(middleArray);
                
                         for(int i=0;i<50;i++){
                         windowArray.add("C"+i);
                         }
                         fdet.setWindowArray(windowArray);*/
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Enter valid data", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Enter correct type as given example", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_createBtnActionPerformed

    private void priceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTFActionPerformed

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
    private javax.swing.JLabel createAirlinerLbl;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel fromLbl;
    private javax.swing.JTextField fromTF;
    private javax.swing.JLabel middleLbl;
    private javax.swing.JTextField middleTF;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JTextField priceTF;
    private javax.swing.JLabel toLbl;
    private javax.swing.JTextField toTF;
    private javax.swing.JLabel typeHintLbl;
    private javax.swing.JLabel typeLbl;
    private javax.swing.JTextField typeTF;
    private javax.swing.JLabel windowLbl;
    private javax.swing.JTextField windowTF;
    // End of variables declaration//GEN-END:variables
}