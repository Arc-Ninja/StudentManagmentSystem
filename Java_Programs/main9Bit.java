// package Java_Programs;

public class main9Bit {
    public static void main(String[] args) {
        int num,L,R;
        if(args.length==0){
            java.util.Scanner in = new java.util.Scanner(System.in);
            System.out.print("enter intege value: ");
            num = in.nextInt();
            System.out.print("enter range L: ");
            L = in.nextInt();
            System.out.print("enter range R: ");
            R = in.nextInt();
        }else{
            num = Integer.parseInt(args[0]);
            L = Integer.parseInt(args[1]);
            R = Integer.parseInt(args[2]);

        }
        int tmp=0;
        for(int i=L;i<=R;i++){
            tmp=tmp|(1<<i-1);
        }
        System.out.println(tmp|num);

    }
    
}
