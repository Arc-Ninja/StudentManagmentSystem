// package Java Programs;
import java.util.*;
import java.io.*;

public class main3 {
    public static void main(String[] args) {
        
    int i1,temp,i;

    Scanner sc = new Scanner(System.in);
    i1= sc.nextInt();
    temp = i1;
    
    while(i1!=0){
    if(temp!=0){
        i = temp%10;
        
        if(i%2==0){
            System.out.print(i+" ");
        }
        temp /=10;
        if(temp==0){
            System.out.println();
        }
    }
        if(temp==0){
            i = i1%10;
            if(i%2!=0){
                System.out.print(i+" ");
            }
            i1/=10;
        }
    }

    

    }
}
