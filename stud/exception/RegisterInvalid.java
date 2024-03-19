package stud.exception;

public class RegisterInvalid extends Exception{
    public RegisterInvalid(String message){
        super(message);
    }
    public RegisterInvalid(){
        this("Invalid register");
    }

    
}
