package stud.gui.EventHandle;
import stud.gui.*;
import stud.helpler.*;
import stud.Student;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class entryPanelEvent implements ActionListener{
    public entryPanel entry;
    public entryPanelEvent(entryPanel entry) {
        this.entry = entry;
    }
    public void actionPerformed(ActionEvent event){
        if(event.getSource()==this.entry.clear){
            entry.clear();
        }
    }
}
