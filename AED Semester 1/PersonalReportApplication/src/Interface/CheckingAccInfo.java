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
public class CheckingAccInfo {
    
    private JPanel jp;
    private JLabel bn, rn, an, ab, at;
    TextField ctf1, ctf2, ctf3, ctf4, ctf5;
    
    public CheckingAccInfo(){
        callChecking();
    } 
    
    public JPanel callChecking(){
        jp = new JPanel();
        jp.setLayout(new GridLayout(7, 2, 15, 15));
        
        bn = new JLabel("Bank Name", JLabel.CENTER);
        ctf1 = new TextField();
        rn = new JLabel("Routing Number", JLabel.CENTER);
        ctf2 = new TextField();
        an = new JLabel("Account Number", JLabel.CENTER);
        ctf3 = new TextField();
        ab = new JLabel("Account Balance", JLabel.CENTER);
        ctf4 = new TextField();
        at = new JLabel("Account Type", JLabel.CENTER);
        ctf5 = new TextField();
        
        jp.add(new JLabel("     Checking Account"));
        jp.add(new JLabel());
        jp.add(bn);
        jp.add(ctf1);
        jp.add(rn);
        jp.add(ctf2);
        jp.add(an);
        jp.add(ctf3);
        jp.add(ab);
        jp.add(ctf4);
        jp.add(at);
        jp.add(ctf5);
        jp.add(new JLabel());
        jp.add(new JLabel());
        
        jp.setVisible(true);
        return jp;
    }
    
}
