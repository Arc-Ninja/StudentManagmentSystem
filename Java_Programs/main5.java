public class main5 {
    public static void main(String[] args) {
        int first,second;
        if(args.length ==2){
            first =Integer.parseInt(args[0]);
            second =Integer.parseInt(args[1]);
        }else{
            java.util.Scanner in = new java.util.Scanner(System.in);
            System.out.println("enter two integers value: ");
            first = in.nextInt();
            second = in.nextInt();
        }
        int hcf;
        for(hcf = java.lang.Math.min(first, second);hcf>0;hcf--){
            if(first%hcf==0 && second%hcf==0){
                break;
            }

        }
        System.out.println("HCF of "+first+" and "+second+" is "+hcf);
        
    }
}
