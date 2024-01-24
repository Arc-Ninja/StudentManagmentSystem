import java.net.*;
import java.io.*;

class ClientHandler extends Thread{
    Socket socket;
    DataInputStream in;
    DataOutputStream out;
    public ClientHandler(Socket socket,int i) throws Exception{
        super(String.valueOf(i));
        this.socket = socket;
        this.socket.setKeepAlive(true);
        socket=null;
        in = new DataInputStream(this.socket.getInputStream());
        out = new DataOutputStream(this.socket.getOutputStream());
    }
    public void run(){
        try{
        String msg=(String)in.readUTF();
        if(msg.equals("exit")){
            socket.close();
        }
        else{
            out.writeUTF(socket.getLocalAddress()+":"+socket.getLocalPort());
            do{
                System.out.println(socket.getInetAddress()+":"+socket.getPort()+"->"+msg);
                msg=(String)in.readUTF();
            }while(!msg.equals("exit"));
            System.out.println(getName()+": completed!");
            // socket.close();
        }
        }catch(Exception e){

        }

    }
}
public class Server{
    public ServerSocket socket;
    public Server()throws Exception{
        socket = new ServerSocket(6666);
    }
    public static void main(String[] arg)throws Exception{
        Thread[] threads = new Thread[10];
        Server server = new Server();
        int i=0;
        while(i<3){
            Socket socket = server.socket.accept();
            threads[i]= new ClientHandler(socket,100+i);
            // threads[i].
            threads[i].start();
            socket=null;
            i++;
        }
        i=0;
        while(i<3){
            threads[i].join();
            i++;
        }



    }


}