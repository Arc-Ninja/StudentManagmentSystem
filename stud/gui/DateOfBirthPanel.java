package stud.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DateOfBirthPanel extends JPanel{
    public JLabel dayJLabel,monthJLabel,yearJLabel;
    public JComboBox dayBox,monthBox,yearBox;
    public DateOfBirthPanel(){
        dayJLabel = new JLabel("Day");
        monthJLabel = new JLabel("Month");
        yearJLabel = new JLabel("Year");
        dayBox = new JComboBox();
        monthBox = new JComboBox();
        yearBox = new JComboBox();
        java.util.Date date = new java.util.Date();
        initItem(yearBox,1970,1900+date.getYear());
        initItem(monthBox, 1, 12);;
        initItem(dayBox, 1, 31);
        setLayout(null);
        JComponent[] components ={dayJLabel,monthJLabel,yearJLabel,dayBox,monthBox,yearBox};
        int posx=20;
        int posy=5;
        for(int i=0;i<6;i++){
            if((i%3==0 && i!=0)){
                posy+=20;
                posx=20;
            }
            if(components[i] instanceof JLabel){
                components[i].setFont(new Font("Serif", Font.PLAIN, 16));
            }
            components[i].setBounds(posx, posy,150,20);
            posx+=250;
            this.add(components[i]);
        }
        setBackground(new Color(224,224,224));
        setVisible(true);
        
    }
    public void initItem(JComboBox c,int start,int end){
        for(int i=start;i<=end;i++){
            c.addItem(i);
        }
    }
    public void clear(){
        dayBox.setSelectedItem(dayBox.getItemAt(0));
        monthBox.setSelectedItem(monthBox.getItemAt(0));
        yearBox.setSelectedItem(yearBox.getItemAt(0));
    }
    
}