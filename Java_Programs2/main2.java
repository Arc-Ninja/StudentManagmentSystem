// package Java_Programs2;

public class main2 {
    public static void main(String[] args) {
        int R;
        if(args.length==0){
            System.out.print("enter row of half hollow pyramid: ");
            java.util.Scanner in = new java.util.Scanner(System.in);
            R=in.nextInt();
            in.close();
        }else{
            R=Integer.parseInt(args[0]);
        }
        for(int i=1;i<R;i++){
            for(int col=1;col<=i;col++){
                if(col==1||col==i){
                    System.out.print(col);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=R;i++){
            System.out.print(i);
        }
        System.out.println();
    }
}
