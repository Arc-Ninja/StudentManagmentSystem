
public class main12{
    // public static int max(int a, int b){
    //     return (a & (~((a - b) >> 31))) | (b & ((a - b) >> 31));
    // }
    public static void main(String[] args) {
        int a,b;
        if(args.length == 0){
            java.util.Scanner in = new java.util.Scanner(System.in);
            System.out.print("enter first number: ");
            a=in.nextInt();
            System.out.print("enter second number: ");
            b=in.nextInt();
            in.close();
        }else{
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
        }
        System.out.println((a & (~((a - b) >> 31))) | (b & ((a - b) >> 31)));
    }
}