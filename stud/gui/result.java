
package stud.gui;
import java.awt.*;
import javax.swing.*;

public class result extends JPanel {

    // Cell fowrading function -------------------------
    public void clf(int n) {
        for (int i = 0; i < n; i++) {
            this.add(new JLabel());
        }
    }
    // -------------------------------------------------

    public result() {

        // Panel Settings--------------------------------

        setLayout(null);
        setPreferredSize(new Dimension(900, 750));
        setBackground(new Color(156, 194, 255, 0));

        // -----------------------------------------------

        // New Panels -------------------------------
        int i = 3;
        JPanel[] pan = new JPanel[i];
        for (int j = 0; j < i; j++) {
            pan[j] = new JPanel();
        }
        // ------------------------------------------

        // Panel Containing Elements --------------------------------------
        pan[2].setLayout(null);
        pan[2].setBackground(new Color(0, 0, 0, 0));
        pan[2].setBounds(0, 0, 900, 730);
        JLabel[] labels = new JLabel[8];

        labels[0] = new JLabel("Student's Name: ");
        labels[1] = new JLabel("Father's Name: ");
        labels[2] = new JLabel("Mother's Name: ");
        labels[3] = new JLabel("Date Of Birth: ");
        labels[4] = new JLabel("Gender: ");
        labels[5] = new JLabel("Registration No: ");
        labels[6] = new JLabel("Mobile No: ");
        labels[7] = new JLabel("Residencial Address: ");

        // Adding all labels-----
        int yax = 130;
        for (int l = 0; l < 8; l++) {
            labels[l].setBounds(50, yax, 500, 100);
            labels[l].setFont(new Font("Georgia", Font.PLAIN, 24));
            pan[2].add(labels[l]);
            yax += 60;
        }
        // ---------

        add(pan[2]);
        // ----------------------------------------------------------------

        // Result Image --------------------

        pan[0].setLayout(null);
        pan[0].setBackground(new Color(0, 0, 0, 0));
        pan[0].setBounds(0, 0, 400, 400);

        JLabel result_img = new JLabel();
        result_img.setBounds(12, 16, 120, 120);
        ImageIcon icon = new ImageIcon("./resource/result.png");
        Image img = icon.getImage();
        Image scaledimg = img.getScaledInstance(result_img.getWidth(), result_img.getHeight(), img.SCALE_SMOOTH);
        ImageIcon resicon = new ImageIcon(scaledimg);
        result_img.setIcon(resicon);
        pan[0].add(result_img);
        add(pan[0]);

        // ----------------------------------

        // Card ------------------------------------
        pan[1].setBackground(new Color(240, 228, 199, 0));
        pan[1].setBounds(0, 20, 900, 730);
        pan[1].setLayout(new BorderLayout());
        JLabel card_img = new JLabel();
        card_img.setBounds(0, 0, 900, 730);
        card_img.setBackground(new Color(255, 255, 255, 255));
        ImageIcon cicon = new ImageIcon("./resource/card1.png");
        Image cimg = cicon.getImage();
        Image cscaledimg = cimg.getScaledInstance(card_img.getWidth(), card_img.getHeight(), cimg.SCALE_SMOOTH);
        ImageIcon cresicon = new ImageIcon(cscaledimg);
        card_img.setIcon(cresicon);
        pan[1].add(card_img, BorderLayout.CENTER);
        add(pan[1]);
        // ----------------------------------------------------

        // Visibility-------------------------
        pan[2].setVisible(true);
        pan[0].setVisible(true);
        pan[1].setVisible(true);
        // pan[3].setVisible(true);
        // pan[4].setVisible(true);
        // pan[5].setVisible(true);
        // pan[6].setVisible(true);

        setVisible(true);

        // -----------------------------
    }

    // public static void main(String[] args) {
    //     result r = new result();
    //     JFrame f = new JFrame("Result");
    //     f.add(r);
    //     f.setSize(1080, 720);
    //     f.getContentPane().setBackground(new Color(54, 54, 54));
    //     f.setResizable(true);
    //     f.setVisible(true);
    //     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //     f.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

    // }
}