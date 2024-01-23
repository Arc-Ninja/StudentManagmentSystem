import java.net.*;
import java.io.*;

public class server extends Thread {
    ServerSocket ss;
    String exit = "exit";
    DataInputStream dis;
    Socket s;

    public server() throws Exception {
        ss = new ServerSocket(6666, );
    }

    public void connect() throws Exception {

        try {

            String connectivity = (String) dis.readUTF();
            System.out.println(connectivity);
            while (!connectivity.equals(exit)) {
                String data = (String) dis.readUTF();
                System.out.println(data);
                connectivity = (String) dis.readUTF();
            }
            s.close();
        } catch (Exception e) {
        }

    }

    public void listen() throws Exception {
        while (true) {
            s = ss.accept();// establishes connection
            dis = new DataInputStream(s.getInputStream());
            String key = (String) dis.readUTF();
            System.out.println(key);
            if (!key.equals("randi")) {
                s.close();
            }
        }
    }

    public void run() {
        try {
            this.connect();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) throws Exception {
        server s = new server();


        Thread lis = new Thread(new Runnable() {
            public void run() {
                try {
                    s.listen();
                } catch (Exception e) {
                }
            }
        });
        lis.start();

        s.start();

    }

}
