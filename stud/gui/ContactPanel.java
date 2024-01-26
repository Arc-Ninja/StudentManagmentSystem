package stud.gui;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.awt.*;
public class ContactPanel extends JPanel{
    public JLabel contactLabel,EmailLabel;
    public JTextField Number,TEmail;
    public ContactPanel(){
        contactLabel = new JLabel("Mobile Number ");
        Number = new JTextField(10);
        Number.setBorder(BorderFactory.createEmptyBorder());
        contactLabel.setBounds(20,5,200,20);
        Number.setBounds(210,5,200,20);
        EmailLabel = new JLabel("Email ");
        TEmail = new JTextField(100);
        TEmail.setBorder(BorderFactory.createEmptyBorder());
        EmailLabel.setBounds(20,35,200,20);
        TEmail.setBounds(210,35,300,20);
        contactLabel.setFont(new Font("serif",Font.PLAIN,16));
        EmailLabel.setFont(new Font("serif",Font.PLAIN,16));
        setLayout(null);
        JComponent[] carr={contactLabel,EmailLabel,Number,TEmail};
        for(JComponent c : carr){
            this.add(c);
        }
        this.setBackground(new Color(0,0,0,0));
        // this.setSize(new Dimension(800,60));
        setVisible(true);
    }
    public void clear(){
        Number.setText("");
        TEmail.setText("");
    }
    
}
