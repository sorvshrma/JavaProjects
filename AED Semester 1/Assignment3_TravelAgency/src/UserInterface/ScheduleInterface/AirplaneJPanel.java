/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ScheduleInterface;

/**
 *
 * @author harry
 */
public class AirplaneJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AirplaneJPanel
     */
    public AirplaneJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        airplaneLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        airplaneTable = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        airplaneLbl.setText("Airplane Details");
        add(airplaneLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        airplaneTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airplane Name", "Number of Seats"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(airplaneTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 320, 150));

        deleteBtn.setText("Delete");
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        backBtn.setText("<<Back");
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        createBtn.setText("Create");
        add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        viewBtn.setText("View");
        add(viewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airplaneLbl;
    private javax.swing.JTable airplaneTable;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
