package stud;

import java.io.Serializable;
import java.util.Arrays;

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
    public byte[][] data = new byte[9][];
    public Student(long registerNo, Name studName, Date birthDate ,String gender, Address address, Name fatherName, Name motherName, String contact, String email){
        try{
            if(registerNo>-1 &&studName!=null &&gender!="" && birthDate!=null){
            this.registerNo = registerNo;
            this.studName = studName;
            this.birthDate = birthDate;
            this.gender = gender;
            }else{
                throw new Exception("resgister, name, date of birth and  should not be null");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        this.address = address;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.contact = contact;
        this.email = email;
    }
    public Student(long registerNo, Name studName, Date birDate ,String gender){
        this(registerNo, studName,birDate,gender, null, null, null,"","");
        this.address = new Address("", "", "", "", "", 0);
        this.fatherName = new Name("");
        this.motherName = new Name("");
        this.contact = "";
        this.email = "";
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
    public void Encrypt(int key){
        
        
        this.data[0] = (String.valueOf(registerNo)).getBytes();
        this.data[1] = (studName.getName()).getBytes();
        this.data[2] = (birthDate.toString()).getBytes();
        this.data[3] = gender.getBytes();
        this.data[4] = (address.getAddress()).getBytes();
        this.data[5] = (fatherName.getName()).getBytes();
        this.data[6] = (motherName.getName()).getBytes();
        this.data[7] = contact.getBytes();
        this.data[8] = email.getBytes();

        for(int i=0;i<9;i++){
            for(int j=0;j<data[i].length;j++){
                data[i][j] = (byte) (data[i][j]+key);
            }
        }

        // this.registerNo = 0;
        // this.studName = new Name("");   
        // this.birthDate = new Date("", "", "");
        // this.gender = "";
       
        // this.address = new Address("","","","","",0);
        // this.fatherName = new Name("");
        // this.motherName = new Name("");
        // this.contact = new String("");
        // this.email = new String("");
    }

    public void Decrypt(byte[][] arr, int key){
        try{
        for(int i=0;i<9;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = (byte) (arr[i][j]-key);
            }
        }
        
        this.registerNo = Long.parseLong(new String(arr[0]));     
        String[] stdn = (new String(arr[1])).split(" ");       
        this.studName = new Name(stdn[0],stdn[1],stdn[2]);      
        String[] date = (new String(arr[2])).split("/");
        this.birthDate = new Date(date[0],date[1],date[2]);
        this.gender = new String(arr[3]);
        String[] addr = (new String(arr[4])).split("|");
        this.address = new Address(addr[0], addr[1], addr[2],addr[3],addr[4],Integer.parseInt(addr[5]));
        String[] ftdn = (new String(arr[5])).split(" ");
        this.fatherName = new Name(ftdn[0],ftdn[1],ftdn[2]);
        String[] mtdn = (new String(arr[6])).split(" ");
        this.motherName = new Name(mtdn[0],mtdn[1],mtdn[2]);
        this.contact = new String(arr[7]);
        this.email = new String(arr[8]);
    }
    catch(Exception e){
        System.out.println("exception");
    }

    }

    
}