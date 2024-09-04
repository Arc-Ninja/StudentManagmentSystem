// package Java_Array;
import java.lang.*;
import java.util.*;
import java.io.*;
public class main1 {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

            if(i>0){
                if(arr[i] > arr[i-1]){
                    sum+=arr[i];
                }
                else{
                    sum+= arr[i-1];
                }
            }
        }
        System.out.println(sum);
        
    }
}
