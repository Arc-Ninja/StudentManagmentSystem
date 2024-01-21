import stud.*;
import stud.gui.APPMenuBar;
import stud.gui.entryPanel;
import stud.gui.result;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test {
    static public JFrame frame;
    static public JButton button;
    static public JPanel viewJPanel;
    static public APPMenuBar search;
    static public entryPanel entry;
    static public result res;
    static public ActionListener eventHandler;
    public static void main(String[] args) {
        eventHandler = new EventHandle(); 
        button = new JButton("Button");
        frame = new JFrame("TestFrame");
        frame.setLayout(new BorderLayout());
        viewJPanel = new JPanel();
        viewJPanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
        search = new APPMenuBar();
        entry = new entryPanel();
        res= new result();
        search.add(button);
        search.searchButton.addActionListener(eventHandler);
        button.addActionListener(eventHandler);
        // entry.setSize(500,400);
        // viewJPanel.add(res);
        // viewJPanel.add(entry);
        viewJPanel.setBackground(Color.RED);
        frame.add(search, BorderLayout.NORTH);
        frame.add(viewJPanel, BorderLayout.CENTER);
        // entry.setVisible(true);
        frame.setSize(1000,1000);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    static class EventHandle implements ActionListener {
        public void actionPerformed(ActionEvent event){
            if(event.getSource()==button){
                viewJPanel.remove(res);
                viewJPanel.add(entry);
                
    
                
            }
            else if(event.getSource()==search.searchButton){
                viewJPanel.remove(entry);
                viewJPanel.add(res);
            }
            viewJPanel.setVisible(false);
            viewJPanel.setVisible(true); 
        }
    }
}
