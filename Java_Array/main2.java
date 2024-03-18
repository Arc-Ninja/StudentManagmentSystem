// package Java_Array;
import java.lang.*;
import java.util.*;
import java.io.*;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sorted_arr[] = arr.clone();
       
        Arrays.sort(sorted_arr);

        for(int i:sorted_arr){
            // System.out.println(i);
            for(int j=0;j<n;j++){
                if(i==arr[j]){
                    // System.out.print(i);
                    System.out.print((j+1)+" ");
                    break;
                }
            }
        }




        // for(int i:arr){
        //     System.out.println(i);
        // }
    }
}
