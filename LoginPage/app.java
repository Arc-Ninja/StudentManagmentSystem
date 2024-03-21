package LoginPage;
import java.lang.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import LoginPage.ui.*;

public class app {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        login log = new login();
        f.add(log);
        f.setResizable(false);
        f.setSize(600,800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));

    }
     
}