// package Java_Programs2;
public class main1{
    public static void main(String[] args) {
        int R;
        System.out.print("enter row of floyd's triangle: ");
        if(args.length==0){
            java.util.Scanner in = new java.util.Scanner(System.in);
            R = in.nextInt();
        }else{
            R=Integer.parseInt(args[0]);
        }
        int j=1;
        for(int i=1;i<=R;i++){
            for(int col=1;col<=i;col++){
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
        }
    }
}
