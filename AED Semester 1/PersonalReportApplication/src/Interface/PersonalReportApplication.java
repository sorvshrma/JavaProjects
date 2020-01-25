/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Business.ReportInformation;
import javax.swing.JOptionPane;

/**
 *
 * @author harry
 */
public class PersonalReportApplication {

    /**
     * @param args the command line arguments
     */
    
    private JFrame frame;
    private JPanel panel;
    private JButton printButton, saveButton;
    private ReportInformation reportInformation;
            
    public PersonalReportApplication(){
        callMainFrame();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        PersonalReportApplication obj = new PersonalReportApplication();
    }
    
    private void callMainFrame() {
        frame = new JFrame("Personal Report Application");
        frame.setSize(1200, 800);
        FlowLayout FL = new FlowLayout();
        frame.setLayout(FL);

        panel = new JPanel();
        GridLayout GL = new GridLayout(3, 2, 5, 5);
        panel.setBackground(Color.lightGray);
        panel.setLayout(GL);

        final DemographicInfo d = new DemographicInfo();
        final AddressInfo a = new AddressInfo();
        final SavingsAccInfo s = new SavingsAccInfo();
        final CheckingAccInfo c = new CheckingAccInfo();
        final DriverLicenseInfo l = new DriverLicenseInfo();
        final MedicalInfo m = new MedicalInfo();
        
        panel.add(d.callDemo());
        panel.add(a.callAddress());
        panel.add(s.callSavings());
        panel.add(c.callChecking());
        panel.add(l.callDriver());
        panel.add(m.callMed());
        
        

        saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                reportInformation.setFirstName(d.dtf1.getText());
                reportInformation.setLastName(d.dtf2.getText());
                reportInformation.setPhoneNumber(d.dtf3.getText());
                reportInformation.setDob(d.dtf4.getText());
                reportInformation.setAge(d.dtf5.getText());
                reportInformation.setHeight(d.dtf6.getText());
                reportInformation.setWeight(d.dtf7.getText());
                reportInformation.setSsn(d.dtf8.getText());
                
                reportInformation.setStreetAddress(a.atf1.getText());
                reportInformation.setCity(a.atf2.getText());
                reportInformation.setState(a.atf3.getText());
                reportInformation.setZipcode(a.atf4.getText());
                
                reportInformation.setBankNameSavings(s.stf1.getText());
                reportInformation.setRoutingNumberSavings(s.stf2.getText());
                reportInformation.setAccountNumberSavings(s.stf3.getText());
                reportInformation.setBalanceSavings(s.stf4.getText());
                reportInformation.setAccountTypeSavings(s.stf5.getText());
                
                reportInformation.setBankNameChecking(c.ctf1.getText());
                reportInformation.setRoutingNumberChecking(c.ctf2.getText());
                reportInformation.setAccountNumberChecking(c.ctf3.getText());
                reportInformation.setBalanceChecking(c.ctf4.getText());
                reportInformation.setAccountTypeChecking(c.ctf5.getText());
                
                reportInformation.setLicenseNum(l.ltf1.getText());
                reportInformation.setIssueDate(l.ltf2.getText());
                reportInformation.setExpiryDate(l.ltf3.getText());
                reportInformation.setBloodType(l.ltf4.getText());
                reportInformation.setPicture(l.ltf5.getText());
                
                reportInformation.setMedicalRecordNum(m.mtf1.getText());
                reportInformation.setAllergy1(m.mtf2.getText());
                reportInformation.setAllergy2(m.mtf3.getText());
                reportInformation.setAllergy3(m.mtf4.getText());
                
                JOptionPane.showMessageDialog(null, "Data Saved");
                
                
            }
        });
        
        printButton = new JButton("Print Report");
        printButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e1) {
                PrintReport pr = new PrintReport();
                pr.callPrintFrame();
            }
        });
        
        frame.add(panel);
        frame.add(saveButton);
        frame.add(printButton);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
    
}
