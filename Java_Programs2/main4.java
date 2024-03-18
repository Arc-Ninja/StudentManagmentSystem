// package Java_Programs2;

public class main4{
    public static void printChar(int a,String s){
        s=s!=null?s:"b";
        for(int i=1;i<=a;i++){
            System.out.print(s);
        }
    }
    public static void main(String[] args) {
        System.out.print("enter row of half hollow pyramid: ");
        int R;
        if(args.length==0){
            java.util.Scanner in = new java.util.Scanner(System.in);
            R=in.nextInt();
        }else{
            R=Integer.parseInt(args[0]);
        }
        for(int i=1;i<R;i++){
            printChar(R-i, null);
            for(int col=1;col<i*2;col++){
                System.out.print("*");
            }
            printChar(R-i, null);
            System.out.println();
        }
        for(int i=1;i<=R*2;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
