// package Java_Programs;

public class main10 {
    public static void main(String[] args) {
        int num;
        if(args.length==0){
            java.util.Scanner in = new java.util.Scanner(System.in);
            System.out.println("enter a number: ");
            num = in.nextInt();
        }else{
            num =Integer.parseInt(args[0]);
        }
        if(num%8==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
