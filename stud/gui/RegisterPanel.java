package stud.gui;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;


public class RegisterPanel extends JPanel{
    public JLabel LRegister;
    public JTextField TRegister;
    public RegisterPanel(){
        LRegister = new JLabel("Register Number ");
        TRegister = new JTextField(15);
        LRegister.setFont(new Font("Serif", Font.PLAIN, 20));
        TRegister.setBorder(BorderFactory.createEmptyBorder());
        setLayout(null);
        LRegister.setBounds(0,0,150,20);
        TRegister.setBounds(200,0,200,20);
        add(LRegister);
        add(TRegister);
        this.setBackground(new Color(0,0,0,0));
        this.setVisible(true);
        // this.setSize(new Dimension(400,30));

    }
    public void clear(){
        this.TRegister.setText("");
    }
    public boolean isEmpty(){
        return this.TRegister.getText().equals("");
    }
    
}
