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
public class AddressInfo {
    
    private JPanel jp;
    private JLabel st, city, state, zip;
    TextField atf1, atf2, atf3, atf4;
    
    public AddressInfo(){
        callAddress();
    } 
    
    public JPanel callAddress(){
        jp = new JPanel();
        jp.setLayout(new GridLayout(6, 2, 15, 15));
        
        st = new JLabel("Street", JLabel.CENTER);
        atf1 = new TextField();
        city = new JLabel("City", JLabel.CENTER);
        atf2 = new TextField();
        state = new JLabel("State", JLabel.CENTER);
        atf3 = new TextField();
        zip = new JLabel("Zipcode", JLabel.CENTER);
        atf4 = new TextField();

        jp.add(new JLabel("     Address Info"));
        jp.add(new JLabel());
        jp.add(st);
        jp.add(atf1);
        jp.add(city);
        jp.add(atf2);
        jp.add(state);
        jp.add(atf3);
        jp.add(zip);
        jp.add(atf4);
        jp.add(new JLabel());
        jp.add(new JLabel());
        
        jp.setVisible(true);
        return jp;
    }
    
}
