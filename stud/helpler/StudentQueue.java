package stud.helpler;
import stud.*;
import java.util.*;
public class StudentQueue {

    private  static Queue<Student> queue;
    private StudentQueue(){
        queue =  new LinkedList<Student>();
    }
    public static synchronized Queue<Student> getQueue() {
        if(Objects.isNull(queue)){
            new StudentQueue();
        }
        return queue;
    }
    
} 

