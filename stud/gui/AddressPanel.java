package stud.gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import stud.exception.*;
public class AddressPanel extends JPanel{
    // public JLabel LLocation,LCity,LDistrict,LState,LCountry,LZipCode;
    // public JTextField TLocation,TCity,TDistrict,TState,TCountry,TZipCode;
    public JLabel LLocation;
    public JTextField TLocation;
    public JLabel[] carr;
    public JTextField[] Tarr;
    private String Larr[]={ "City","District","State", "Country", "ZipCode"};
    public AddressPanel(){
        setLayout(null);
        carr=new JLabel[5];
        Tarr=new JTextField[5];
        for(int i=0;i<5;i++) {
            carr[i]=new JLabel(Larr[i]);
        }
        for(int i=0;i<5;i++) {
            Tarr[i]=new JTextField(30);
            Tarr[i].setBorder(BorderFactory.createEmptyBorder());
        }
        LLocation = new JLabel("Location");
        TLocation = new JTextField(100);
        TLocation.setBorder(BorderFactory.createEmptyBorder());
        LLocation.setBounds(20,5,200,20);
        TLocation.setBounds(250,5,400,20);
        LLocation.setFont(new Font("Serif", Font.PLAIN, 16));
        this.add(LLocation);
        this.add(TLocation);
        int posX=20;
        int posy=-20;
        for(int i=0;i<5;i++){
            if(i%3==0){
                posX=20;
                posy+=60;
            }
            carr[i].setFont(new Font("Serif", Font.PLAIN, 16));
            carr[i].setBounds(posX, posy,200,20);
            Tarr[i].setBounds(posX, posy+30,200,20);
            posX+=250;
            this.add(carr[i]);
            this.add(Tarr[i]);
        }
        // for(int i=0;i<10;i++){
        //     if((i%3==0)){
        //         posy+=20;
        //         posX=0;
        //     }
        //     if(carr[i] instanceof JLabel){
        //         carr[i].setFont(new Font("Serif", Font.PLAIN, 16));
        //     }
        //     carr[i].setBounds(posX, posy,200,20);
        //     posX+=250;
        //     this.add(carr[i]);
        // }
        this.setBackground(new Color(0,0,0,0));
        this.setVisible(true);
        // this.setSize(new Dimension(800,140));
        
    }
    public void clear(){
        TLocation.setText("");
        for(int i=0;i<5;i++){
            Tarr[i].setText("");
        }
    }
    public boolean isEmpty()throws Exception {
        if(this.TLocation.getText().equals("")&&this.Tarr[0].getText().equals("")&&this.Tarr[1].getText().equals("")&&this.Tarr[2].getText().equals("")&&this.Tarr[3].getText().equals("")&&this.Tarr[4].getText().equals("")){
            return true;
        }else if(this.TLocation.getText().equals("")){
            throw new AddressException("enter location");
        }else if(this.Tarr[0].getText().equals("")){
            throw new AddressException("enter city");
        }else if(this.Tarr[1].getText().equals("")){
            throw new AddressException("enter district");
        }else if(this.Tarr[2].getText().equals("")){
            throw new AddressException("enter state");
        }else if(this.Tarr[3].getText().equals("")){
            throw new AddressException("enter country");
        }else if(this.Tarr[4].getText().equals("")){
            throw new AddressException("enter zipcode");
        }
        return false;
    }
}
