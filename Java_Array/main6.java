// package Java_Array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,min=0;
        n = sc.nextInt();
        int []x = new int[n];
        int []y = new int[n];
        for(int i=0;i<n;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();

        }
        for(int i=0;i<n-1;i++){
            min += Math.abs(x[i]-x[i+1]) + Math.abs(y[i]-y[i+1]) - 1; 
        }
        System.out.println(min);

    }
}
