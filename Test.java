import java.util.Arrays;
import java.io.*;
import stud.*;
import stud.helpler.*;
public class Test {

    public static void main(String[] args) throws Exception{
        // long str = 5000;
        // String str2 = "Hello this is a bitch!";
        // byte[][] bytar = new byte[2][];
        // bytar[0] = (String.valueOf(str)).getBytes();
        // bytar[1] = str2.getBytes();
        // System.out.println(Arrays.toString(bytar[1]));
        // System.out.println(bytar[0][3]);
        
        //encrypt
    //     for(int i=0;i<str.length();i++){

    //         if(bytar[i]>=65 && bytar[i]<=90){
    //         bytar[i] = (byte) (((((int) bytar[i])+5)%91));
    //         }
    //         else if(bytar[i]>=97 && bytar[i]<=122){
    //             bytar[i] = (byte) (((((int) bytar[i])+5)%123));
    //         }
    //         else{
    //             continue;
    //         }
            
    //     }
    //     System.out.println(Arrays.toString(bytar));

    //     String newstr = new String(bytar);
    //     System.out.println(newstr);

    //     bytar = newstr.getBytes();
    //     System.out.println(Arrays.toString(bytar));

    //     //decrypt
    //     for(int i=0;i<str.length();i++){

    //         bytar[i] = (byte) ((int) bytar[i] - 17);
            
    //     }
    //     System.out.println(Arrays.toString(bytar));



    // Student stu = new Student(12345, new Name("Archi"), new stud.helpler.Date("01","03","2004"), "male");
    Student stu = new Student(12345, new Name("Archi"), new stud.helpler.Date("01","03","2004"), "male", new Address("A", "B", "C", "D", "E", 1234),new Name("ABC"),new Name("DEF"),"1234567890","arc@gamil.com");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(baos);
    oos.writeObject(stu);
    byte [] arr = baos.toByteArray();

    for(byte i:arr){
        System.out.print(i+" ");
    }
    System.out.println();
    System.out.println();
    arr = Encrypt(arr);

    // for(byte i:arr){
    //     System.out.print(i+" ");
    // }
    arr = Decrypt(arr);
    ByteArrayInputStream bais = new ByteArrayInputStream(arr);
    ObjectInputStream ois = new ObjectInputStream(bais);

    Student test = (Student) ois.readObject();
    test.showDetails();








    }
















    public static byte[] Encrypt( byte[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]+=5;
        }


        return arr;
    }
    public static byte[] Decrypt( byte[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]-=5;
        }


        return arr;
    }
}

