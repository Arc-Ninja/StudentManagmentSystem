package stud.gui.EventHandle;
import stud.gui.*;
import stud.helpler.*;
import stud.Student;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import stud.*;
public class entryPanelEvent implements ActionListener{
    public entryPanel entry;
    public Student student;
    public entryPanelEvent(entryPanel entry) {
        this.entry = entry;
    }
    public void actionPerformed(ActionEvent event){
        if(event.getSource()==this.entry.clear){
            entry.clear();
        }
        if(event.getSource()==this.entry.submit){
            if(Integer.parseInt(this.entry.studentRresgister.TRegister.getText())!=-1
            && !this.entry.studentName.TFName.getText().equals("")
            && (!this.entry.studentGender.male.isSelected() || !this.entry.studentGender.female.isSelected())){
            }else{
                System.out.println("register empty or not number");
            }
        }
    }
}
