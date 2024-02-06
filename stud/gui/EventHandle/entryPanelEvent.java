package stud.gui.EventHandle;
import stud.gui.*;
import stud.helpler.*;
import stud.Student;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import stud.*;
import stud.exception.*;
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
            try{
                int register = Integer.parseInt(this.entry.studentRresgister.TRegister.getText());
                if(register>=10000000 && register<=99999999){
                    throw new RegisterInvalid();
                }
                if(this.entry.studentName.TFName.getText().equals("")){
                    throw new EmptyName("student first name is empty");
                }
                if(this.entry.studentGender.gender.getSelection()==null){
                    throw new EmptyGender("please select a gender");
                }
                Name studentName = new Name(this.entry.studentName.TFName.getText(), this.entry.studentName.TMName.getText(), this.entry.studentName.TLName.getText());
                stud.helpler.Date studDOB = new stud.helpler.Date(this.entry.studentDateofBirth.dayBox.getSelectedItem().toString(), this.entry.studentDateofBirth.monthBox.getSelectedItem().toString(),this.entry.studentDateofBirth.yearBox.getSelectedItem().toString());
                String gender = this.entry.studentGender.genderData;
                String Contact = this.entry.studentContact.Number.getText();
                String email = this.entry.studentContact.TEmail.getText();
                Name fatherName = new Name(this.entry.fatherName.TFName.getText(),this.entry.fatherName.TMName.getText(),this.entry.fatherName.TLName.getText());
                Name motherName = new Name(this.entry.motherName.TFName.getText(),this.entry.motherName.TMName.getText(),this.entry.motherName.TLName.getText());
                int zipcode = Integer.parseInt(this.entry.studentAddress.Tarr[4].getText());
                Address address = new Address(this.entry.studentAddress.TLocation.getText(),this.entry.studentAddress.Tarr[0].getText(),this.entry.studentAddress.Tarr[1].getText(),this.entry.studentAddress.Tarr[2].getText(),this.entry.studentAddress.Tarr[3].getText(),zipcode);
                student = new Student(register, studentName, studDOB, gender,address, fatherName,motherName,Contact,email);
            }catch(NumberFormatException e){
                System.out.println("Register should be a numerical");
            }catch(RegisterInvalid e){
                System.out.println("Register should be greater than 100"); 
            }catch(EmptyName e){
                System.out.println(e.getMessage());
            }
            catch(EmptyGender e){
                System.out.println(e.getMessage());
            }
        }
    }
}

