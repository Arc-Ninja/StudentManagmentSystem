package stud.net;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;

import stud.*;


public class Encrypt{
    // private Student std;
    private byte [] arr;
    // private int key;
    private ByteArrayOutputStream baos;
    private ObjectOutputStream oos;
   
    public Encrypt(){
    }

    public byte[] run(Student std,int key) throws Exception{
        baos = new ByteArrayOutputStream();
        oos = new ObjectOutputStream(baos);
        oos.writeObject(std);
        arr = baos.toByteArray();

        for(int i=0;i<arr.length;i++){
            arr[i]+=key;
        }
        return arr;
    }
    
}
