

public class main2 {
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
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
            char[] c = arr[i].toCharArray();
            if(c[0]<'A'|| c[0]>'Z'){
                flag=false;
            }
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
