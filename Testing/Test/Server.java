package Testing.Test;

import java.net.*;
import java.io.*;
import stud.*;
import stud.helpler.*;
import Testing.Test.Decrypt;

class global{
    protected static int i=0;
}


class ClientHandler extends Thread {
    Socket socket;
    DataInputStream in;
    DataOutputStream out;
    ObjectInputStream oin;
    int len;
    byte data[];
    Decrypt dec;
    Student std;

    public ClientHandler(Socket socket, int i) throws Exception {
        super(String.valueOf(i));
        this.socket = socket;
        this.socket.setKeepAlive(true);
        socket = null;
        in = new DataInputStream(this.socket.getInputStream());
        out = new DataOutputStream(this.socket.getOutputStream());

        len = in.readInt();
        data = new byte[len];
        if(len>0){
            in.readFully(data, 0, len);
        }
        dec = new Decrypt(data, 1);
        std = dec.run();
        
        
        // oin = new ObjectInputStream(this.socket.getInputStream());
        // Student std = (Student) oin.readObject();
        std.showDetails();
    }

    public void run() {
        try {
            String msg = (String) in.readUTF();
            if (msg.equals("exit")) {
                socket.close();
                global.i--;
            } else {
                out.writeUTF(socket.getLocalAddress() + ":" + socket.getLocalPort());
                do {
                    System.out.println(socket.getInetAddress() + ":" + socket.getPort() + "->" + msg);
                    msg = (String) in.readUTF();
                } while (!msg.equals("exit"));
                // socket.close();
            }
        } catch (Exception e) {

        } finally {
            System.out.println(getName() + ": completed!");
        }

    }
}

public class Server {
    public ServerSocket socket;

    public Server() throws Exception {
        socket = new ServerSocket(6666);
    }

    public static void main(String[] arg) throws Exception {
        // global numth = new global();
        Thread[] threads = new Thread[10];
        Server server = new Server();
        while (true) {
            
            if (global.i <= 10) {
                Socket socket = server.socket.accept();
                threads[global.i] = new ClientHandler(socket, 100 + global.i);
                // threads[i].
                threads[global.i].start();
                socket = null;
                global.i++;
            }
            



        }

    }

}