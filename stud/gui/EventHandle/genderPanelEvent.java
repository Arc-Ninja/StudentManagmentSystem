package stud.gui.EventHandle;
import stud.gui.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class genderPanelEvent implements ActionListener{
    public GenderPanel gender;
    public genderPanelEvent(GenderPanel gender){
        this.gender = gender;
    }
    public void actionPerformed(ActionEvent event){
        if(event.getSource()==this.gender.male){
            this.gender.genderData="male";
        }else if(event.getSource()==this.gender.female){
            this.gender.genderData="female";
        }
    }
    
}
