public class main4{
    public static void main(String[] args) {
        int value;
        if(args.length == 0){
            System.out.println("enter a integer value: ");
            java.util.Scanner in = new java.util.Scanner(System.in);
            value=in.nextInt();
        }else{
            value = Integer.parseInt(args[0]);
        }
        System.out.print("sum of digits of "+value+" is ");
        int ans=0;
        while(value != 0){
            ans+=value%10;
            value=value/10;
        }
        System.out.println(ans);
        

    }
}