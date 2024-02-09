package stud.net;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import stud.helpler.*;
import stud.*;
import java.net.*;
public class Sender extends Thread{
     public static Queue<Student> studentsQueue = new LinkedList<Student>();
    public void run(){
        while(true){
            // System.out.println("client");
            if(!studentsQueue.isEmpty()){
                System.out.println("connect");
                //create connection
                while(!studentsQueue.isEmpty()){
                    Student student = studentsQueue.poll();
                    student.showDetails();
                    //ee
                }

            }
        }
    }
    
}
