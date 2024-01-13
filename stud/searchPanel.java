package stud;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class searchPanel extends JPanel{
    public JTextField searchField;
    public JButton searchButton;
    public JComboBox searchBy;
    private JLabel searchLabel;
    public String selected;
    public searchPanel() {

        String[] searchByItem={"Reagister","Name"};
        searchField = new JTextField("Search",30);
        searchButton = new JButton("search");
        searchLabel = new JLabel("search by");
        searchBy = new JComboBox(searchByItem);
        searchLabel.setBounds(100,100,50,50);
        searchBy.setBounds(150,100,100,50);
        searchField.setBounds(150,200,100,50);
        searchButton.setBounds(150,300,50,50);
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
        add(searchLabel);
        add(searchBy);
        add(searchField);
        add(searchButton);
        setSize(getPreferredSize());
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
