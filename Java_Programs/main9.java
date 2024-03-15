import java.util.Scanner;

public class main9 {
    public static void main(String[] args) {
        int l,r,n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        l = sc.nextInt();
        r = sc.nextInt();
        String s = Integer.toBinaryString(n);
       
        char[] c = s.toCharArray();
        for(int i = l;i<=r;i++){
            
            c[i] = '1';

        }
       
        s = new String(c);
        
        n = Integer.parseInt(s,2);
        System.out.println(n);
        


    }
}
