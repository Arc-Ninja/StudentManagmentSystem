import java.net.*;
import java.io.*;
import java.util.*;
public class Client {
    Socket socket;
    DataInputStream in;
    DataOutputStream out;
    public Client()throws Exception {
        socket = new Socket("localhost", 6666);
        in= new DataInputStream( socket.getInputStream() );
        out= new DataOutputStream( socket.getOutputStream() );
        System.out.println(socket.getLocalAddress()+":"+socket.getLocalPort()+":"+socket.getPort());
    }
    public void chat() throws Exception {
        Scanner cin = new Scanner(System.in);
        String msg=cin.nextLine();;
        
        out.writeUTF(msg);
        if(msg!="exit"){
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
