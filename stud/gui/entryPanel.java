package stud.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import stud.gui.EventHandle.*;

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
    public DateOfBirthPanel studentDateofBirth;
    public entryPanelEvent eventLis;

    public entryPanel(){
        labels = new JLabel[7];
        String[] labelsName = {"Student Name","Student Date of Birth","Student Gender","Student Contact","Father Name","Mother Name","Student Address"};
        
        setPreferredSize(new Dimension(800,1050));
        for(int i=0;i<7;i++){
            labels[i] = new JLabel(labelsName[i]);
            labels[i].setFont(new Font("Serif", Font.PLAIN, 20));
        }
        
        clear=new JButton("Clear");
        eventLis = new entryPanelEvent(this);
        clear.addActionListener(eventLis);
        submit = new JButton("Submit");
        clear.setBounds(480,950,120,50);
        submit.setBounds(630,950,120,50);
        clear.setFont(new Font("Serif", Font.PLAIN, 18));
        submit.setFont(new Font("Serif", Font.PLAIN, 18));
        add(clear);
        add(submit);

        studentName =new NamePanel();
        fatherName =new NamePanel();
        motherName =new NamePanel();
        studentRresgister=new RegisterPanel();
        studentAddress=new AddressPanel();
        studentContact = new ContactPanel();
        studentGender = new GenderPanel();
        studentDateofBirth=new DateOfBirthPanel();
        setLayout(null);
        JComponent[] components = {studentRresgister,labels[0],studentName,labels[1],studentDateofBirth,labels[2],studentGender,labels[3],studentContact,labels[4],fatherName,labels[5],motherName,labels[6],studentAddress};
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
            }else if(comp instanceof DateOfBirthPanel){
                height=60;
            }
            comp.setBounds(50,poy,700,height);
            poy+=height+10;
            add(comp);
        }
        //adding shadows
        JLabel card_img = new JLabel();
        card_img.setBounds(0, 0, 800, 1050);
        card_img.setBackground(new Color(255, 255, 255, 255));
        ImageIcon cicon = new ImageIcon("./resource/card2.png");
        Image cimg = cicon.getImage();
        Image cscaledimg = cimg.getScaledInstance(card_img.getWidth(), card_img.getHeight(), cimg.SCALE_SMOOTH);
        ImageIcon cresicon = new ImageIcon(cscaledimg);
        card_img.setIcon(cresicon);
        add(card_img);
        
        setBackground(new Color(54,54,54,0));
        // setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
        // add(subJPanel);
        // subJPanel.setVisible(true);
        setVisible(true);
        
        
    }
    public void clear(){
        studentRresgister.clear();
        studentName.clear();
        fatherName.clear();
        motherName.clear();
        studentGender.clear();
        studentAddress.clear();
        studentContact.clear();
        studentDateofBirth.clear();

    }
}
