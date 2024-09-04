// package Java_Programs2;

public class main5{
    public static void main(String[] args) {
        int R;
        if(args.length==0){
            System.out.print("enter row of half hollow pyramid: ");
            java.util.Scanner in = new java.util.Scanner(System.in);
            R=in.nextInt();
        }else{
            R=Integer.parseInt(args[0]);
        }
        System.out.println("M"+"F".repeat(R-2)+"M");
        for(int i=2;i<R;i++){
            for(int j=1;j<=R;j++){
                if(j==1||j==R){
                    System.out.print("F");
                }else if(j==i||j==R-i+1){
                    System.out.print("M");
                }else{
                    System.out.print("C");
                }
            }
            System.out.println();
        }
        System.out.println("M"+"F".repeat(R-2)+"M");
    }
}
