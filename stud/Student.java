package stud;

import java.io.Serializable;


import stud.helpler.Address;
import stud.helpler.Name;
import stud.helpler.Date;

public class Student implements Serializable{
    protected long  registerNo=-1;
    protected Name studName;
    protected Date birthDate;
    protected Address address;
    protected Name fatherName;
    protected Name motherName;
    protected String contact;
    protected String gender;
    protected String email;
    public Student(long registerNo, Name studName, Date birthDate ,String gender, Address address, Name fatherName, Name motherName, String contact, String email)throws Exception {
        if(registerNo>-1 &&studName!=null &&gender!="" && birthDate!=null){
        this.registerNo = registerNo;
        this.studName = studName;
        this.birthDate = birthDate;
        this.gender = gender;
        }else{
            throw new Exception("resgister, name, date of birth and  should not be null");
        }
        this.address = address;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.contact = contact;
        this.email = email;
    }
    public Student(long registerNo, Name studName, Date birthDate, String gender,Address address,Name fatherName,Name motherName,String contact)throws Exception{
        this(registerNo, studName, birthDate, gender,address,fatherName,motherName,contact,null);
    }
    public Student(long registerNo, Name studName, Date birthDate, String gender,Address address,Name fatherName,Name motherName)throws Exception{
        this(registerNo, studName, birthDate, gender,address,fatherName,motherName,null);
    }
    public Student(long registerNo, Name studName, Date birthDate, String gender,Address address,Name fatherName)throws Exception{
        this(registerNo, studName, birthDate, gender,address,fatherName,null);
    }
    public Student(long registerNo, Name studName, Date birthDate, String gender,Address address) throws Exception{
        this(registerNo, studName, birthDate, gender,address,null);
    }
    public Student(long registerNo, Name studName, Date birDate ,String gender)throws Exception{
        this(registerNo, studName,birDate,gender,null);
        // this.address = new Address("", "", "", "", "", 0);
        // this.fatherName = new Name("");
        // this.motherName = new Name("");
        // this.contact = "";
        // this.email = "";
    }

    public long getRegisterNo(){
        return this.registerNo;
    }
    public Name getStudName() {
        return this.studName;
    }
    public String getGender(){
        return this.gender;
    }
    public Address getAddress(){
        return this.address;
    }
    public Name getFatherName(){
        return this.fatherName;
    }
    public Name getMotherName(){
        return this.motherName;
    }
    public Date getBirDate() {
        return this.birthDate;
    }
    public String getContact(){
        return this.contact;
    }
    public String getEmail(){
        return this.email;
    }
    public boolean setAddress(Address address){
        try{
        this.address=address;
        return true;
        }catch(Exception e){
            return false;
        }
    }
    public boolean setContact(String contact){
        try{
            this.contact=contact;
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public boolean setEmail(String email){
        try{
            this.email=email;
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public void showDetails(){
        System.out.println(this.registerNo+" "+this.studName.getName()+" "+this.gender+" "+this.birthDate.toString()+" "+ this.address.getAddress()+" "+this.fatherName.getName()+" "+this.motherName.getName()+" "+this.contact+" "+this.email);
    }
    
}