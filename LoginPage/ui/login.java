package ui;
import java.awt.*;
import java.util.concurrent.Flow;

import javax.swing.*;
public class login extends JPanel{
    JLabel user,pass;
    JTextField username;
    JPasswordField password;
    JPanel log_box;
    public login(){
        this.setBackground(new Color(0,0,0));
        this.setPreferredSize(new Dimension(600,800));
        log_box = new JPanel();
        log_box.setPreferredSize(new Dimension(200,100));
        log_box.setBackground(new Color(255,255,255));
        log_box.setLayout(null);
        user = new JLabel("Username: ");
        pass = new JLabel("Password: ");
        log_box.setVisible(true);
        setVisible(true);
       


    }

    public static void main(String[] args) {
        JFrame f  = new JFrame("Login");
        login lg = new login();
        f.add(lg);
        
        // f.setBackground(new Color(66, 135, 245));
        f.setResizable(false);
        f.setSize(600,800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
    }
}
