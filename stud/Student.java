package stud;

import stud.helpler.Address;
import stud.helpler.Name;

public class Student {
    protected long  registerNo=-1;
    protected Name studName;
    protected Address address;
    protected Name fatherName;
    protected Name motherName;
    protected String contact;
    protected String gender;
    public Student(long registerNo, Name studName, String gender, Address address, Name fatherName, Name motherName, String contact){
        try{
            if(registerNo>-1 &&studName!=null &&gender!=""){
            this.registerNo = registerNo;
            this.studName = studName;
            this.gender = gender;
            }else{
                throw new Exception("resgister and name should not be null");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        this.address = address;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.contact = contact;
    }
    protected Student(long registerNo, Name studName, String gender){
        this(registerNo, studName,gender, null, null, null,"");
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
    public String getContact(){
        return this.contact;
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
    
}