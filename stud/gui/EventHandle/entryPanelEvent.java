package stud.gui.EventHandle;
import stud.gui.*;
import stud.helpler.*;
import stud.Student;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import stud.*;
import stud.exception.*;
import stud.net.*;
import java.util.regex.*;;
public class entryPanelEvent implements ActionListener{
    public entryPanel entry;
    public Student student;
    public long  registerNo=-1;
    public Name studName;
    public Date birthDate;
    public Address address;
    public Name fatherName;
    public Name motherName;
    public String contact;
    public String gender;
    public String email;
    public entryPanelEvent(entryPanel entry) {
        this.entry = entry;
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource()==this.entry.clear){
            entry.clear();
        }
        if(event.getSource()==this.entry.submit){

            try{
                if(this.entry.studentRresgister.isEmpty()){
                    throw new RegisterInvalid("register is empty");
                }else{
                    if(!registerChecker(this.entry.studentRresgister.TRegister.getText())){
                        throw new RegisterInvalid();
                    }else{
                        this.registerNo=Long.parseLong(this.entry.studentRresgister.TRegister.getText());
                    }
                    if(this.entry.studentName.isEmpty()){
                        throw new EmptyName("Student name is empty");
                    }else if(this.entry.studentName.FNameIsEmpty()){
                        throw new EmptyName("Student first name is empty");
                    }else if(this.entry.studentName.MNameIsEmpty()&&this.entry.studentName.LNameIsEmpty()){
                        this.studName=new Name(this.entry.studentName.TFName.getText());
                    }else if(this.entry.studentName.MNameIsEmpty()){
                        this.studName=new Name(this.entry.studentName.TFName.getText(), this.entry.studentName.TLName.getText());
                    }else{
                        this.studName=new Name(this.entry.studentName.TFName.getText(), this.entry.studentName.TMName.getText(), this.entry.studentName.TLName.getText());
                    }
                    if(this.entry.studentGender.isSelected()){
                        throw new EmptyGender("please select gender");
                    }else{
                        this.gender=new String(this.entry.studentGender.genderData);
                    }
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

            // try{
            //     Long register = Long.parseLong(this.entry.studentRresgister.TRegister.getText().toString());
            //     if(register>=10000000 && register<=99999999){
            //         throw new RegisterInvalid();
            //     }
            //     if(this.entry.studentName.TFName.getText().equals("")){
            //         throw new EmptyName("student first name is empty");
            //     }
            //     if(this.entry.studentGender.gender.getSelection()==null){
            //         throw new EmptyGender("please select a gender");
            //     }
            //     Name studentName = new Name(this.entry.studentName.TFName.getText(), this.entry.studentName.TMName.getText(), this.entry.studentName.TLName.getText());
            //     stud.helpler.Date studDOB = new stud.helpler.Date(this.entry.studentDateofBirth.dayBox.getSelectedItem().toString(), this.entry.studentDateofBirth.monthBox.getSelectedItem().toString(),this.entry.studentDateofBirth.yearBox.getSelectedItem().toString());
            //     String gender = this.entry.studentGender.genderData;
            //     String Contact = this.entry.studentContact.Number.getText();
            //     String email = this.entry.studentContact.TEmail.getText();
            //     Name fatherName = new Name(this.entry.fatherName.TFName.getText(),this.entry.fatherName.TMName.getText(),this.entry.fatherName.TLName.getText());
            //     Name motherName = new Name(this.entry.motherName.TFName.getText(),this.entry.motherName.TMName.getText(),this.entry.motherName.TLName.getText());
            //     int zipcode = Integer.parseInt(this.entry.studentAddress.Tarr[4].getText());
            //     Address address = new Address(this.entry.studentAddress.TLocation.getText(),this.entry.studentAddress.Tarr[0].getText(),this.entry.studentAddress.Tarr[1].getText(),this.entry.studentAddress.Tarr[2].getText(),this.entry.studentAddress.Tarr[3].getText(),zipcode);
            //     student = new Student(register, studentName, studDOB, gender,address, fatherName,motherName,Contact,email);
            //     student.showDetails();
            //     synchronized(StudentQueue.queue){
            //         StudentQueue.queue.offer(student);
            //     }
            // }catch(NumberFormatException e){
            //     System.out.println("Register should be a numerical\n"+e.getStackTrace());
            //     // e.getStackTrace();
            // }catch(RegisterInvalid e){
            //     System.out.println("Register should be greater than 100"); 
            // }catch(EmptyName e){
            //     System.out.println(e.getMessage());
            // }
            // catch(EmptyGender e){
            //     System.out.println(e.getMessage());
            // }
        }
    }
    public boolean registerChecker(String str) {
        Pattern pattern = Pattern.compile("[0-9]+");
        return pattern.matcher(str).matches();
    }
    public Name studentName(NamePanel name) {
        return new Name("name");
    }
}

