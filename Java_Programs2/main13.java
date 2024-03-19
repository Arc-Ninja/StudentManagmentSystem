public class main13 {
    public static void main(String[] args) {
        int a;
        if(args.length == 0){
            java.util.Scanner in = new java.util.Scanner(System.in);
            System.out.print("enter number: ");
            a=in.nextInt();
            in.close();
        }else{
            a=Integer.parseInt(args[0]);
        }
        System.out.println(~a);
    }
}

