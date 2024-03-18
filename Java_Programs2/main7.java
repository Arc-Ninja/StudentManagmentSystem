import java.lang.*;
import java.util.*;
import java.io.*;

public class main7 {
    public static void main(String[] args) {
        String arr;
        Scanner sc = new Scanner(System.in);
        arr = sc.nextLine();
        sc.close();
        String[] arr1 = arr.split(" ");
        int min = 1000000;
        for(int i=0;i<(arr1.length-1);i++){
            if(Math.abs(Integer.parseInt(arr1[i])-Integer.parseInt(arr1[i+1]))<min){
                min = Math.abs(Integer.parseInt(arr1[i])-Integer.parseInt(arr1[i+1]));
            }
        }
        System.out.println(min);

    }
}
