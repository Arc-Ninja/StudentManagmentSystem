// package Java_Programs3;

import java.util.Arrays;

import java.util.Collections;

public class main3 {
    public static void main(String[] args) {
        int i=0;
        int arr[];
        if(args.length==0){
            java.util.Scanner in = new java.util.Scanner(System.in);
            i = in.nextInt();
            arr = new int[i];
            for(int j=0;j<i;j++){
                arr[j] = in.nextInt();
            }
            in.close();
        }
        else{
            i = Integer.parseInt(args[0]);
            arr = new int[i];
            for(int j=0;j<i;j++){
                arr[j] = Integer.parseInt(args[j+1]);
            }

        }
        Arrays.sort(arr,0,arr.length);
        for(int j=arr.length-1;j>=0;j--){
            System.out.print(arr[j]);
        }
        System.out.println();
    }
}
