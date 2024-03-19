public class main1{
    public static void main(String[] args) {
        String s=null;
        String[] arr=null;
        if(args.length ==0){
            java.util.Scanner in = new java.util.Scanner(System.in);
            System.out.print("enter a sentence: ");
            s= in.nextLine();
            in.close();
        }else{
            arr = args;
        }
        if(s.length()!=0){
            arr = s.split(" ");
        }
        
        for(int i=0;i<arr.length;i++){
            if((i+1)%2!=0){
                StringBuilder sb = new StringBuilder();
                sb.append(arr[i]);
                sb.reverse();
                arr[i]=sb.toString();
            }
        }
        for(String x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}