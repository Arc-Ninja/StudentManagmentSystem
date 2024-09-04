public class main10 {
    public static void main(String[] args) {
        int n;
        if(args.length==0){
            java.util.Scanner in = new java.util.Scanner(System.in);
            System.out.print("enter a number: ");
            n=in.nextInt();
            in.close();
        }else{
            n=Integer.parseInt(args[0]);
        }
        int k=1;
        while(true){
            if((n&k)>0){
                break;
            }
            k=k<<1;
        }
        System.out.println((int)(Math.log(k) / Math.log(2))+1);
    }
}
