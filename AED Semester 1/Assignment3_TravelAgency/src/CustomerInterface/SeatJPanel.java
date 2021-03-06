/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerInterface;

import Business.CustomerDirectory;
import Business.SeatSelection;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harry
 */
public class SeatJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SeatJPanel
     */
    private JPanel cardSequencePanel;
    private CustomerDirectory cusDir;
    
    public SeatJPanel(JPanel cardSequencePanel, CustomerDirectory cusDir) {
        initComponents();
        this.cardSequencePanel = cardSequencePanel;
        this.cusDir = cusDir;
        populate();
    }

    private void populate() {
        DefaultTableModel dtm = (DefaultTableModel) seatTable.getModel();
        dtm.setRowCount(0);
        //SeatSelection s = new SeatSelection();
        //s.table();

        /*for (int i = 0; i < 25; i++) {
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = 'A';
            row[1] = 'B';
            row[2] = 'C';
            row[4] = 'D';
            row[5] = 'E';
            row[6] = 'F';
            dtm.addRow(row);
        }*/
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seatingLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        seatTable = new javax.swing.JTable();
        cockpitLbl = new javax.swing.JLabel();
        noteLbl = new javax.swing.JLabel();
        bookBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seatingLbl.setText("Seating Layout");
        add(seatingLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        seatTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Window", "Middle", "Aisle", "", "Aisle", "Middle", "Window"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        seatTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(seatTable);
        seatTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 450, 280));

        cockpitLbl.setText("Cockpit this side");
        add(cockpitLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        noteLbl.setText("Note: Please click on the seat to reserve");
        add(noteLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        bookBtn.setText("Go to Booking>>");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });
        add(bookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = seatTable.getSelectedRow();
        if (selectedRow >= 0) {
            Object valueAt = seatTable.getValueAt(seatTable.getSelectedRow(), seatTable.getSelectedColumn());
            int selectedColumn = seatTable.getSelectedColumn();
            //BookingJPanel bookingPanel = new BookingJPanel(cardSequencePanel, cusDir, seatTable, selectedRow, selectedColumn);
            //cardSequencePanel.removeAll();
            //cardSequencePanel.add(bookingPanel);
            CardLayout layout = (CardLayout) cardSequencePanel.getLayout();
            layout.next(cardSequencePanel);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a seat!!");
        }
    }//GEN-LAST:event_bookBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookBtn;
    private javax.swing.JLabel cockpitLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel noteLbl;
    private javax.swing.JTable seatTable;
    private javax.swing.JLabel seatingLbl;
    // End of variables declaration//GEN-END:variables
}
