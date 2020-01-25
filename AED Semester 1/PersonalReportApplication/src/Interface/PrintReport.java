/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Business.ReportInformation;

/**
 *
 * @author harry
 */
public class PrintReport {
   
    private JFrame jf1;
    private JLabel jl1;
    private JPanel jp1;
    
    private ReportInformation reportInformation;
    
    public PrintReport(){
        callPrintFrame();
    }
    
    public static void main(String args[]){
        PrintReport obj1 = new PrintReport();
    }
    
    public JFrame callPrintFrame(){
        jf1 = new JFrame();
        jf1.setLayout(new BorderLayout(10, 10));
        jf1.setSize(1100, 700);
        
        jp1 = new JPanel();
        GridLayout gl1 = new GridLayout(37, 2, 5, 5);
        jp1.setBackground(Color.lightGray);
        jp1.setLayout(gl1);
        
        DemographicInfo d1 = new DemographicInfo();
        AddressInfo a1 = new AddressInfo();
        SavingsAccInfo s1 = new SavingsAccInfo();
        CheckingAccInfo c1 = new CheckingAccInfo();
        DriverLicenseInfo l1 = new DriverLicenseInfo();
        MedicalInfo m1 = new MedicalInfo();
        
        JLabel label1 = new JLabel("First Name");
        jp1.add(label1);
        
        JLabel data1 = new JLabel(reportInformation.getFirstName());
        jp1.add(data1);
        
        JLabel label2 = new JLabel("Last Name");
        jp1.add(label2);
        
        JLabel data2 = new JLabel(reportInformation.getLastName());
        jp1.add(data2);
        
        JLabel label3 = new JLabel("Phone Number");
        jp1.add(label3);
        
        JLabel data3 = new JLabel(reportInformation.getPhoneNumber());
        jp1.add(data3);
        
        JLabel label4 = new JLabel("DOB");
        jp1.add(label4);
        
        JLabel data4 = new JLabel(reportInformation.getDob());
        jp1.add(data4);
        
        JLabel label5 = new JLabel("Age");
        jp1.add(label5);
        
        JLabel data5 = new JLabel(reportInformation.getAge());
        jp1.add(data5);
        
        JLabel label6 = new JLabel("Height");
        jp1.add(label6);
        
        JLabel data6 = new JLabel(reportInformation.getHeight());
        jp1.add(data6);
        
        JLabel label7 = new JLabel("Weight");
        jp1.add(label7);
        
        JLabel data7 = new JLabel(reportInformation.getWeight());
        jp1.add(data7);
        
        JLabel label8 = new JLabel("SSN");
        jp1.add(label8);
        
        JLabel data8 = new JLabel(reportInformation.getSsn());
        jp1.add(data8);
        
        JLabel label9 = new JLabel("Street");
        jp1.add(label9);
        
        JLabel data9 = new JLabel(reportInformation.getStreetAddress());
        jp1.add(data9);
        
        JLabel label10 = new JLabel("City");
        jp1.add(label10);
        
        JLabel data10 = new JLabel(reportInformation.getCity());
        jp1.add(data10);
        
        JLabel label11 = new JLabel("State");
        jp1.add(label11);
        
        JLabel data11 = new JLabel(reportInformation.getState());
        jp1.add(data11);
        
        JLabel label12 = new JLabel("Zipcode");
        jp1.add(label2);
        
        JLabel data12 = new JLabel(reportInformation.getZipcode());
        jp1.add(data12);
        
        JLabel label13 = new JLabel("Bank Name");
        jp1.add(label13);
        
        JLabel data13 = new JLabel(reportInformation.getBankNameSavings());
        jp1.add(data13);
        
        JLabel label14 = new JLabel("Routing Number");
        jp1.add(label14);
        
        JLabel data14 = new JLabel(reportInformation.getRoutingNumberSavings());
        jp1.add(data14);
        
        JLabel label15 = new JLabel("Bank Account Number");
        jp1.add(label15);
        
        JLabel data15 = new JLabel(reportInformation.getAccountNumberSavings());
        jp1.add(data15);
        
        JLabel label16 = new JLabel("Account Balance");
        jp1.add(label16);
        
        JLabel data16 = new JLabel(reportInformation.getBalanceSavings());
        jp1.add(data16);
        
        JLabel label17 = new JLabel("Account Type");
        jp1.add(label17);
        
        JLabel data17 = new JLabel(reportInformation.getAccountTypeSavings());
        jp1.add(data17);
        
        JLabel label18 = new JLabel("Bank Name");
        jp1.add(label18);
        
        JLabel data18 = new JLabel(reportInformation.getBankNameChecking());
        jp1.add(data18);
        
        JLabel label19 = new JLabel("Routing Number");
        jp1.add(label19);
        
        JLabel data19 = new JLabel(reportInformation.getRoutingNumberChecking());
        jp1.add(data19);
        
        JLabel label20 = new JLabel("Bank Account Number");
        jp1.add(label20);
        
        JLabel data20 = new JLabel(reportInformation.getAccountNumberChecking());
        jp1.add(data20);
        
        JLabel label21 = new JLabel("Account Balance");
        jp1.add(label21);
        
        JLabel data21 = new JLabel(reportInformation.getBalanceChecking());
        jp1.add(data21);
        
        JLabel label22 = new JLabel("Account Type");
        jp1.add(label22);
        
        JLabel data22 = new JLabel(reportInformation.getAccountTypeChecking());
        jp1.add(data22);
        
        JLabel label23 = new JLabel("License Number");
        jp1.add(label23);
        
        JLabel data23 = new JLabel(reportInformation.getLicenseNum());
        jp1.add(data23);
        
        JLabel label24 = new JLabel("Date of Issue");
        jp1.add(label24);
        
        JLabel data24 = new JLabel(reportInformation.getIssueDate());
        jp1.add(data24);
        
        JLabel label25 = new JLabel("Date of Expiration");
        jp1.add(label25);
        
        JLabel data25 = new JLabel(reportInformation.getExpiryDate());
        jp1.add(data25);
        
        JLabel label26 = new JLabel("Blod Type");
        jp1.add(label26);
        
        JLabel data26 = new JLabel(reportInformation.getBloodType());
        jp1.add(data26);
        
        JLabel label27 = new JLabel("Picture");
        jp1.add(label27);
        
        JLabel data27= new JLabel(reportInformation.getPicture());
        jp1.add(data27);
        
        JLabel label28 = new JLabel("Medical Record Number");
        jp1.add(label28);
        
        JLabel data28 = new JLabel(reportInformation.getMedicalRecordNum());
        jp1.add(data28);
        
        JLabel label29 = new JLabel("Allergy 1");
        jp1.add(label29);
        
        JLabel data29 = new JLabel(reportInformation.getAllergy1());
        jp1.add(data29);
        
        JLabel label30 = new JLabel("Allergy 2");
        jp1.add(label30);
        
        JLabel data30 = new JLabel(reportInformation.getAllergy2());
        jp1.add(data30);
        
        JLabel label31 = new JLabel("Allergy 3");
        jp1.add(label31);
        
        JLabel data31 = new JLabel(reportInformation.getAllergy3());
        jp1.add(data31);
        
        jf1.add(jp1, BorderLayout.CENTER);
        jf1.setVisible(true);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jf1;
    }
}
