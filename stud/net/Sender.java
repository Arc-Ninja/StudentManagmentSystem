package stud.net;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import stud.helpler.*;
import stud.*;
import java.net.*;
import java.io.*;

public class Sender extends Thread{
    private Client client;
    private Student student;
    public void run() {
        while(true){
            // System.out.println("client");
            // synchronized(StudentQueue.queue){
                if(!StudentQueue.getQueue().isEmpty() || student!=null){
                    System.out.println("connect");
                    //create connection
                    try {
                        if(Objects.isNull(client)){
                            client = new Client();
                        }
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    while(!StudentQueue.getQueue().isEmpty() || student!=null){
                        if(Objects.isNull(student)){
                            student = StudentQueue.getQueue().poll();
                        }
                        student.showDetails();
                        try{
                            // client.enc.run(student,client.key);
                            client.out.write(client.enc.run(student,client.key));
                            if(client.in.readBoolean()){
                                student=null;
                            }
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                        //ee
                    }

                }
            // }
        }
    }
    
}
