public class main9 {
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
        int _size=(size%2==0)?size:size-1;
        for(int i=0;i<_size;i+=2){
            System.out.print(arr[i+1]+" "+arr[i]+" ");
        }
        if(size%2==1){
            System.out.println(arr[size-1]);
        }System.out.println();
    }
}
