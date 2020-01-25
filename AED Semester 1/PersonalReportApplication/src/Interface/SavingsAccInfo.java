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
public class SavingsAccInfo {
    
    private JPanel jp;
    private JLabel bn, rn, an, ab, at;
    TextField stf1, stf2, stf3, stf4, stf5;
    
    public SavingsAccInfo(){
        callSavings();
    } 
    
    public JPanel callSavings(){
        jp = new JPanel();
        jp.setLayout(new GridLayout(7, 2, 15, 15));
        
        bn = new JLabel("Bank Name", JLabel.CENTER);
        stf1 = new TextField();
        rn = new JLabel("Routing Number", JLabel.CENTER);
        stf2 = new TextField();
        an = new JLabel("Account Number", JLabel.CENTER);
        stf3 = new TextField();
        ab = new JLabel("Account Balance", JLabel.CENTER);
        stf4 = new TextField();
        at = new JLabel("Account Type", JLabel.CENTER);
        stf5 = new TextField();
        
        jp.add(new JLabel("     Savings Account"));
        jp.add(new JLabel());
        jp.add(bn);
        jp.add(stf1);
        jp.add(rn);
        jp.add(stf2);
        jp.add(an);
        jp.add(stf3);
        jp.add(ab);
        jp.add(stf4);
        jp.add(at);
        jp.add(stf5);
        jp.add(new JLabel());
        jp.add(new JLabel());
        
        jp.setVisible(true);
        return jp;
    }
    
}
