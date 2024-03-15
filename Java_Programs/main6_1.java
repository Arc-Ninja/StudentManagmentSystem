// package Java_Programs;

public class main6_1 {
    public static void main(String[] args) {
        String str;
        if(args.length==0){
            java.util.Scanner in = new java.util.Scanner(System.in);
            str = in.next();
        }else{
            str = args[0];
        }
        int  count=0,max=0;
        int start=0,end=0;
        for(int i=0;i<str.length();i++){
            count=0;
            if(str.charAt(i)=='0'){
                int j=i+1;
                count++;
                while(count>0 && j<str.length()){
                    if(str.charAt(j)=='0'){
                        count++;
                    }else{
                        count--;
                    }
                    j++;
                    if(count>max){
                        start=i;
                        end=j;
                        max=count;
                    }
                }
                
            }
        }
        System.out.println(start+" "+end);

    }
    
}
