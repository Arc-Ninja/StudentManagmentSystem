package LoginPage.ui;
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
        setLayout(null);
        log_box = new JPanel();
        // log_box.setPreferredSize(new Dimension(450,300));
        log_box.setBackground(new Color(255,255,255));
        log_box.setLayout(null);
        log_box.setBounds(70,200,450,270);
        user = new JLabel("Username: ");
        pass = new JLabel("Password: ");
        user.setBounds(10,10,200,50);
        pass.setBounds(10,50,200,50);
        user.setFont(new Font("Georgia", Font.PLAIN, 20));
        pass.setFont(new Font("Georgia", Font.PLAIN, 20));
        log_box.add(user);
        log_box.add(pass);
        add(log_box);
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
