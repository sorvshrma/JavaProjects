/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.GridLayout;
import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author harry
 */
public class MedicalInfo {
    
    private JPanel jp;
    private JLabel rn, a1, a2, a3;
    TextField mtf1, mtf2, mtf3, mtf4;
    
    public MedicalInfo(){
        callMed();
    } 
    
    public JPanel callMed(){
        jp = new JPanel();
        jp.setLayout(new GridLayout(6, 2, 15, 15));
        
        rn = new JLabel("Medical Record Number", JLabel.CENTER);
        mtf1 = new TextField();
        a1 = new JLabel("Allergy 1", JLabel.CENTER);
        mtf2 = new TextField();
        a2 = new JLabel("Allergy 2", JLabel.CENTER);
        mtf3 = new TextField();
        a3 = new JLabel("Allergy 3", JLabel.CENTER);
        mtf4 = new TextField();
        
        jp.add(new JLabel("     Medical Record"));
        jp.add(new JLabel());
        jp.add(rn);
        jp.add(mtf1);
        jp.add(a1);
        jp.add(mtf2);
        jp.add(a2);
        jp.add(mtf3);
        jp.add(a3);
        jp.add(mtf4);
        jp.add(new JLabel());
        jp.add(new JLabel());
        
        jp.setVisible(true);
        return jp;
    }
    
}
