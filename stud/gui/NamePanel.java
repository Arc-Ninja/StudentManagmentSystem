package stud.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class NamePanel extends JPanel{
    public JLabel LFName,LMName,LLName;
    public JTextField TFName,TMName,TLName;

    public NamePanel(){
        LFName = new JLabel("First  ");
        LMName = new JLabel("Middle ");
        LLName = new JLabel("Last ");
        TFName = new JTextField(15);
        TFName.setBorder(BorderFactory.createEmptyBorder());
        TMName = new JTextField(15);
        TLName = new JTextField(15);
        TMName.setBorder(BorderFactory.createEmptyBorder());
        TLName.setBorder(BorderFactory.createEmptyBorder());
        setLayout(null);
        JComponent[] arr = { LFName,LMName,LLName,TFName,TMName,TLName};
        int posx=20;
        int posy=5;
        for(int i=0;i<6;i++){
            if((i%3==0 && i!=0)){
                posy+=20;
                posx=20;
            }
            if(arr[i] instanceof JLabel){
                arr[i].setFont(new Font("Serif", Font.PLAIN, 16));
            }
            arr[i].setBounds(posx, posy,200,20);
            posx+=250;
            this.add(arr[i]);
        }
        this.setBackground(new Color(0,0,0,0));
        this.setVisible(true);
        // this.setSize(new Dimension(800,50));
    }
        
    
}
