// package Java_Programs;

public class main8 {
    static final int odd = 0x55555555;
    static final int even =0xAAAAAAAA;
    public static void main(String[] args) {
        int num;
        if(args.length==0){
            java.util.Scanner in = new java.util.Scanner(System.in);
            System.out.println("enter 32 bit integer value: ");
            num = in.nextInt();
        }else{
            num = Integer.parseInt(args[0]);
        }
        int o = (num & odd)<<1;
        int e = (num & even)>>1;
        System.out.println((o|e));

    }
}
