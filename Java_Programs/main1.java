// package PlacementTrain;
import java.io.*;
import java.util.*;
public class main1 {
    public static void main(String[] args) throws Exception{
        int i1,i2;
        List<Integer> sum = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        i1 = sc.nextInt();
        i2 = sc.nextInt();
        while(i1!=0 || i2!=0){
            sum.add((i1%10+i2%10)%10);
            i1 = i1/10;
            i2 = i2/10;
        }
        if(i1!=0){
            sum.add(i1);
        }
        else{
            sum.add(i2);
        }

        for(int i=sum.size()-2;i>=0;--i){
            System.out.print(sum.get(i));
        }
    }
}
