import java.util.*;
import java.io.*;
public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1,i2;
        i1 = sc.nextInt();
        i2 = sc.nextInt();
        do {
            if(i2==0){
                break;
            }
            System.out.println(i1);
            --i2;
        } while (i2>0);
    }
}
