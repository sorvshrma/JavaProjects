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
public class DriverLicenseInfo {
    
    private JPanel jp;
    private JLabel ln, doi, doe, bt, pic;
    TextField ltf1, ltf2, ltf3, ltf4, ltf5;
    
    public DriverLicenseInfo(){
        callDriver();
    } 
    
    public JPanel callDriver(){
        jp = new JPanel();
        jp.setLayout(new GridLayout(7, 2, 15, 15));
        
        ln = new JLabel("License Number", JLabel.CENTER);
        ltf1 = new TextField();
        doi = new JLabel("Date of Issue", JLabel.CENTER);
        ltf2 = new TextField();
        doe = new JLabel("Date of Expiration", JLabel.CENTER);
        ltf3 = new TextField();
        bt = new JLabel("Blood Type", JLabel.CENTER);
        ltf4 = new TextField();
        pic = new JLabel("Picture", JLabel.CENTER);
        ltf5 = new TextField();
        
        jp.add(new JLabel("     License Info"));
        jp.add(new JLabel());
        jp.add(ln);
        jp.add(ltf1);
        jp.add(doi);
        jp.add(ltf2);
        jp.add(doe);
        jp.add(ltf3);
        jp.add(bt);
        jp.add(ltf4);
        jp.add(pic);
        jp.add(ltf5);
        jp.add(new JLabel());
        jp.add(new JLabel());
        
        jp.setVisible(true);
        return jp;
    }
    
}
