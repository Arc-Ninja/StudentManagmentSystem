

public class main6 {
    public static void main(String[] args) {
        int rows;
        if(args.length==0){
            java.util.Scanner in = new java.util.Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            rows = in.nextInt();
        }else{
            rows=Integer.parseInt(args[0]);
        }
        int i;
        for(i=1;i<=(rows%2==0?(rows/2):(rows/2)+1);i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("%");
            }
            System.out.println();
        }
        for(i=rows-i+1;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("%");
            }
            System.out.println();
        }

        
    }
}

