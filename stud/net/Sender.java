package stud.net;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import stud.helpler.*;
import stud.*;
import java.net.*;
public class Sender extends Thread{
    public void run(){
        while(true){
            // System.out.println("client");
            synchronized(StudentQueue.queue){
                if(!StudentQueue.queue.isEmpty()){
                    System.out.println("connect");
                    //create connection
                    while(!StudentQueue.queue.isEmpty()){
                        Student student = StudentQueue.queue.poll();
                        student.showDetails();
                        //ee
                    }

                }
            }
        }
    }
    
}
