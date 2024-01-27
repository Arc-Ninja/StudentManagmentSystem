package stud.gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import stud.gui.EventHandle.*;
public class GenderPanel extends JPanel{
    public JRadioButton male, female;
    public ButtonGroup gender;
    public String genderData;
    public genderPanelEvent eventLis;
    public GenderPanel(){
        
        genderData="";
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        male.setBounds(20,5,100,20);
        male.setFont(new Font("serif", Font.PLAIN,16));
        female.setBounds(120,5,100,20);
        female.setFont(new Font("serif", Font.PLAIN,16));
        male.setBackground(new Color(224,224,224));
        female.setBackground(new Color(224,224,224));
        eventLis = new genderPanelEvent(this);
        male.addActionListener(eventLis);
        female.addActionListener(eventLis);

        gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);
        setLayout(null);
        add(male);
        add(female);
        setBackground(new Color(224,224,224));
        male.setFocusPainted(false);
        female.setFocusPainted(false);
        male.setVisible(true);
        female.setVisible(true);
        
        setVisible(true);
    }
    public void clear(){
        male.setSelected(false);
        female.setSelected(false);
    }
    
}
