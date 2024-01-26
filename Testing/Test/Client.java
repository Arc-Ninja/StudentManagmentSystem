package Testing.Test;
import java.net.*;
import java.io.*;
import java.util.*;
import stud.*;
import stud.helpler.*;
public class Client {
    Socket socket;
    DataInputStream in;
    DataOutputStream out;
    ObjectOutputStream oout;
    public Client()throws Exception {
        socket = new Socket("localhost", 6666);
        in= new DataInputStream( socket.getInputStream() );
        out= new DataOutputStream( socket.getOutputStream() );
        oout= new ObjectOutputStream( socket.getOutputStream() );
        System.out.println(socket.getLocalAddress()+":"+socket.getLocalPort()+":"+socket.getPort());
        oout.writeObject(new Student(12345L, new Name("Avinash","Gupta"), new stud.helpler.Date(15,02,2002), "male"));
    }
    public void chat() throws Exception {
        Scanner cin = new Scanner(System.in);
        String msg=cin.nextLine();;
        
        out.writeUTF(msg);
        if(!msg.equals("exit")){
            msg=(String)in.readUTF();
            System.out.println(msg);
            while(!msg.equals("exit")){
                msg=cin.nextLine();
                out.flush();
                out.writeUTF(msg);
            }
        }

    } 
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        client.chat();
        client.socket.close();
    }
    
}
