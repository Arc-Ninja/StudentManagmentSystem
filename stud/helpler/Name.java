
package stud.helpler;

public class Name {
    private String firstName, middleName, lastName;
    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    public Name(String firstName, String lastName){
        this(firstName, "", lastName);
    }
    public Name(String firstName){
        this(firstName, "", "");
    }
    public String getName(){
        return this.firstName+" "+this.middleName+" "+this.lastName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getMiddleName(){
        return this.middleName;
    }
    public String getLastName(){
        return this.lastName;
    }
}
