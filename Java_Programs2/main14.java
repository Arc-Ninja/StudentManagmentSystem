public class main14 {
    public static void main(String[] args) {
        int a;
        int b=0b1100100;
        if(args.length == 0){
            java.util.Scanner in = new java.util.Scanner(System.in);
            System.out.print("enter number: ");
            a=in.nextByte(2);
            in.close();
        }else{
            a=Byte.valueOf(args[0],2);
        }
        System.out.printf("%X\n",a);
    }
}
