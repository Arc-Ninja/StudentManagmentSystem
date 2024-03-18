public class main7 {

    public static void main(String[] args) {
        int n,k;
        if(args.length==0){
            java.util.Scanner in = new java.util.Scanner(System.in);
            System.out.print("enter a integer value: ");
            n = in.nextInt();
            System.out.print("enter how many times right swift to perform: ");
            k=in.nextInt();
            in.close();
        }else{
            n=Integer.parseInt(args[0]);
            k=Integer.parseInt(args[1]);
        }
        System.out.println((n>>k));
        System.out.printf("%.2f\n",(double)n/(1<<k));
    }
}