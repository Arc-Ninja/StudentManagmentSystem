import java.util.Scanner;

public class main6 {
    public static void main(String[] args) {
        String s1;
        char[] carr;
        Scanner sc = new Scanner(System.in);
         s1  = sc.nextLine();
         carr = s1.toCharArray();
         int max=0, count,p1=-1,p2=-1;
         for(int i=0;i<s1.length();i++){
            int j=i;
            count = 0;
            do{
                if(carr[j]=='0'){
                    count++;
                }
                else{
                    --count;
                }
                if(count>max){
                    max = count;
                    p1=i;
                    p2=j;
                }
                j++;
            }while (count>0 && j<s1.length());
            
         }
         System.out.println(p1+" "+(p2+1));
    }
}
