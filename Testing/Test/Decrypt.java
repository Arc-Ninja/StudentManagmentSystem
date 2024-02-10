package Testing.Test;
import java.io.*;

import stud.*;


import stud.*;
public class Decrypt {
    private byte [] arr;
    private int key;
    private ByteArrayInputStream bais;
    private ObjectInputStream ois;
    private Student std;

    public Decrypt(byte[] arra, int k){
        this.arr = arra;
        this.key = k;
    }

    public Student run() throws Exception{
        for(int i=0;i<arr.length;i++){
            arr[i]-=key;
        }
        bais = new ByteArrayInputStream(arr);
        ois = new ObjectInputStream(bais);
        std = (Student) ois.readObject();
        return std;


    }
    
}
