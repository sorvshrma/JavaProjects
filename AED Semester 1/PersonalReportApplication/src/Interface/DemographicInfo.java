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
public class DemographicInfo {
    
    private JPanel jp;
    private JLabel fn, ln, pn, dob, age, height, weight, ssn;
    TextField dtf1, dtf2, dtf3, dtf4, dtf5, dtf6, dtf7, dtf8;
    
    public DemographicInfo(){
        callDemo();
    } 
    
    public JPanel callDemo(){
        jp = new JPanel();
        jp.setLayout(new GridLayout(6, 4, 15, 15));
        
        fn = new JLabel("First Name", JLabel.CENTER);
        dtf1 = new TextField();
        ln = new JLabel("Last Name", JLabel.CENTER);
        dtf2 = new TextField();
        pn = new JLabel("Phone Number", JLabel.CENTER);
        dtf3 = new TextField();
        dob = new JLabel("Date of Birth", JLabel.CENTER);
        dtf4 = new TextField();
        age = new JLabel("Age", JLabel.CENTER);
        dtf5 = new TextField();
        height = new JLabel("Height", JLabel.CENTER);
        dtf6 = new TextField();
        weight = new JLabel("Weight", JLabel.CENTER);
        dtf7 = new TextField();
        ssn = new JLabel("SSN", JLabel.CENTER);
        dtf8 = new TextField();
        
        jp.add(new JLabel("     Demographic Info"));
        jp.add(new JLabel());
        jp.add(new JLabel());
        jp.add(new JLabel());
        jp.add(fn);
        jp.add(dtf1);
        jp.add(ln);
        jp.add(dtf2);
        jp.add(pn);
        jp.add(dtf3);
        jp.add(dob);
        jp.add(dtf4);
        jp.add(age);
        jp.add(dtf5);
        jp.add(height);
        jp.add(dtf6);
        jp.add(weight);
        jp.add(dtf7);
        jp.add(ssn);
        jp.add(dtf8);
        jp.add(new JLabel());
        jp.add(new JLabel());
        jp.add(new JLabel());
        jp.add(new JLabel());
        
        jp.setVisible(true);
        return jp;
    }
}
