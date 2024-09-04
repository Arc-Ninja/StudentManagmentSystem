public class main11 {
    public static void main(String[] args) {
        int size,arr[];
        if(args.length==0){
            java.util.Scanner in = new java.util.Scanner(System.in);
            System.out.print("enter number of elements: ");
            size = in.nextInt();
            arr = new int[size];
            for(int i=0;i<size;i++){
                arr[i] = in.nextInt();
            }
            in.close();
        }else{
            size= Integer.parseInt(args[0]);
            arr=new int[size];
            for(int i=0;i<size;i++){
                arr[i]=Integer.parseInt(args[i+1]);
            }
        }
        int ans=arr[0];
        for(int i=1;i<size;i++){
            ans^=arr[i];
        }
        System.out.println(ans);
    }
}
