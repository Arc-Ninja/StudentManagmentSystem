import stud.*;
import stud.gui.APPMenuBar;
import stud.gui.entryPanel;
import stud.gui.result;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class APP {
    static public JFrame frame;
    static public JPanel viewJPanel;
    static public APPMenuBar search;
    static public entryPanel entry;
    static public result res;
    static public JScrollPane scrollPane;
    static public ActionListener eventHandler;
    public static void main(String[] args) {

        eventHandler = new EventHandle(); 
        frame = new JFrame("TestFrame");
        frame.setLayout(new BorderLayout());
        viewJPanel = new JPanel();
        viewJPanel.setBackground(new Color(54, 54, 54));
        viewJPanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
        
        
        search = new APPMenuBar();
        entry = new entryPanel();
        res= new result();
        search.searchButton.addActionListener(eventHandler);
        search.entryButton.addActionListener(eventHandler);
        viewJPanel.add(entry);
        scrollPane = new JScrollPane(viewJPanel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setViewportView(viewJPanel);
        scrollPane.setPreferredSize(new Dimension(900,700));
        frame.add(search, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(1080,720);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    static class EventHandle implements ActionListener {
        public void actionPerformed(ActionEvent event){
            if(event.getSource()==search.entryButton){
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
