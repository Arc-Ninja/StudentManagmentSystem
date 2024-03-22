package LoginPage.ui;
import java.awt.*;
import java.util.concurrent.Flow;
import java.util.jar.JarEntry;
import javax.swing.*;
import LoginPage.helper.guiHelper;
public class signin extends JPanel {

    


    JTextField [] tf;
    JPasswordField [] pf;
    JLabel lab[];
    String []labels = {"Name:", "Phone Number:","Email:","Username:","Password:","Confirm Password","Already have an account?"};
    public signin(){
        guiHelper help = new guiHelper();
        setLayout(null);
        setBackground(new Color(28, 28, 28));
        this.setPreferredSize(new Dimension(600,800));

        tf = new JTextField[4];
        pf = new JPasswordField[2];
        lab = new JLabel[7];
        help.create(tf, 4);
        help.create(pf, 2);
        help.createLabel(lab, labels, 7);

        

    }
    
}
