import java.util.Scanner;

public class main7 {
    public static void main(String[] args) {
        int i,count=0;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        while(i>0){
            if(i%2!=0){
                count++;
            }
            i/=2;
        }
        System.out.println(count);
    }
}
