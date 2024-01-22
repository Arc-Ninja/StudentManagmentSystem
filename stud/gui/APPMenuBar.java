package stud.gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class APPMenuBar extends JMenuBar{
    public JTextField searchField;
    public JButton searchButton,entryButton;
    public JComboBox searchBy;
    private JLabel searchLabel;
    public String selected;
    public APPMenuBar() {

        String[] searchByItem={"Reagister","Name"};
        searchField = new JTextField("Search",30);
        searchButton = new JButton("search");
        searchLabel = new JLabel("search by");
        searchBy = new JComboBox(searchByItem);
        searchLabel.setSize(50,50);
        searchBy.setSize(50,50);
        searchField.setSize(50,50);
        searchButton.setSize(50,50);
        entryButton = new JButton("entry");
        entryButton.setSize(50,50);
        ItemListener serchBylistener = new ItemListener(){
            public void itemStateChanged(ItemEvent event){
                if(event.getSource() == searchBy){
                    // selected = searchBy.getSelectedItem().toString();
                    searchField.setText(searchBy.getSelectedItem().toString());
                }
            }
        };
        searchBy.addItemListener(serchBylistener);
        ActionListener buttonListener = new ActionListener() {
            public void actionPerformed(ActionEvent event){
                if(event.getSource()==searchButton){
                    searchField.setText("");
                }
            }
        };
        searchButton.addActionListener(buttonListener);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        try{
            add(entryButton);
        add(searchLabel);
        add(searchBy);
        add(searchField);
        add(searchButton);
        }catch(Exception e){
            System.out.println("add in search panel"+ e.getMessage());
        }
        setSize(400,50);
        setVisible(true);
        setBackground(Color.RED);


    }
    // public static void main(String[] args) throws Exception{
    //     searchPanel s= new searchPanel();
    //     JFrame f= new JFrame();
    //     f.add(s);
    //     f.setSize(1000,1000);
    //     f.setVisible(true);
    //     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    // }
}
