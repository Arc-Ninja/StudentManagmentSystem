package stud.net;

import java.net.*;
import java.io.*;
import java.util.*;

import javax.print.attribute.standard.MediaSize.NA;

import stud.*;
import stud.helpler.*;
import stud.helpler.Date;

public class Client {
    Socket socket;
    DataInputStream in;
    DataOutputStream out;
    ObjectOutputStream oout;
    Encrypt enc;
    Student std;
    byte data[];
    protected int key;
    
    protected int KeyGen(int k){
        int[] keyarr = {23,67,345,98,153};
        for(int i:keyarr){
            if(i%2==0){
                k+=i;
            }
            else{
                k-=i;
            }
        }
        return k;
    }
    public Client() throws Exception {
        socket = new Socket("0.tcp.in.ngrok.io", 18077);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        // oout = new ObjectOutputStream(socket.getOutputStream());
        System.out.println(socket.getLocalAddress() + ":" + socket.getLocalPort() + ":" + socket.getPort());
        int test = 1;
        while(test!=0){test = in.readInt();
        System.out.println("this is tst: "+test);}
        key = in.readInt();
        System.err.println(key);
        key = KeyGen(key);
        System.err.println(key);
        // std = new Student(12345L, new Name("Avinash","Kumar", "Gupta"), new stud.helpler.Date(15, 02, 2002), "male", new stud.helpler.Address("Rice", "null", "null", "null", "null", 12345),new Name("A","B","C"),new Name("D","E","F"),"1234567890","abc@gmail.com");
        // std = new Student(41120025,new Name("Archi", "Shaw"),new stud.helpler.Date("13","03","2003"), "male",new Address());
        enc = new Encrypt();
        // data = enc.run();
        // out.writeInt(data.length);
        // out.write(data);
    }

    public void chat() throws Exception {
        Scanner cin = new Scanner(System.in);
        String msg = cin.nextLine();

        out.writeUTF(msg);
        if (!msg.equals("exit")) {
            msg = (String) in.readUTF();
            System.out.println(msg);
            while (!msg.equals("exit")) {
                msg = cin.nextLine();
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
