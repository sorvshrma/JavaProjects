/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ScheduleInterface;

import Business.AirlinerDetails;
import Business.AirlinerDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author harry
 */
public class AirlinerDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AirlinerLogin
     */
    private JPanel cardSequencePanel;
    private AirlinerDirectory airDir;

    public AirlinerDetailsJPanel(JPanel cardSequencePanel, AirlinerDirectory airDir) {
        initComponents();
        this.cardSequencePanel = cardSequencePanel;
        this.airDir = airDir;

        airlinerComboBox.removeAllItems();
        for (AirlinerDetails airDet : airDir.getAirliner()) {
            airlinerComboBox.addItem(airDet);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        airlinerDetailLbl = new javax.swing.JLabel();
        chooseAirlinerLbl = new javax.swing.JLabel();
        airlinerComboBox = new javax.swing.JComboBox();
        goBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        airlinerDetailLbl.setText("Airliner Details");
        add(airlinerDetailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        chooseAirlinerLbl.setText("Choose Airliner");
        add(chooseAirlinerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        add(airlinerComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 100, -1));

        goBtn.setText("GO >>");
        goBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBtnActionPerformed(evt);
            }
        });
        add(goBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void goBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBtnActionPerformed
        // TODO add your handling code here:
        AirlinerDetails airDet = (AirlinerDetails) airlinerComboBox.getSelectedItem();
        FlightDetailsJPanel flightDetailsJPanel = new FlightDetailsJPanel(cardSequencePanel, airDet);
        cardSequencePanel.add(flightDetailsJPanel);
        CardLayout layout = (CardLayout) cardSequencePanel.getLayout();
        layout.next(cardSequencePanel);
    }//GEN-LAST:event_goBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox airlinerComboBox;
    private javax.swing.JLabel airlinerDetailLbl;
    private javax.swing.JLabel chooseAirlinerLbl;
    private javax.swing.JButton goBtn;
    // End of variables declaration//GEN-END:variables
}
