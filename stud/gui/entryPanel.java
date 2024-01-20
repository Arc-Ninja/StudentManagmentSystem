package stud.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import stud.helpler.*;
public class entryPanel extends JPanel{
    public JPanel subJPanel;
    public NamePanel studentName,fatherName,motherName;
    public RegisterPanel studentRresgister;
    // public JLabel LName,LAddress,LContact,LGender,LFather,LMother;
    JLabel[] labels;
    public JButton clear,submit;
    public ContactPanel studentContact;
    public AddressPanel studentAddress;
    public GenderPanel studentGender;


    public entryPanel(){
        labels = new JLabel[6];
        String[] labelsName = {"Student Name","Student Gender","Student Contact","Father Name","Mother Name","Student Address"};
        subJPanel=new JPanel();
        subJPanel.setPreferredSize(new Dimension(800,950));
        for(int i=0;i<6;i++){
            labels[i] = new JLabel(labelsName[i]);
            labels[i].setFont(new Font("Serif", Font.PLAIN, 20));
        }
        // int i=0;
        // for(JLabel label : labels){
        //     label =new JLabel("student");
        //     label.setFont(new Font("Serif", Font.PLAIN,20));
        //     i++;
        // }

        // LName= new JLabel("Student Name");
        // LName.setFont(new Font("Serif", Font.PLAIN, 20));
        // LAddress=new JLabel("Address");
        // LAddress.setFont(new Font("Serif", Font.PLAIN, 20));
        // LContact=new JLabel("Contact");
        // LContact.setFont(new Font("Serif", Font.PLAIN, 20));
        // LGender=new JLabel("Gender");
        // LGender.setFont(new Font("Serif", Font.PLAIN, 20));
        // System.out.println(labels[0] instanceof JLabel);
        clear=new JButton("Clear");
        submit = new JButton("Submit");
        clear.setBounds(500,850,120,50);
        submit.setBounds(650,850,120,50);
        clear.setFont(new Font("Serif", Font.PLAIN, 18));
        submit.setFont(new Font("Serif", Font.PLAIN, 18));
        subJPanel.add(clear);
        subJPanel.add(submit);

        // LFather,fatherName,LMother,motherName,LAddress,studentAddress
        studentName =new NamePanel();
        fatherName =new NamePanel();
        motherName =new NamePanel();
        studentRresgister=new RegisterPanel();
        studentAddress=new AddressPanel();
        studentContact = new ContactPanel();
        studentGender = new GenderPanel();
        subJPanel.setLayout(null);
        JComponent[] components = {studentRresgister,labels[0],studentName,labels[1],studentGender,labels[2],studentContact,labels[3],fatherName,labels[4],motherName,labels[5],studentAddress};
        int poy=60;

        for(JComponent comp :components){
            int height=30;
            if(comp instanceof AddressPanel){
                height=300;
            }
            else if(comp instanceof ContactPanel){
                height=60;
            }
            else if(comp instanceof RegisterPanel){
                height=30;
            }
            else if(comp instanceof NamePanel){
                height=60;
            }
            else if(comp instanceof GenderPanel){
                height=30;
            }
            else if(comp instanceof JLabel){
                height=30;
            }
            comp.setBounds(50,poy,800,height);
            poy+=height+10;
            subJPanel.add(comp);
        }
        
        
        setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
        add(subJPanel);
        subJPanel.setVisible(true);
        setVisible(true);
        
        
    }
}
