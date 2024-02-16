package stud.net;

import java.util.LinkedList;
import java.util.Queue;
import stud.helpler.*;
import stud.*;
import java.net.*;
import java.io.*;

public class Sender extends Thread{
    public void run(){
        while(true){
            // System.out.println("client");
            // synchronized(StudentQueue.queue){
                if(!StudentQueue.getQueue().isEmpty()){
                    System.out.println("connect");
                    //create connection
                    while(!StudentQueue.getQueue().isEmpty()){
                        Student student = StudentQueue.getQueue().poll();
                        student.showDetails();
                        //ee
                    }

                }
            // }
        }
    }
    
}
