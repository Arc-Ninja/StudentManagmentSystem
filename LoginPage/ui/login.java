package LoginPage.ui;
import java.awt.*;
import java.util.concurrent.Flow;
import java.util.jar.JarEntry;

import javax.swing.*;
public class login extends JPanel{
    JLabel user,pass,signin;
    JTextField username;
    JPasswordField password;
    JPanel log_box;
    JButton login_butt, signin_butt;
    public login(){



        this.setBackground(new Color(0,0,0));
        this.setPreferredSize(new Dimension(600,800));
        setLayout(null);


        log_box = new JPanel();
        // log_box.setPreferredSize(new Dimension(450,300));
        log_box.setBackground(new Color(255,255,255));
        log_box.setLayout(null);
        log_box.setBounds(70,200,450,300);



        user = new JLabel("Username: ");
        pass = new JLabel("Password: ");
        signin = new JLabel("Already have an account?");
        username = new JTextField();
        password = new JPasswordField();
        username.setBounds(180,30,200,30);
        password.setBounds(180,90,200,30);
        signin.setBounds(130,200,250,30);
        user.setBounds(50,30,150,30);
        pass.setBounds(50,90,150,30);
        signin.setFont(new Font("Georgia", Font.PLAIN, 18));
        user.setFont(new Font("Georgia", Font.PLAIN, 20));
        pass.setFont(new Font("Georgia", Font.PLAIN, 20));


        login_butt = new JButton("Log In");
        signin_butt = new JButton("Sign In");
        login_butt.setBounds(180,150,100,35);
        signin_butt.setBounds(180,245,100,35);
        login_butt.setFont(new Font("Georgia", Font.PLAIN, 15));
        signin_butt.setFont(new Font("Georgia", Font.PLAIN, 15));


        log_box.add(login_butt);
        log_box.add(signin_butt);
        log_box.add(username);
        log_box.add(password);
        log_box.add(user);
        log_box.add(pass);
        log_box.add(signin);



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
